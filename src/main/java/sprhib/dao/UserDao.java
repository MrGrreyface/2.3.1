package sprhib.dao;

import sprhib.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void update(User user);
    void deleteUserById(Long id);

}
