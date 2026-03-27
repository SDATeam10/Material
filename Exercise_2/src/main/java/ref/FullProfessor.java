package ref;

import java.time.LocalDate;

public class FullProfessor extends Employee{

    //private TaxCalculator taxCalculator;

    public FullProfessor(LocalDate employmentDate, String surname, String name, int id) {
        super(employmentDate, surname, name, id);
        this.baseSalary = 5000;
        this.yearsMultiplier = 50;
    }

}