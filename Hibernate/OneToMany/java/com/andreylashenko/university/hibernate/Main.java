package com.andreylashenko.university.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(University.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();



        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        University university1 = session.get(University.class, 1);
        System.out.println("Name: " + university1.getName());
        System.out.println("Students:");
        for (Student s : university1.getStudents()) {
            System.out.println(s.getName());
        }
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
