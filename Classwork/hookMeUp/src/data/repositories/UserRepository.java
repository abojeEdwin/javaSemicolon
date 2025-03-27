package data.repositories;
import data.models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    List<User> findAll();
    long count();
    void delete(User user);
    void deleteAll(List<User>users);
    List<User>findByIds(List<Integer> ids);
    void delete(int id);
    User findUserById(int id);
    boolean existByUserName(String userName);
}
