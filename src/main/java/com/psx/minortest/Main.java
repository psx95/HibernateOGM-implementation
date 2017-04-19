/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psx.minortest;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;



/**
 *
 * @author Pranav
 */
public class Main {
    
    public static void main (String Args[]){
      TransactionManager transactionManager = com.arjuna.ats.jta.TransactionManager.transactionManager();
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("personogm");
      EntityManager em = emf.createEntityManager();
        try {
            transactionManager.begin();
            Person person = new Person();
            person.setName("Siddharth Parashar");
            person.setBirthdate("05/07/1996");
            person.setNumber(9914103215l);
            person.setTitle("Music");
            person.setEmail("siddharth.parashar@gmail.com");
            person.setCountry("India");
            em.persist(person);
            em.flush();
            em.close();
            transactionManager.commit();
            System.out.println ("\n saved");
        } catch (NotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SystemException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RollbackException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeuristicMixedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeuristicRollbackException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        emf.close();
//        // now starting work on hibernate ORM 
//        SessionFactory factory = HibernateUtil.getSessionFactory();
//        Session session = factory.openSession();
//        Transaction transaction = null;
//        try{
//            transaction = session.beginTransaction();
//            Person2 person = new Person2();
//            person.setBirthdate("01/09/1995");
//            person.setCountry("India");
//            person.setEmail("pranav.ps95@hotmail.com");
//            person.setName("pranav");
//            person.setPhonenumber(8376003776l);
//            person.setTitle("PSX");
//            session.save(person);
//            transaction.commit();
//            System.out.println ("\n Successfully inserted values in RDBMS");            
//        }
//        catch (HibernateException exception){
//            exception.printStackTrace();
//            System.out.println ("\n There was some error saving the values");
//        }
    }
}
