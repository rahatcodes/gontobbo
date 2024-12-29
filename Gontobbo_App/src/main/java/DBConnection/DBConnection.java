/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author DCL
 */
public class DBConnection extends Utilities {
    private Connection connection;

    // create new db if db doesn't exist and create the tables
    public void createDb() {
        try {
            String filePath = "gontobbo_db.sqlite3";
            String sqlFilePath = "src/main/java/Resources/dbSchema.sql";
            
            File sqliteFile = new File(filePath);
            if(!sqliteFile.exists()) {
                Connection cn = DriverManager.getConnection("jdbc:sqlite:" + filePath);
                if(cn != null) {
                    System.out.println("new db created");
                    executeSqlFile(cn, sqlFilePath);
                    
                    cn.close();
                } else {
                    System.out.println("Something went wrong while creating the db");
                }
            } else {
                System.out.println("db exists");
            }
        } catch(Exception e) {
            System.out.println(e + "not ok");
        }
    }
    
    // execute sql file
    private static void executeSqlFile(Connection connection, String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder sqlBuilder = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sqlBuilder.append(line);
                if (line.trim().endsWith(";")) {
                    executeSqlStatement(connection, sqlBuilder.toString());
                    sqlBuilder.setLength(0); // Clear the builder for the next statement
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // execute sql statement
    private static void executeSqlStatement(Connection connection, String sql) {
        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);
            System.out.println("Executed: " + sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Connect to SQLite database
    public void connect() {
        this.createDb();
        try {
            // URL to SQLite database file
            String url = "jdbc:sqlite:gontobbo_db.sqlite3";
            // Create a connection to the database
            connection = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Disconnect from SQLite database
    public void disconnect() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Connection to SQLite has been closed.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Get the connection object
    public Connection getConnection() {
        return connection;
    }
    
    // authenticate user
    public boolean authenticateUser(String userType, String username, String password) {
        boolean isAuthenticated = false;
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        try {
            String query = "SELECT * FROM " + userType +  " WHERE username = ? AND password = ?";

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            try(ResultSet rs = pstmt.executeQuery()) {
                isAuthenticated =  rs.next();
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }        
        db.disconnect();
        return isAuthenticated;
    }
    
    
    public int getNewTripId() {
        int tripId = 0;
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        try {
            String query = "SELECT id FROM trip ORDER BY id DESC LIMIT 1";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            
            try(ResultSet rs = pstmt.executeQuery()) {
                tripId = rs.getInt("id");
            }
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        db.disconnect();
        
        return tripId;
    }
    
    
    // create new trip
    public boolean createTrip(String from, String to, String date, String type, String category, double price) {
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        System.out.println(date);
        
        try {
            Timestamp timestamp = getFormattedDate(date);
            System.out.println(timestamp);
            String query = "INSERT INTO trip (from_location, to_location, start_time, price, total_seats, available_seats, seat_type, trip_category) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, from);
            pstmt.setString(2, to);
            pstmt.setTimestamp(3, timestamp);
            pstmt.setDouble(4, price);
            pstmt.setInt(5, 40);
            pstmt.setInt(6, 40);
            pstmt.setString(7, type);
            pstmt.setString(8, category);
            
            
            pstmt.executeUpdate();
            
            System.out.println("Trip added successfully");
            db.disconnect();
            return true;
        } catch(SQLException e) {
            db.disconnect();
            e.printStackTrace();
            return false;
        }
    }
    

    // update trip
    public boolean updateTrip(int tripId, String from, String to, String date, String type, String category, double price) {
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        
        try {
            Timestamp timestamp = getFormattedDate(date);
            String query = "UPDATE trip SET from_location = ?, to_location = ?, start_time = ?, price = ?, seat_type = ?, trip_category = ? WHERE id = ? ORDER BY id ASC LIMIT 1";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, from);
            pstmt.setString(2, to);
            pstmt.setTimestamp(3, timestamp);
            pstmt.setDouble(4, price);
            pstmt.setString(5, type);
            pstmt.setString(6, category);
            pstmt.setInt(7, tripId);
            
            pstmt.executeUpdate();
            
            System.out.println("Trip updated successfully");
            db.disconnect();
            return true;
        } catch(SQLException e) {
            db.disconnect();
            e.printStackTrace();
            return false;
        }
    }

    // remove trip
    public boolean removeTrip(int tripId) {
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        
        try {
            String query = "DELETE FROM trip WHERE id = ?";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, tripId);
            
            pstmt.executeUpdate();
            
            System.out.println("Trip removed successfully");
            db.disconnect();
            return true;
        } catch(SQLException e) {
            db.disconnect();
            e.printStackTrace();
            return false;
        }
    }

    // get all trips
    public List<Map<String, String>> getAllTrips(Connection connection , String tableName) throws SQLException {
        String selectSQL = "SELECT * from " + tableName + " ORDER BY id DESC";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(selectSQL);
        
        List<Map<String, String>> result = new ArrayList<>();

        while(rs.next()) {
            Map<String, String> row = new HashMap<>();
            row.put("id", rs.getString("id"));
            row.put("from", rs.getString("from_location"));
            row.put("to", rs.getString("to_location"));
            row.put("start_time", rs.getString("start_time"));
            row.put("type", rs.getString("trip_category"));
            row.put("seat", rs.getString("seat_type"));
            result.add(row);
        }
        return result;
    }


    // get trip details
    public Map<String, String> getTripDetails(int tripId) {
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        
        try {
            String query = "SELECT * FROM trip WHERE id = ?";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, tripId);
            
            try(ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()) {
                    Map<String, String> row = new HashMap<>();
                    row.put("id", rs.getString("id"));
                    row.put("from", rs.getString("from_location"));
                    row.put("to", rs.getString("to_location"));
                    row.put("start_time", rs.getString("start_time"));
                    row.put("available_seats", rs.getString("available_seats"));
                    row.put("category", rs.getString("trip_category"));
                    row.put("type", rs.getString("seat_type"));
                    row.put("price", rs.getString("price"));
                    db.disconnect();
                    return row;
                }
            }
        } catch(SQLException e) {
            db.disconnect();
            e.printStackTrace();
        }
        db.disconnect();
        return null;
    }


    // create booking
    public int createBooking(Map<String, String> tripDetails) {
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        
        try {
            String query = "INSERT INTO booking (passenger_name, passenger_phone, passenger_nid, total_seats, total_price, seller_id, trip_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, tripDetails.get("name"));
            pstmt.setString(2, tripDetails.get("phone"));
            pstmt.setString(3, tripDetails.get("nid"));
            pstmt.setInt(4, Integer.parseInt(tripDetails.get("totalSeats")));
            pstmt.setDouble(5, Double.parseDouble(tripDetails.get("price")));
            pstmt.setInt(6, 1);
            pstmt.setInt(7, Integer.parseInt(tripDetails.get("id")));
            
            pstmt.executeUpdate();
            
            pstmt = con.prepareStatement("UPDATE trip SET available_seats = available_seats - ? WHERE id = ?");
            pstmt.setInt(1, Integer.parseInt(tripDetails.get("totalSeats")));
            pstmt.setInt(2, Integer.parseInt(tripDetails.get("id")));

            pstmt.executeUpdate();

            pstmt = con.prepareStatement("SELECT id FROM booking ORDER BY id DESC LIMIT 1");
            ResultSet rs = pstmt.executeQuery();
            int bookingId = rs.getInt("id");

            System.out.println("Booking added successfully");
            db.disconnect();
            return bookingId;
        } catch(SQLException e) {
            db.disconnect();
            e.printStackTrace();
            return 0;
        }
    }


    // get all bookings
    public List<Map<String, String>> getAllBookings() {
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        
        try {
            // String query = "SELECT (id, passenger_name, passenger_phone, start_time) FROM booking ORDER BY id DESC JOIN trip ON booking.trip_id = trip.id";
            String query = "SELECT booking.id, passenger_name, passenger_phone, start_time, total_price FROM booking JOIN trip ON booking.trip_id = trip.id ORDER BY booking.id DESC";
            PreparedStatement pstmt = con.prepareStatement(query);
            
            try(ResultSet rs = pstmt.executeQuery()) {
                List<Map<String, String>> result = new ArrayList<>();
                while(rs.next()) {
                    Map<String, String> row = new HashMap<>();
                    row.put("id", rs.getString("id"));
                    row.put("name", rs.getString("passenger_name"));
                    row.put("phone", rs.getString("passenger_phone"));
                    row.put("date", rs.getString("start_time"));
                    row.put("price", rs.getString("total_price"));
                    result.add(row);
                }
                db.disconnect();
                return result;
            }
        } catch(SQLException e) {
            db.disconnect();
            e.printStackTrace();
        }
        db.disconnect();
        return null;
    }


    // refund booking
    public boolean refundBooking(int bookingId) {
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        
        try {
            String query = "SELECT * FROM booking WHERE id = ?";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bookingId);
            
            try(ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()) {
                    int tripId = rs.getInt("trip_id");
                    int totalSeats = rs.getInt("total_seats");
                    
                    pstmt = con.prepareStatement("DELETE FROM booking WHERE id = ?");
                    pstmt.setInt(1, bookingId);
                    pstmt.executeUpdate();
                    
                    pstmt = con.prepareStatement("UPDATE trip SET available_seats = available_seats + ? WHERE id = ?");
                    pstmt.setInt(1, totalSeats);
                    pstmt.setInt(2, tripId);
                    pstmt.executeUpdate();
                    
                    System.out.println("Booking refunded successfully");
                    db.disconnect();
                    return true;
                }
            }
        } catch(SQLException e) {
            db.disconnect();
            e.printStackTrace();
        }
        db.disconnect();
        return false;
    }

    // check if a trip is available
    public int isTripAvailable(String from, String to, String tripType, String tripCategory, String tripDate) {
        DBConnection db = new DBConnection();
        db.connect();
        
        Connection con = db.getConnection();
        Timestamp timestamp = getFormattedDate(tripDate);
        try {
            String query = "SELECT * FROM trip WHERE from_location = ? AND to_location = ? AND trip_category = ? AND seat_type = ? AND start_time = ? AND available_seats > 0";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, from);
            pstmt.setString(2, to);
            pstmt.setString(3, tripCategory);
            pstmt.setString(4, tripType);
            pstmt.setTimestamp(5, timestamp);
            
            
            try(ResultSet rs = pstmt.executeQuery()) {
                if(rs.next()) {
                    int id = rs.getInt("id");
                    db.disconnect();
                    System.out.println("Trip available");
                    return id;
                }
            }


        } catch(SQLException e) {
            db.disconnect();
            e.printStackTrace();
            System.out.println("Trip not available");
            return 0;
        }
        db.disconnect();
        return 0;
    }

    public static void main(String[] args) {

    }
}


abstract class Utilities {
    public static Timestamp getFormattedDate(String date) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; 
        LocalDateTime localDateTime = LocalDateTime.parse(date, inputFormatter);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateStr = localDateTime.format(outputFormatter);

        LocalDateTime formattedDateTime = LocalDateTime.parse(formattedDateStr, outputFormatter);

        Timestamp timestamp = Timestamp.valueOf(formattedDateTime);
        
        return timestamp;
    }

    public static String timeStampConverter(String timestampStr) {
        // Input timestamp in milliseconds
        
        long timestamp = Long.parseLong(timestampStr);

        // Convert timestamp to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());

        // Define the output formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the LocalDateTime to the desired output format
        String formattedDateTime = dateTime.format(formatter);

        // Print the formatted date-time string
        System.out.println("Formatted Date-Time: " + formattedDateTime);
        return formattedDateTime;
    }
}