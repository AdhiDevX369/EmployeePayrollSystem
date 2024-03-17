package Controllers;

import DAO.UserDAO;
import Models.User;
import View.AdminDashboard;
import View.EmployeeDashboard;
import View.SuperAdminDashboard;

public class UserController {

    private UserDAO userDAO;

    public UserController() {
        userDAO = new UserDAO();
    }

    public boolean redirectLogin(String username, String password) {
        User authenticatedUser = userDAO.authenticateUser(username, password);
        if (authenticatedUser != null) {
            if (authenticatedUser.getCategory().equals("admin")) {
                openAdminDashboard(authenticatedUser);
            } else if (authenticatedUser.getCategory().equals("employee")) {
                openEmployeeDashboard(authenticatedUser);
            } else if (authenticatedUser.getCategory().equals("super_admin")) {
                openSuperAdminDashboard(authenticatedUser);
            }
            return true;
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
            return false;
        }
    }

    private void openSuperAdminDashboard(User authenticatedUser) {
        SuperAdminDashboard superAdminDashboard = new SuperAdminDashboard(authenticatedUser);
        superAdminDashboard.login();
    }

    private void openEmployeeDashboard(User authenticatedUser) {
        EmployeeDashboard employeeDashboard = new EmployeeDashboard(authenticatedUser);
        employeeDashboard.login();
    }

    private void openAdminDashboard(User authenticatedUser) {
        AdminDashboard adminDashboard = new AdminDashboard(authenticatedUser);
        adminDashboard.login();
    }
}
