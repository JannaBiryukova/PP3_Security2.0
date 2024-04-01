/*
package ru.kata.spring.boot_security.demo.dao;


import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.models.User;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select user from User user ", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(long userId) {
        entityManager.remove(entityManager.find(User.class, userId));
    }

    @Override
    public void updateUser(long id, User userUpdate) {
        getUser(id).setFirstname(userUpdate.getFirstname());
        getUser(id).setLastname(userUpdate.getLastname());
        getUser(id).setEmail(userUpdate.getEmail());
        entityManager.merge(getUser(id));
    }


    @Override
    public User getUser(long userId) {
        return entityManager.find(User.class, userId);
    }

    public User findByUsername(String username) {
        try {
            return entityManager.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class)
                    .setParameter("username", username)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }


}
*/
