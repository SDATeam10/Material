package ref;

import java.time.LocalDate;

public class AssociateProfessor extends Employee{

    //private TaxCalculator taxCalculator;

    public AssociateProfessor(LocalDate employmentDate, String surname, String name, int id) {
        super(employmentDate, surname, name, id);
        this.baseSalary = 3000;
        this.yearsMultiplier = 20;
    }

}
