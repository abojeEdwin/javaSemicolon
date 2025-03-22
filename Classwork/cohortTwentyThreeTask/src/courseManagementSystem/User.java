package courseManagementSystem;

public class User {
     String fullName;
     String email;
     String password;

    public User(String name, String email, String password) {
        this.fullName = name;
        this.email = email;
        this.password = password;

    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public String getFullName() {
        return fullName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
}
