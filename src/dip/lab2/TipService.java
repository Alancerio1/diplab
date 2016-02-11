/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author alancerio18
 */
public class TipService {
    private TipCalculator tipcalcuator;

    public TipService(TipCalculator tipcalcuator) {
        this.tipcalcuator = tipcalcuator;
    }

    public TipCalculator getTipcalcuator() {
        return tipcalcuator;
    }

    public void setTipcalcuator(TipCalculator tipcalcuator) {
        this.tipcalcuator = tipcalcuator;
    }
    
    
}
