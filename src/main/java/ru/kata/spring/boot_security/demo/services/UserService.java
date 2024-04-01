package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;


@Service
public interface UserService extends UserDetailsService {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(long userId);
    void updateUser(long id, User user);
    User getUser(long userId);
    User findByUsername(String name);
}
