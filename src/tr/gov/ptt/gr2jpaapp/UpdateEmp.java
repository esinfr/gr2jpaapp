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
public class UpdateEmp {
      public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
        
         Employee e =em.find(Employee.class,1);
         
          System.out.println("Update den önce maaş"+e.getSalary());
         
         em.getTransaction().begin();
         e.setSalary(5000.0);
         em.getTransaction().commit();
         System.out.println("Update den sonra maaş"+e.getSalary());
   
      
        em.close();
        emf.close();
        
    }
    
}
