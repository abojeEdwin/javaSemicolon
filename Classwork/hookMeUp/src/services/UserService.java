package services;

import data.models.User;

public interface UserService {

    User register(String userName, String userPassword);
    boolean login(String userName, String userPassword);
    User searchByUserName(String userName);
    void addToCart(User user);
    User viewAllSingles();
    String chat(String message);
    void rateUser(int rate, String userName);
    void payBridePrice(int price, String userName);
}
