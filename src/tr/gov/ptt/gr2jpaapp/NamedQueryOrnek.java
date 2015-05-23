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
public class NamedQueryOrnek {
    
     public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
       
        Query q = em.createNamedQuery("Employee.idIleMaasBul");
        
        q.setParameter("p_id", 2);
        Double maas=(Double)q.getSingleResult();
        
         System.out.println("Maaş"+maas);
         
         java.util.Date tarih=(java.util.Date)em.createNativeQuery("select to_char(sysdate,'DD/MM/YYYY Day','NLS_DATE_LANGUAGE=TURKISH') from dual").getSingleResult();
         System.out.println("Tarih:"+tarih);
      
        em.close();
        emf.close();
        
    }
    
    
}
