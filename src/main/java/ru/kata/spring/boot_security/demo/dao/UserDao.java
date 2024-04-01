package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
/*    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(long userId);

    void updateUser(long id, User user);

    User getUser(long userId);*/
    User findByUsername(String username);
}

