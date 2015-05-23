/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr2jpaapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Administrator
 */

@Entity
@NamedQuery(name="Employee.idIleMaasBul",query ="select e.salary from Employee e where e.eid=:p_id")
public class Employee {
    
    @Id
    @SequenceGenerator(name="eidseq", sequenceName = "SEQ_EMPLOYEE",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eidseq")
    private Integer eid;
    private String ename;
    private Double salary;
    private String deg;

    public Employee() {
    }
    

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }
     
}
