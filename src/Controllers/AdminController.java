package Controllers;

import Models.User;

import java.util.Date;

public class AdminController extends User {

    private User admin;

    public AdminController(int id, String username, String name, String password, String nic, String address, String tpn, String category, String gender, Date startDate, String position, String location, String salaryType, double salary) {
        super(id, username, name, password, nic, address, tpn, category, gender, startDate, position, location, salaryType, salary);
        this.admin = new User(id, username, name, password, nic, address, tpn, category, gender ,startDate, position, location, salaryType, salary);
    }

    public void addEmployee() {
        System.out.println("Employee added");
    }

    public void removeEmployee() {
        System.out.println("Employee removed");
    }

    public void updateEmployee() {
        System.out.println("Employee updated");
    }

    public void viewEmployee() {
        System.out.println("Employee viewed");
    }

    public void loggedIn() {

        System.out.println("name: " + admin.getName());
        System.out.println("Admin logged in");
    }
}
