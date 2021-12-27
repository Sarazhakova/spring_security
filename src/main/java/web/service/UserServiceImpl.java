package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void removeUser(long id) {
        userDAO.removeUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }
}
