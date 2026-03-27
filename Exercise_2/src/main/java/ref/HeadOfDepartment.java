package ref;

import java.time.LocalDate;

public class HeadOfDepartment extends Employee{

    //private TaxCalculator taxCalculator;

    private double extra = 800;

    public HeadOfDepartment(LocalDate employmentDate, String surname, String name, int id) {
        super(employmentDate, surname, name, id);
        this.baseSalary = 5000 + extra;
        this.yearsMultiplier = 50;
    }

    public double getExtra(){
        return this.extra;
    }

}