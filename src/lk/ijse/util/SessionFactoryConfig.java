package lk.ijse.util;

import lk.ijse.hms.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class SessionFactoryConfig {
    private static lk.ijse.hms.util.SessionFactoryConfig sessionFactoryConfig;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Room.class);
        configuration.addAnnotatedClass(Reservation.class);
        configuration.addAnnotatedClass(User.class);

        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
        } catch (IOException e) {
            System.out.println("file not found");
        }
        configuration.mergeProperties(properties);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static lk.ijse.hms.util.SessionFactoryConfig getInstance() {
        return (sessionFactoryConfig == null) ?
                sessionFactoryConfig = new lk.ijse.hms.util.SessionFactoryConfig() :
                sessionFactoryConfig;
    }

    public final Session getSession(){
        return sessionFactory.openSession();
    }

}
