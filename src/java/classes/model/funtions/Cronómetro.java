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
public class Cronómetro {
    
    private final double value = 60;
    
    public double convertSecondToMinutes(double seconds){
        return seconds/value;
    }
    
    public double convertSecondToHours(double seconds){
        return this.convertSecondToMinutes(this.convertSecondToMinutes(seconds));
    }
    
    public double convertMinutesToSeconds(double minutes){
        return minutes*value;
    }
    
    public double convertMinutesToHours(double minutes){
        return minutes/value;
    }
    
    public double convertHoursToSeconds(double hours){
        return this.convertMinutesToSeconds(this.convertMinutesToSeconds(hours));
    }
    
    public double convertHoursToMinutes(double hours){
           return this.convertMinutesToSeconds(hours);
    }
    
    
    
}
