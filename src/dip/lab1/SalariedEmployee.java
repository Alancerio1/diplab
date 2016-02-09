package dip.lab1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class SalariedEmployee implements Employee {

    private double salaryRate = 10.00;
    private double annualBonus = 5;

    @Override
    public double annualWages() {
        return salaryRate + annualBonus;
    }
    
 
    
    


    
}
