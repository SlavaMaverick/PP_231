package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO jpaUserDAO;

    @Autowired
    public UserServiceImpl(UserDAO jpaUserDAO) {
        this.jpaUserDAO = jpaUserDAO;

        // стартовая таблица лиу
        jpaUserDAO.addUser(new User("Пётр", "Первый", 44));
        jpaUserDAO.addUser(new User("Николай", "Второй", 350));
        jpaUserDAO.addUser(new User("Alexandr", "Tretiy", 41));
        jpaUserDAO.addUser(new User("Иван", "Грозный", 23));
    }

    @Override
    public void addUser(User user) {
        jpaUserDAO.addUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return jpaUserDAO.getUserById(id);
    }

    @Override
    public void updateUserById(Long id, User user) {
        jpaUserDAO.updateUserById(id, user);
    }

    @Override
    public void deleteUserById(Long id) {
        jpaUserDAO.deleteUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return jpaUserDAO.getAllUsers();
    }
}