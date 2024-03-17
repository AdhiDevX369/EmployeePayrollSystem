package Controllers;

import Models.User;

public class MainController {
    public static void main(String[] args) {
        //Test the User Controller and get data
        UserController userController = new UserController();
        userController.redirectLogin("admin", "admin123");
        userController.redirectLogin("employee", "employee123");
        userController.redirectLogin("superAdmin", "superadmin123");
    }
}