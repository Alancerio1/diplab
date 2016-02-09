package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator{
        private double tip = .15;
        private double bagCount = 10;

    @Override
    public double amountPayed() {
        return tip * bagCount;
    }
  


  

   

  

}
