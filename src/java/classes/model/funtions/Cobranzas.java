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
public class Cobranzas {

    public double cajaRegistradora(double montoTotal, double pagoEfectuado) {
        return montoTotal - pagoEfectuado;
    }

    public double[] descuento(double precioArticulo) {
        double descuento = 0.0;

        descuento = (precioArticulo * 12)/100;

        double[] array = new double[2];

        array[0] = descuento;

        array[1] = precioArticulo - descuento;

        return array;
    }
    
     public double[] comision(double montoRentaMensual) {
        double comision = 0.0;

        comision = (montoRentaMensual * 8)/100;

        double[] array = new double[2];

        array[0] = comision;

        array[1] = montoRentaMensual + comision;

        return array;
    }
    
    
    

}
