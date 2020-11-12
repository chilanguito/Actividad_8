/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.model.funtions;

import java.util.HashMap;

/**
 *
 * @author diegonarvaez
 */
public class Data {

    public Data() {
        mapa.put("cronometro", cronometro);
        mapa.put("cinta_metrica", cinta_metrica);
        mapa.put("termometro", termometro);
        mapa.put("cobranza", cobranza);
    }

    public HashMap<String, String[]> mapa = new HashMap<>();

    public String[] cronometro = {"Segundos a minutos", "Segundos a horas", "Minutos a Segundos", "Minutos a horas", "Horas a segundos", "Horas a Minutos"};

    public String[] cinta_metrica = {"centímetros a metros", "centímetros a kilómetros", "metros a centímetros", " metros a kilómetros", "kilómetros a centímetros", "kilómetros a metros"};

    public String[] termometro = {"Farhenheir a Celsius", "Celsius a Fahrenheit", "Fahrenheit a Kelvin", "Kelvin a Fahrenheit"};

    public String[] cobranza = {"Caja Registradora", "Descuento", "Comisión"};

}
