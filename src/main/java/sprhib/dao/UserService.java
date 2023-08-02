package sprhib.dao;

import sprhib.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void update(long id, User user);
    void deleteUserById(Long id);
}
