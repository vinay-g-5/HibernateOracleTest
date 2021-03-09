package com.globalss.hibernatsamp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  
                
        Student s=new Student();   
        s.setId(101);    
        s.setName("Gaurav");      
        try {
            SessionFactory sessionFactory = new Configuration().configure("/hibernatsamp/src/main/java/hibernate.cfg.xml").buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(s);
            session.getTransaction().commit();

        } catch(HibernateException e) {
            e.printStackTrace();
        }
    }
}
