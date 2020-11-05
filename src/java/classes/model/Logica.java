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

    public String getColor(int clave) {
        String color = "";
        switch (clave) {
            case 0:
                return color = "<p style='color:white'>";
            case 1:
                return color = "<p style='color:black'>";
            case 2:
                return color = "<p style='color:blue'>";
            case 3:
                return color = "<p style='color:green'>";
            case 4:
                return color = "<p style='color:yellow'>";
            default:
                return color;
        }
    }
    
    
    public String getBackground(int clave){
             String color = "";
        switch (clave) {
            case 0:
                return color = "<body bgcolor='white'>";
            case 1:
                return color = "<body bgcolor='black'>";
            case 2:
                return color = "<body bgcolor='blue'>";
            case 3:
                return color = "<body bgcolor='green'>";
            case 4:
                return color = "<body bgcolor='yellow'>";
            default:
                return color;
        }
        
        
    }
    
    
        public String getStyle(String clave) {
        String color = "";
        switch (clave) {
            case "negrita":
                return color = "b";
            case "subrayado":
                return color = "u";
            case "cursiva":
                return color = "i";
            case "tachado":
                return color = "strike";
            case "":
                return color = "";
            default:
                return color;
        }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        Logica obj = new Logica();

        System.out.print(obj.getColor(0));

    }

}
