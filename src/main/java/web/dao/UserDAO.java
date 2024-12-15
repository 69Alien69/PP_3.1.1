package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);
    void updateUser(User user);
    void removeUserById(long id);
    List<User> getUsers();
    User getUser(long id);
}
