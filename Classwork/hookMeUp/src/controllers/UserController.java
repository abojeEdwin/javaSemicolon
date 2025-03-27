package controllers;
import services.UserServiceImpl;
import services.UserService;
import data.models.User;

public class UserController {
   final private UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }

    public User register(String userName, String password){
       return userServiceImpl.register(userName, password);
    }

    public boolean login(String userName, String password){
        return userServiceImpl.login(userName,password);
    }

}