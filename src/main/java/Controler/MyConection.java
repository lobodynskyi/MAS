package Controler;

import Models.Klient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.Query;
import java.time.LocalDate;

public class MyConection {
    public static void saveData(Object o){

        StandardServiceRegistry sr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata mt = new MetadataSources(sr).getMetadataBuilder().build();
        SessionFactory sf = mt.getSessionFactoryBuilder().build();

        Session ss = sf.openSession();
        ss.beginTransaction();
        ss.save(o);
        ss.getTransaction().commit();


        ss.close();
    }


    public static void find(String s){

        StandardServiceRegistry sr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();
        Metadata mt = new MetadataSources(sr).getMetadataBuilder().build();
        SessionFactory sf = mt.getSessionFactoryBuilder().build();

        Session ss = sf.openSession();
        ss.beginTransaction();
        Query query = ss.createQuery(s);
//        ((org.hibernate.query.Query) query).list().forEach(x-> System.out.println(x.toString()));
        ss.getTransaction().commit();


        ss.close();
    }
}
