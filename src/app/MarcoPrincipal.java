package app;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Garrido Serrano
 */

//Clase MarcoPrincipal que hereda de JFrame.
public class MarcoPrincipal extends JFrame {
    public MarcoPrincipal(){
        //Permite añadir un título al marco.
        setTitle("El juego de Okane");
        //Permite añadir un tamaño al marco por defecto.
        setSize(400,350);
        //Bloquea la forma de maximizar la ventana.
        setResizable(false);
        //Centra el marco o hace que la ventana aparezca en el centro.
        setLocationRelativeTo(null);
        //Implementa la imagen como icono de la ventana.
        setIconImage(getIconImage());
        //Crea el objeto de la clase LaminaPrincipal
        LaminaPrincipal l = new LaminaPrincipal();
        //Permite añadir un WindowListener al implementarlo el objeto creado.
        addWindowListener(l);
        //Añade el objeto a la ventana.
        add(l);
    }
    
    //Método heredado que devuelve una imagen para usarla como icono.
    @Override
    public Image getIconImage(){
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icono/miicono.png"));
        return icono;
    }
}
