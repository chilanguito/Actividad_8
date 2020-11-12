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
public class Termometro {

    private final int constant = 32;
    private final double constant2 = 1.8;
    private final double constant3 = 459.67;
    
    public double convertFahrenheitToCelsius(double f){
            return (f-constant)/constant2;
    }
    
    public double convertCelsiusToFahrenheit(double c){
        return (constant2)*(c+constant);
    }
    
    public double convertFahrenheitToKelvin(double f){
        return (f+constant3)/constant2;
    }
    
    public double convertKelvinToFahrenheit(double k){
        return (9/5*k)-constant3;
    }
}
