package ref;

public class TaxCalculator implements ICalculateTax{

    private static final double RATE_1 = 0.23; // Up to 28,000 €
    private static final double RATE_2 = 0.33; // From 28,001 € to 50,000 €
    private static final double RATE_3 = 0.43; // Over 50,000 €
    private static final double RATE_4 = 0.01;

    private static final double LIMIT_1 = 28000;
    private static final double LIMIT_2 = 50000;
    private static final double LIMIT_3 = 75000;

    @Override
    public double calculateTax(double yearlyIncome){
        double taxes = 0;

        if (yearlyIncome <= LIMIT_1) {taxes = yearlyIncome * RATE_1
            ;
        } else if (yearlyIncome <= LIMIT_2) {
            taxes = (LIMIT_1 * RATE_1) + ((yearlyIncome - LIMIT_1) * RATE_2);
        } else if (yearlyIncome <= LIMIT_3){
            taxes = (LIMIT_1 * RATE_1) + ((LIMIT_2 - LIMIT_1) * RATE_2) + ((yearlyIncome - LIMIT_2) * RATE_3);
        } else{
            taxes = (LIMIT_1 * RATE_1) + ((LIMIT_2 - LIMIT_1) * RATE_2) + ((LIMIT_3 - LIMIT_2) * RATE_3) + ((yearlyIncome - LIMIT_3) * RATE_4);
        }

        return taxes;
    }
    
}
