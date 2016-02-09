package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {

    private double bill = 15.00;
    private double tip = .15;
    
    
    @Override
    public double amountPayed() {
        return bill * tip;
    }
    




}
