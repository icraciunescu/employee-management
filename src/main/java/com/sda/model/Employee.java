package com.sda.model;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 40)
    private String name;

    @Column (name = "hire_date", length = 40)
    private String hire_date;

    @Column (name = "department",  length = 40)
    private String department;

    @Column (name = "manager", length = 40)
    private String manager;

    @Column (name = "want_deleted", length = 40)
    private String want_deleted;


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
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

    public String getWant_deleted() {
        return want_deleted;
    }

    public void setWant_deleted(String want_deleted) {
        this.want_deleted = want_deleted;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hire_date='" + hire_date + '\'' +
                ", department='" + department + '\'' +
                ", manager='" + manager + '\'' +
                ", want_deleted='" + want_deleted + '\'' +
                '}';
    }
}
