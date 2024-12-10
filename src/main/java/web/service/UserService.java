package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    void saveUser(User user);
    void removeUserById(long id);
    List<User> getUsers();
    User getUser(long id);
}
