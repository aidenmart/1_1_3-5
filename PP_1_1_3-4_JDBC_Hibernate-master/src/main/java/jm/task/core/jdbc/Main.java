package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;



public class Main {
    public static void main(String[] args)  {
        UserService userService
                = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("User1", "LastName1", (byte) 10);
        userService.saveUser("User2", "LastName2", (byte) 15);
        userService.saveUser("User3", "LastName3", (byte) 20);
        userService.saveUser("User4", "LastName4", (byte) 25);
        userService.getAllUsers();
        userService.removeUserById(3);
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeSessionFactory();
    }
}