package web.service;

import web.model.User;
import java.util.List;

public interface UserService {

    void addUser(User user);

    User getUserById(Long id);

    void updateUserById(Long id, User user);

    void deleteUserById(Long id);

    List<User> getAllUsers();
}