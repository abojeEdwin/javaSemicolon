package services;

import data.models.User;
import data.repositories.Users;

public class UserServiceImpl implements UserService  {
     Users users;

    public UserServiceImpl(Users users) {
        this.users = users;
    }

    @Override
    public User register(String userName, String userPassword) {
        User user = new User(userName,userPassword);
        if(users.existByUserName(userName)){
            throw new IllegalArgumentException("User name already exists");
        }
        user.setUsername(userName);
        user.setPassword(userPassword);
        return users.save(user);
    }

    @Override
    public boolean login(String userName, String userPassword) {
        User user = new User(userName, userPassword);
        if(!userName.equalsIgnoreCase(user.getUsername()))throw new IllegalArgumentException("User name does not match, please register.");
        return true;
    }

    @Override
    public User searchByUserName(String userName) {
        return null;
    }

    @Override
    public void addToCart(User user) {

    }

    @Override
    public User viewAllSingles() {
        return null;
    }

    @Override
    public String chat(String message) {
        return "";
    }

    @Override
    public void rateUser(int rate, String userName) {

    }

    @Override
    public void payBridePrice(int price, String userName) {

    }
}
