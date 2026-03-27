package ref;

import java.time.LocalDate;

public class Researcher extends Employee{

    //private TaxCalculator taxCalculator;

    public Researcher(LocalDate employmentDate, String surname, String name, int id) {
        super(employmentDate, surname, name, id);
        this.baseSalary = 2000;
        this.yearsMultiplier = 10;
    }

}