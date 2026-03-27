package ref;

import java.time.LocalDate;
import java.time.Period;

public class SalaryCalculator implements ICalculateSalary{

    private ICalculateTax taxCalculator;

    @Override
    public double calculateSalary(IEmployee e){
        LocalDate starDate = e.getDateEmployment();
        Period period = Period.between(starDate, LocalDate.now());
        int years = period.getYears();
        double salary= e.getBaseSalary() + (years*e.getYearsMultiplier());
        return salary;
    }

    @Override
    public double getSalaryAfterTax(IEmployee e){

        double monthlySalary = this.calculateSalary(e);
        double yearlyIncome = monthlySalary*12;
        double yearlyTax = taxCalculator.calculateTax(yearlyIncome);
        double monthlyTax = yearlyTax /12;
        return monthlySalary -monthlyTax;
        
    }
    
}
