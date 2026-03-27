package ref;

import java.time.LocalDate;

public interface IEmployee {

    public LocalDate getDateEmployment();
    public String getSurname();
    public String getName();
    public int getId();
    public double getBaseSalary();
    public double getYearsMultiplier();
    
}
