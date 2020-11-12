/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.model;

/**
 *
 * @author diegonarvaez
 */
public class Logica {

    public int getSeconds(int days) {
        return days * 60 * 60 * 24;
    }

    public double getYards(int kilometros) {
        return kilometros * 914.4;
    }

    public double getRankine(int centigrados) {
        double valor = (9.0 / 5.0);
 
        double valor2 = (centigrados + 273.15);
   
        return (valor * valor2);
    }

    public int getChange(int compra, int pago) {
        if (pago < compra) {
            return 0;
        } else {
            return pago - compra;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here

        Logica obj = new Logica();

    }

}
