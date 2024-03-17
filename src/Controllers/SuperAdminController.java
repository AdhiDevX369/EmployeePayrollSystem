package Controllers;

import Models.User;

import java.util.Date;

public class SuperAdminController extends User {

    private User superAdmin;

    public SuperAdminController(int id,String username, String name, String password, String nic, String address, String tpn, String category, String gender, Date startDate, String position, String location, String salaryType, double salary) {
        super(id, username, name, password, nic, address, tpn, category, gender, startDate, position, location, salaryType,salary);
        superAdmin = new User(id,username, name, password, nic, address, tpn, category, gender, startDate, position, location, salaryType, salary);

    }

    public void addAdmin() {
        System.out.println("Admin added");
    }

    public void removeAdmin() {
        System.out.println("Admin removed");
    }

    public void updateAdmin() {
        System.out.println("Admin updated");
    }

    public void viewAdmin() {
        System.out.println("Admin viewed");
    }

    public void loggedIn() {
        System.out.println("name: " + superAdmin.getName());
        System.out.println("SuperAdmin logged in");
    }
}
