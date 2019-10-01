package chap5;

public class CreditCard {
    private double mininumSalary;

    private CreditCard(double mininumSalary) {
        this.mininumSalary = mininumSalary;
    }
    
    public static CreditCard creditCardInstance(double minimumSalary){
        if (minimumSalary >= 15000) {
            return new CreditCard(minimumSalary);
        } else {
            return null;
        }    
    }
}
