package app;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Garrido Serrano
 */
public class Main {
    //Método main que contiene el objeto de la clase MarcoPrincipal y lo hace visible y cuando se cierre acaba el programa.
    public static void main(String[] args) {
        MarcoPrincipal m = new MarcoPrincipal();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
