package View;

import Controllers.AdminController;
import Models.User;

public class AdminDashboard {

    private AdminController admin;
    public AdminDashboard(User user){
        admin = new AdminController(user.getId(),user.getUsername(), user.getName(), user.getPassword(), user.getNic(), user.getAddress(), user.getTpn(), user.getCategory(), user.getGender(), user.getStartDate(), user.getPosition(), user.getLocation(), user.getSalaryType(), user.getSalary());
    }

    public void login(){

        admin.loggedIn();
    }
}
