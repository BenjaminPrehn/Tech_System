package com.managment.palladium.entities;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name="employee_seq",sequenceName="employee_seq", allocationSize = 1)
    private long employeeId;

    private String firstname;
    private String lastname;
    private String email;

    public Employee() {
    }

    public Employee(String firstname, String lastname, String email) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
