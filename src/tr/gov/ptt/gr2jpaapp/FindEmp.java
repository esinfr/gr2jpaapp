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
public class FindEmp {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
        
         Employee e =em.find(Employee.class,1);
        if(e!=null){
          
            System.out.println(e.getEid()+"-"+e.getEname());
        }else{
            System.out.println("Girilen id li kullanıcı yok");
        }
        
      
        em.close();
        emf.close();
        
    }

    
}
