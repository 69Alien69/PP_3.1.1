package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository

public interface UserDAO {
    void saveUser(User user);
    void removeUserById(long id);
    List<User> getUsers();
    User getUser(long id);
}
