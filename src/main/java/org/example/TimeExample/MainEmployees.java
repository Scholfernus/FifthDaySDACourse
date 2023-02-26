package org.example.TimeExample;

import java.time.LocalDate;

public class MainEmployees {
    public static void main(String[] args) {
    Employee employee = new Employee("Henry",33, LocalDate.of(2020,1,2));
    Employee employee2 = new Employee("Mike",29, LocalDate.of(2018,5,7));
    Employee employee3 = new Employee("Johny",50, LocalDate.of(2015,12,15));

    print(employee);
    print(employee2);
    print(employee3);
    }

    static void print(Employee employee) {
        if (BonusCheck.check(employee)) {
            System.out.println("Pracownikowi " + employee.getFullName() + " przysługuje bonus.");
        }else{
            System.out.println("Pracownikowi " + employee.getFullName() + " nie przysługuje bonus.");
        }
    }

}
