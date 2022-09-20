package com.andreyliashenko.autoshop.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(UsersDetails.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        // Creation an object
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        User user1 = new User("test1" , "test1", "test1");
//        User user2 = new User("test2" , "test1", "test1");
//        User user3 = new User("test3" , "test1", "test1");
//        session.save(user1);
//        session.save(user2);
//        session.save(user3);
//        session.getTransaction().commit();

        // Read
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        User user1 = session.get(User.class, 2);
//        System.out.println(user1);
//        session.getTransaction().commit();

        // Update
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        User user1 = session.get(User.class, 4);
//        user1.setLastname("Klark");
//        session.getTransaction().commit();

        // Delete
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        User user1 = session.get(User.class, 1);
//        session.delete(user1);
//        session.getTransaction().commit();

        // Creation Query
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        User user1 = session.createQuery("select i from User i where i.id = 2", User.class)
//                .getSingleResult();
//
//        List<User> listUsers = session.createQuery("SELECT i FROM User i", User.class).getResultList();
//        System.out.println(listUsers);
//        System.out.println(user1);
//        session.getTransaction().commit();

        // getting details of user

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        User user1 = session.get(User.class, 4);
        System.out.println(user1);
        System.out.println(user1.getDetails());
        session.getTransaction().commit();
    }

}
