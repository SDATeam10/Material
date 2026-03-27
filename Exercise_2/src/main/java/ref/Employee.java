package ref;

import java.time.LocalDate;

public class Employee implements IEmployee{

    private LocalDate employmentDate;
    private String surname;
    private String name;
    private int id;
    protected double baseSalary;
    protected double yearsMultiplier;

    public Employee(LocalDate employmentDate, String surname, String name, int id){
        this.employmentDate = employmentDate;
        this.surname = surname;
        this.name = name;
        this.id = id;
    }

    @Override
    public LocalDate getDateEmployment() {
        return this.employmentDate;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getId(){
        return this.id;
    }

    @Override
    public double getBaseSalary(){
        return this.baseSalary;
    }

    @Override
    public double getYearsMultiplier(){
        return this.yearsMultiplier;
    }
}
