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
public class CreateEmp {
    
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
        
        
        
        
        Employee emp1 = new Employee();
        emp1.setEid(2);
        emp1.setEname("Yeni Bora Yuret");
        emp1.setSalary(123.45);
        emp1.setDeg("7-1");
        
        em.getTransaction().begin();
        //em.persist(emp1);
        em.merge(emp1);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
}
