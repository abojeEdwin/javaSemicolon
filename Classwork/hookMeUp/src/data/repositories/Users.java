package data.repositories;
import java.util.ArrayList;
import java.util.List;
import data.models.User;

public class Users implements UserRepository{

    List<User> users = new ArrayList<>();

    public User save(User user) {
      users.add(user);
        return user;
    }

    public List<User>findAll() {
        return users;
    }

    public long count() {
        return users.size();
    }

    public void delete(User user) {
        if(user == null){
            throw new IllegalArgumentException("user cannot be null");
        }
        users.remove(user);
    }

    @Override
    public void deleteAll(List<User> users) {
        this.users.removeAll(users);
    }

    @Override
    public List<User> findByIds(List<Integer> ids) {
        for(User user : users){
            if(ids.contains(user.getId())){
                return users;
            }
        };
        return null;
    }

    public void delete(int id) {
        if(findUserById(id) == null){
            throw new IllegalArgumentException("user cannot be null");
        }
        users.removeIf(user -> user.getId() == id);

    }

    public User findUserById(int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean existByUserName(String userName) {
        for(User user : users) {
            if(user.getUsername().equalsIgnoreCase(userName)){
                return true;
            }
        }
        return false;
    }

}
