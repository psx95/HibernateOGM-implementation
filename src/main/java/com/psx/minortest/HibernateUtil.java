/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psx.minortest;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Pranav
 */
public class HibernateUtil {
private static  SessionFactory sessionFactory;
	
	
	static {
		
		try {
		Configuration configuration = new Configuration();
configuration.configure();

ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(
    configuration.getProperties()).build();

SessionFactory sf = configuration.buildSessionFactory(sr);
sessionFactory = sf;
		}catch(Throwable ex){
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
	}
	
}
