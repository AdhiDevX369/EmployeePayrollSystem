package Controllers;

import Models.User;

import java.util.Date;

public class EmployeeController extends User {

   private User employee;

    public EmployeeController(int id, String username, String name, String password, String nic, String address, String tpn, String category, String gender, Date startDate, String position, String location, String salaryType, double salary) {
        super(id, username, name, password, nic, address, tpn, category, gender, startDate, position, location, salaryType, salary);
        employee = new User(id, username, name, password, nic, address, tpn,category, gender, startDate, position, location, salaryType, salary);
    }

    public void loggedIn() {
        System.out.println("name: " + employee.getName());
        System.out.println("Employee logged in");
    }
}
