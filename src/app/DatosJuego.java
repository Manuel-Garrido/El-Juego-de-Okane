/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.text.DecimalFormat;

/**
 *
 * @author Manuel Garrido Serrano
 */

//Clase DatosJuego que contiene 1 variable privada que implementa la deuda del jugador.
public class DatosJuego {
    private double deuda;
    private DecimalFormat formatoMoneda = new DecimalFormat("#.00");
    
    //Constructor donde se inicializa la deuda con un valor random
    public DatosJuego(){
        deuda=(Math.random()*20000)+15000;
    }
    
    //Método get que devuelve un valor de cadena ya que convierte la deuda en formato de 2 decimales.
    public String getDeuda() {
        return formatoMoneda.format(deuda);
    }
    
    //Método set que nos permite modificar el valor de la deuda.
    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
    
    //Método que nos permite bajar la deuda.
    public void bajarDeuda(double reduccion){
        setDeuda(deuda-reduccion);
    }
    
    //Método que nos permite subir la deuda un 25% de su valor.
    public void aumentarDeuda(){
        setDeuda(deuda+(deuda*0.25));
    }
}
