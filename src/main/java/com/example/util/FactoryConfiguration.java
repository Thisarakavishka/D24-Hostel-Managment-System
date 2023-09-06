package com.example.util;

import com.example.entity.Reservation;
import com.example.entity.Room;
import com.example.entity.Student;
import com.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;

    private SessionFactory sessionFactory;

    private FactoryConfiguration() {
        //add configuration file
        Configuration configuration = new Configuration();

        //add properties
        Properties properties = new Properties();

        //add already created hibernate file to properties in current thread
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("hibernate.properties"));;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //add properties to configure
        configuration.setProperties(properties);

        //add annotated class to configure
        configuration.addAnnotatedClass(Student.class)
                .addAnnotatedClass(Room.class)
                .addAnnotatedClass(Reservation.class)
                .addAnnotatedClass(User.class);

        //build session factory
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
