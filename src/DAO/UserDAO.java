package DAO;

import Models.User;
import Controllers.DBController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAO {
    private final DBController dbController;

    public UserDAO() {
        dbController = new DBController();
    }

    // AuthenticateUser Method
    public User authenticateUser(String username, String password) {
        User authenticatedUser = null;
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection connection = dbController.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                authenticatedUser = extractUserFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authenticatedUser;
    }

    // Helper method to extract User object from ResultSet
    private User extractUserFromResultSet(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String username = resultSet.getString("username");
        String name = resultSet.getString("name");
        String password = resultSet.getString("password");
        String nic = resultSet.getString("nic");
        String address = resultSet.getString("address");
        String tpn = resultSet.getString("tpn");
        String category = resultSet.getString("category");
        String gender = resultSet.getString("gender");
        Date startDate = resultSet.getDate("start_date");
        String position = resultSet.getString("position");
        String location = resultSet.getString("location");
        double salary = resultSet.getDouble("salary");
        String salaryType = resultSet.getString("salary_type");
        return new User(id, username, name, password, nic, address, tpn, category, gender, startDate, position, location, salaryType, salary);
    }

    // Method to retrieve all users
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users";

        try (Connection connection = dbController.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User user = extractUserFromResultSet(resultSet);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
