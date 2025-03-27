package data.models;


public class User {
    int id;
    String username;
    String password;

    Profile profile;

    public String getUsername() {
        return username;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {return password;}

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String userName, String password) {
        this.username = userName;
        this.password = password;
        this.profile = new Profile();
    }

}
