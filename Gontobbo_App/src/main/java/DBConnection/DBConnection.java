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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author DCL
 */
public class DBConnection {
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
            // Parse the date string to LocalDateTime 
            DateTimeFormatter inputFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; 
            LocalDateTime localDateTime = LocalDateTime.parse(date, inputFormatter);
            
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateStr = localDateTime.format(outputFormatter);
            
            LocalDateTime formattedDateTime = LocalDateTime.parse(formattedDateStr, outputFormatter);
            
            Timestamp timestamp = Timestamp.valueOf(formattedDateTime);
            System.out.println(formattedDateTime);
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

    // public void getAll(Connection connection, String tableName) throws SQLException {
    //     String selectSQL = "SELECT * from " + tableName;
    //     Statement stmt = connection.createStatement();
    //     ResultSet rs = stmt.executeQuery(selectSQL);
        
    //     System.out.println("--------------- " + tableName + "-----------------------");
    //     while(rs.next()) {
    //         System.out.println(rs.getString("username"));
    //         System.out.println(rs.getString("password"));
    //     }
    //     System.out.println("");
    // }

    public List<Map<String, String>> getAllTrips(Connection connection , String tableName) throws SQLException {
        String selectSQL = "SELECT * from " + tableName;
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

    public static void main(String[] args) {

    }
}
