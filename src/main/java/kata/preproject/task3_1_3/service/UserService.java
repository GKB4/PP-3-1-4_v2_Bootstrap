package kata.preproject.task3_1_3.service;

import kata.preproject.task3_1_3.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    void save(User user);

    User getUser(String username);

    User getUserById(long id);

    List<User> getUsers();

    void deleteUser(long id);

    User updateUser(User user) throws Exception;
}
