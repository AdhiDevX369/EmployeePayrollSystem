package View;

import Controllers.SuperAdminController;
import Models.User;

public class SuperAdminDashboard {

    private SuperAdminController superAdmin;
    public SuperAdminDashboard(User user){
        superAdmin = new SuperAdminController(user.getId(),user.getUsername(), user.getName(), user.getPassword(), user.getNic(), user.getAddress(), user.getTpn(), user.getCategory(), user.getGender(), user.getStartDate(), user.getPosition(), user.getLocation(), user.getSalaryType(), user.getSalary());
    }

    public void login(){
        superAdmin.loggedIn();
    }
}
