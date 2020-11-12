/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.model.funtions;

/**
 *
 * @author diegonarvaez
 */
public class Cinta_metrica {

    private final double value = 100.0;
    private final double value2 = 1000.0;

    public double convertCmToM(double cm) {
        return cm / value;
    }

    public double convertCmToKm(double cm) {
        return this.convertCmToM(this.convertCmToM(cm));
    }

    public double convertMToCm(double m) {
        return m * value;
    }

    public double convertMToKm(double m) {
        return m / value2;
    }

    public double convertKmToCm(double km) {
        return km * value * value2;
    }
    
    public double convertKmToM(double km){
    return km*value2;
    }
    
    
}
