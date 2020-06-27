package service;

import org.springframework.security.core.userdetails.User;

public interface UserService {

    void save(User user);

    model.User findByUsername(String username);
}
