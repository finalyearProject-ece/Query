package com.example.proj2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Queries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String age;
    private String active;
    private Long phonenumber =  (long) (Math.random()*Math.pow(10, 10));
    private String designation;
    private Long salary = (long) (Math.random()*Math.pow(10, 10));
    
    public Queries() {
    }

    

    public Queries(Long id, String name, String age, String active, Long phonenumber, String designation, Long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
        this.phonenumber = phonenumber;
        this.designation = designation;
        this.salary = salary;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }
    public Long getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Queries [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + ", phonenumber="
                + phonenumber + ", designation=" + designation + ", salary=" + salary + "]";
    }


}
