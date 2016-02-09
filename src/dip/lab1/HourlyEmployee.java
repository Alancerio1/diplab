package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public  class HourlyEmployee implements Employee {
    
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee() {}
    private double hourlyRate = 8.00;
    private double totalHrsForYear = 2.00;

  

 

   

    @Override
   public double annualWages(){
        return hourlyRate * totalHrsForYear;
    }

 

}
