package net.codejava;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernateoracletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Configuration config=new Configuration();
     config.setProperty("hibernate.connection.driver_class","oracle.jdbc.driver.oracleDriver");
     config.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:xe");
     config.setProperty("hibernate.connection.username","system");
     config.setProperty("hibernate.connection.password","12345");
     config.setProperty("hibernate.dialect", "org.hibernate.dialect.oracle8iDialect");
     config.addAnnotatedClass(Student.class);
     
     SessionFactory sessionfactory=config.buildSessionFactory();
     Session session=sessionfactory.openSession();
	Transaction transaction=session.beginTransaction();
	session.save(new Student( "vinay G"));
	transaction.commit();
	session.close();
	sessionfactory.close();
	
	}

}
