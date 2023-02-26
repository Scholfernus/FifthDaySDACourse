package org.example.TimeExample;

import java.time.LocalDate;

public class BonusCheck {
    public static final int MINIMUM_YEAR_OF_EMPLOYEE = 7;
    public static boolean check(Employee worker ){
        LocalDate dateAfterEmployeeGetBonus = worker.getDateOfEmployment().plusYears(MINIMUM_YEAR_OF_EMPLOYEE);
        return LocalDate.now().isAfter(dateAfterEmployeeGetBonus);
    }

}
