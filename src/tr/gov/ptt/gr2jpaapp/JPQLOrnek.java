/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr2jpaapp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrator
 */
public class JPQLOrnek {
    
     public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
        
         Query q=em.createQuery("Select UPPER(e.ename) from Employee e");
         List<String> nameList=q.getResultList();
         
         for (String name : nameList) {
             
             System.out.println(name);
             
         }
         
         Query q2 = em.createQuery("select max(e.salary) from Employee e");
         
         
         Double sonuc = (Double) q2.getSingleResult();
         
         System.out.println("En yüksek maaş:"+sonuc);
      
        em.close();
        emf.close();
        
    }
    
}
