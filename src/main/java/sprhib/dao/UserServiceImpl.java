package sprhib.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sprhib.model.User;
import sprhib.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserRepository repository;


    @Autowired
    public UserServiceImpl(UserRepository repository) {
        super();
        this.repository = repository;
    }
@Override
    public List<User> getAllUsers() {
        return (List<User>) repository.findAll();
    }
@Override
public User getUserById(Long id) {
        Optional<User> foundPerson = repository.findById(id);
        return foundPerson.orElse(null);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        repository.save(user);
    }

    @Transactional
    public void update(long id, User user) {
        user.setId(id);
        repository.save(user);
    }

    @Transactional
    public void deleteUserById(Long id) {
        repository.deleteById(id);
    }
}