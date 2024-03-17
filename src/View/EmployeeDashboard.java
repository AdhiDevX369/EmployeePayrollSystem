package View;

import Controllers.EmployeeController;
import Models.User;

public class EmployeeDashboard {

    private EmployeeController employee;

    public EmployeeDashboard(User user) {
        employee = new EmployeeController(user.getId(),user.getUsername(), user.getName(), user.getPassword(), user.getNic(), user.getAddress(), user.getTpn(), user.getCategory(), user.getGender(), user.getStartDate(), user.getPosition(), user.getLocation(), user.getSalaryType(), user.getSalary());
    }

    public void login() {
        employee.loggedIn();
    }
}
