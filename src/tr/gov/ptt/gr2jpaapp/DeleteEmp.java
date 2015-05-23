/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr2jpaapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import tr.gov.ptt.gr2jpaapp.entity.Employee;

/**
 *
 * @author Administrator
 */
public class DeleteEmp {
    
     public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
        
         Employee e =em.find(Employee.class,3);      
        
         em.getTransaction().begin();
         em.remove(e);
         em.getTransaction().commit();
     
   
      
        em.close();
        emf.close();
     }
    
}
