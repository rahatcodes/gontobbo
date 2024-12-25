/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    // authenticate admin
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
    
    public void getAll(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * from " + tableName;
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(selectSQL);
        
        System.out.println("--------------- " + tableName + "-----------------------");
        while(rs.next()) {
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
        }
        System.out.println("");
        
    }

    public static void main(String[] args) {
//        SQLiteConnection db = new SQLiteConnection();
//        db.connect();
//        // Perform database operations
//        db.disconnect();
        DBConnection db = new DBConnection();
        db.connect();
        Connection connection = db.getConnection();
        try {

            db.getAll(connection, "admin");
            
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}
