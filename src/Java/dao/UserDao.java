package dao;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);

    void save(org.springframework.security.core.userdetails.User user);
}
