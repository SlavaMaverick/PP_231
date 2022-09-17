package web.dao;

import web.model.User;
import java.util.List;

public interface UserDAO {
    void addUser(User user);

    User getUserById(Long id);

    void updateUserById(Long id, User user);

    void deleteUserById(Long id);

    List<User> getAllUsers();
}