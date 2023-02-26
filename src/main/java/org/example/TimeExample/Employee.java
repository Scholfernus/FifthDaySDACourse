package org.example.TimeExample;

import java.time.LocalDate;

public class Employee {
    private String fullName;
    private int age;
    private LocalDate dateOfEmployment;

    public Employee(String fullName, int age, LocalDate dateOfEmployment) {
        this.fullName = fullName;
        this.age = age;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}
