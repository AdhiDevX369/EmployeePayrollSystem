    package Controllers;

    // Import libraries
    import com.sun.source.tree.SynchronizedTree;

    import java.sql.*;

    public class DBController {
        // JDBC URL, username, and password of MySQL server
        private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employedb";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "ABandara2001";

        // JDBC variables for opening and managing connection
        private Connection connection;
        private static DBController instance;

        // Constructor
        public DBController() {
            estabilishConnection();
        }

        private void estabilishConnection() {
            try {
                // Establish the connection
                connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static synchronized DBController getInstance() {
            if (instance == null) {
                instance = new DBController();
            }
            return instance;
        }

        public Connection getConnection() {
            try{
                if(connection==null || connection.isClosed()){
                    estabilishConnection();
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }
            return connection;
        }

    }
