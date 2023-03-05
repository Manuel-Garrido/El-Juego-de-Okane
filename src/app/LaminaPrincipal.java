/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import recompensasypersonajes.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;

/**
 *
 * @author Manuel Garrido Serrano
 */
//Clase LaminaPrincipal que hereda de JOptionPane e implementa 2 interfaces el ActionListener y el WindowListener.
public class LaminaPrincipal extends JOptionPane implements ActionListener, WindowListener {

    //Objetos
    CoinBro c = new CoinBro();
    Recompensa r = new Recompensa();
    Perdido p = new Perdido();
    CoinReal cr = new CoinReal();
    DatosJuego d = new DatosJuego();

    //Interfaz par ael usuario
    JButton inicio = new JButton("Inicializar programa");
    JButton salir = new JButton("Salir del programa");
    JButton salir2 = new JButton("Salir de tu juicio");
    JButton juego = new JButton("Iniciar el juego");
    JButton juego2 = new JButton("Iniciar el juego de Okane");
    JButton juego3 = new JButton("Comenzar tu juicio");
    JButton ganado = new JButton("Reclama tu premio");
    JButton perdido = new JButton("Preparate para ser juzgado");
    JButton sobreOkane = new JButton("Información sobre Okane");
    JButton deuda = new JButton("Información sobre tu deuda");
    JLabel creditos = new JLabel("Hecho por Manuel Garrido Serrano");
    JLabel creditos2 = new JLabel("onarreS odirraG leunaM rop ohceH");
    JLabel titulo3 = new JLabel("Okane´s Real Game");
    JLabel titulo2 = new JLabel("Okane´s Game");
    JLabel titulo1 = new JLabel("Menú de bienvenida");

    //Variables primitivas
    private String ID;
    private String IDReal;
    private int valuar;
    private int controlador;
    private int aciertos;

    /*
    Método constructor por defecto que inicializa las variables, elimina el posicionamiento por defecto
    e implementa el posicionamiento variable a cada botón u objeto, añade también fuentes personalizadas y juega con el uso
    de ocultar o no un botón para posteriormente volverlo visible cuando sea necesario y pone a las escucha los botones.
     */
    public LaminaPrincipal() {
        aciertos = 0;
        controlador = 0;
        valuar = 0;
        ID = String.valueOf((int) (Math.random() * 10000) + 1);
        IDReal = ID;
        setLayout(null);

        titulo2.setBounds(120, 60, 350, 50);
        titulo2.setFont(new Font("Tahoma", Font.BOLD, 20));
        titulo2.setVisible(false);
        add(titulo2);

        titulo3.setBounds(100, 60, 350, 50);
        titulo3.setFont(new Font("Tahoma", Font.BOLD, 20));
        titulo3.setVisible(false);
        add(titulo3);

        titulo1.setBounds(100, 60, 350, 50);
        titulo1.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(titulo1);

        creditos.setBounds(10, 280, 250, 50);
        add(creditos);

        creditos2.setBounds(10, 280, 250, 50);
        creditos2.setVisible(false);
        add(creditos2);

        inicio.setBounds(20, 120, 350, 50);
        inicio.addActionListener(this);
        add(inicio);

        salir.setBounds(20, 190, 350, 50);
        salir.addActionListener(this);
        add(salir);

        salir2.setBounds(20, 240, 350, 50);
        salir2.addActionListener(this);
        salir2.setVisible(false);
        add(salir2);

        juego.setBounds(20, 120, 350, 50);
        juego.addActionListener(this);
        add(juego);

        juego2.setBounds(20, 120, 350, 50);
        juego2.addActionListener(this);
        juego2.setVisible(false);
        add(juego2);

        juego3.setBounds(20, 120, 350, 50);
        juego3.addActionListener(this);
        juego3.setVisible(false);
        add(juego3);

        ganado.setBounds(20, 120, 350, 50);
        ganado.addActionListener(this);
        ganado.setVisible(false);
        add(ganado);

        perdido.setBounds(20, 120, 350, 50);
        perdido.addActionListener(this);
        perdido.setVisible(false);
        add(perdido);

        sobreOkane.setBounds(20, 180, 350, 50);
        sobreOkane.addActionListener(this);
        sobreOkane.setVisible(false);
        add(sobreOkane);

        deuda.setBounds(20, 180, 350, 50);
        deuda.addActionListener(this);
        deuda.setVisible(false);
        add(deuda);
    }

    //Métodos getter y setter.
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    //Método implementado del ActionListener que contiene todo el juego.
    @Override
    public void actionPerformed(ActionEvent e) {
        //Objecto creado para detectar que cuando se pulse x botón haga x cosa.
        Object pulsar = e.getSource();

        //Switch que controla los primeros botones del juego para óptimizar el rendimiento en vez de usar varios ifs al no pedir condiciones.
        //e.getActionCommand() nos permite garantizar a que lugar se pulso ya que devuelve el texto del botón.
        switch (e.getActionCommand()) {
            case "Inicializar programa":
                JOptionPane.showMessageDialog(null, "Bienvenido jugador: " + ID, "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "En breves se le llevará al menú del juego.", "Mensaje de aviso", JOptionPane.INFORMATION_MESSAGE);
                inicio.setVisible(false);
                titulo1.setVisible(false);
                titulo2.setVisible(true);
                break;
            case "Iniciar el juego":
                JOptionPane.showMessageDialog(null, "¿...?", "Rudio extraño", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null, "¿hmmmm?", "Rudio extraño", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Uy, hola. Vaya modales tengo. Me presento, mi nombre es Okane encantado.", "Extraño", JOptionPane.DEFAULT_OPTION, c);
                valuar = -1;
                JOptionPane.showMessageDialog(null, "Tú debes ser el jugador " + getID() + ".", "Okane", JOptionPane.DEFAULT_OPTION, c);
                JOptionPane.showMessageDialog(null, "Mis superiores me hablaron de ti.", "Okane", JOptionPane.DEFAULT_OPTION, c);
                JOptionPane.showMessageDialog(null, "Quizás deseas que te llame con otro nombre en vez de jugador " + getID() + ".", "Okane", JOptionPane.DEFAULT_OPTION, c);
                int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas que te llame de otra forma?", "Okane te pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, c);
                if (opcion != 1) {
                    do {
                        if (getID().length() == 0) {
                            JOptionPane.showMessageDialog(null, "Vaya parece que no has puesto un nombre válido, prueba de nuevo", "Okane", JOptionPane.DEFAULT_OPTION, c);
                        }
                        setID(JOptionPane.showInputDialog(null, "¿Cómo deseas que te llame?", "Okane te pregunta", JOptionPane.DEFAULT_OPTION));
                    } while (getID().length() == 0);
                    JOptionPane.showMessageDialog(null, "Encantado jugador " + getID() + ".", "Okane", JOptionPane.DEFAULT_OPTION, c);
                } else {
                    JOptionPane.showMessageDialog(null, "Deacuerdo te sigueré llamando jugador " + getID() + ".", "Okane", JOptionPane.DEFAULT_OPTION, c);
                }
                JOptionPane.showMessageDialog(null, "Bueno antes de empezar con el juego jugador " + getID() + " indica, ¿qué desea hacer?", "Okane", JOptionPane.DEFAULT_OPTION, c);
                juego.setVisible(false);
                juego2.setVisible(true);
                sobreOkane.setVisible(true);
                salir.setBounds(20, 240, 350, 50);
                break;
            case "Iniciar el juego de Okane":
                JOptionPane.showMessageDialog(null, "Hora de empezar este maravilloso jue...", "Okane", JOptionPane.DEFAULT_OPTION, c);
                JOptionPane.showMessageDialog(null, "Jue...", "Okane", JOptionPane.DEFAULT_OPTION, c);
                JOptionPane.showMessageDialog(null, "Jue...", "Okane", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null, "¿Juego?", "???", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null, "JAJAJAJAJAJA", "???", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Parece que has caido en mi trampa, como el resto de jugadores de aquí.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                valuar = 1;
                JOptionPane.showMessageDialog(null, "Así que ya basta de formalismos jugador " + IDReal + ".", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Verás jugador " + IDReal + " no está aquí de pura casualidad, eres un deudor que debe un total de " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Bien seguro te estarás preguntando, ¿quién soy realmente? ¿Por qué debo dinero? \nVerás jugador " + IDReal + ", te voy a liberar de tu amnesia repentina, hará 2 meses pedistes un crédito a nuestro prestamista.\n El problema es que no has podido pagarlo a tiempo y eso está bastante mal de tu parte jugador " + IDReal + ".\nAsí que alguien debe hacerte pagar por ello.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                titulo2.setVisible(false);
                titulo3.setVisible(true);
                juego2.setVisible(false);
                juego3.setVisible(true);
                creditos.setVisible(false);
                creditos2.setVisible(true);
                salir.setVisible(false);
                salir2.setVisible(true);
                sobreOkane.setVisible(false);
                deuda.setVisible(true);
                JOptionPane.showMessageDialog(null, "Bueno basta de hablar empecemos de una vez por todas con el juego.\nAcabo de modificar tu interfaz con las nuevas opciones y la deuda que tienes actualmente.\nCuando estés listo dale clic a empezar juego para comenzar a jugar.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                break;
            case "Información sobre Okane":
                JOptionPane.showMessageDialog(null, "Encantado mi nombre es Okane, soy tu amigo y compañero en este juego denominado el juego de Okane.\nSoy una simple moneda de compañia sin nada en especial, por lo que espero que disfrutes conmigo. \nEstoy deseando empezar el juego y enseñarte las maravillas del mismo.", "Okane", JOptionPane.DEFAULT_OPTION, c);
                break;
            case "Información sobre tu deuda":
                JOptionPane.showMessageDialog(null, "Tu deuda actual es de: " + d.getDeuda() + "€", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                break;
            case "Salir de tu juicio":
                JOptionPane.showMessageDialog(null, "Lo siento, pero no puedo dejarte escapar de tu juicio.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                salir2.setVisible(false);
                break;
            case "Salir del programa":
                JOptionPane.showMessageDialog(null, "Cerrando programa...", "Mensaje de despedida", JOptionPane.CLOSED_OPTION);
                System.exit(0);
                break;
            case "Preparate para ser juzgado":
                JOptionPane.showMessageDialog(null, "MUAJAJAJA", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Parece que aquí acaba tu vida.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Últimas palabras?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, cr);

                if (confirmacion == 0) {
                    String ultimas = JOptionPane.showInputDialog(null, "Dí tus últimas palabras:", "Okane te pregunta", JOptionPane.DEFAULT_OPTION);
                    JOptionPane.showMessageDialog(null, "Interesante que tus últimas palabras sean: " + ultimas + ". MUAJAJAJAJA", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                    JOptionPane.showMessageDialog(null, "En fin, hora de acabar con esto...", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                    JOptionPane.showMessageDialog(null, "Okane te ha matado, por ende, has perdido.", "Final Malo", JOptionPane.DEFAULT_OPTION, p);
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Parece que te has quedado mudo en último momento, ¡que pena! MUAJAJAJA", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                    JOptionPane.showMessageDialog(null, "En fin, hora de acabar con esto...", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                    JOptionPane.showMessageDialog(null, "Okane te ha matado, por ende, has perdido.", "Final Malo", JOptionPane.DEFAULT_OPTION, p);
                    System.exit(0);
                }
                break;
        }

        //Parte del juego donde uso varias condiciones y preferí usar ifs.
        if (pulsar == juego3 && controlador == 0) {
            controlador = 1;

            //Vectores con las respuestas a las preguntas.
            /*
                            [Respuestas a las preguntas]
            
                        //Pregunta 1// 
                        ¿Cuánto es 1+1?
                        R. 2
                        //Pregunta 2//
                        ¿Cuál es el elemento químico más abundante en la Tierra?
                        R. Hierro
                        //Pregunta 3//
                        ¿Cuál es la diferencia entre una clase abstracta y una interfaz en Java?
                        R. Una interfaz solo puede contener métodos sin implementar, mientras que una clase abstracta puede tener métodos implementados y sin implementar.
                        //Pregunta 4//
                        ¿Qué es una vulnerabilidad zero-day?
                        R. Una vulnerabilidad que ha sido descubierta, pero aún no se ha desarrollado un parche para corregirla.
                        //Pregunta 5//
                        ¿Frnepu naq zntvp nernf ner frafr bs cebcregl ng gur onfr bs gur Ebfre Wbarf Pnzc.?
                        R.Gur fnyg bs gur pbapergr ryrzrag 
            
                            [Fin respuestas a las preguntas]
            */
            String[] opcionesPregunta1 = {"0", "2", "4", "¿Qué chorrada es está?"};
            String[] opcionesPregunta2 = {"Oxígeno", "Hidrógeno", "Hierro", "DEJAME CRIMINAL."};
            String[] opcionesPregunta3 = {" Una interfaz puede tener variables miembro y métodos implementados, mientras que una clase abstracta no puede tenerlos.", "Una interfaz solo puede contener métodos sin implementar, mientras que una clase abstracta puede tener métodos implementados y sin implementar.", "¿QUÉ ES JAVA?", "Una interfaz puede ser instanciada, mientras que una clase abstracta no puede ser instanciada."};
            String[] opcionesPregunta4 = {"Una vulnerabilidad que ha sido descubierta, pero aún no se ha desarrollado un parche para corregirla.", "Solo acaba con esto de una vez...", "Una vulnerabilidad que ha sido descubierta y que ya ha sido parcheada.", "Una vulnerabilidad que solo afecta a sistemas informáticos antiguos y obsoletos."};
            String[] opcionesPregunta5 = {"Gur znva pyho", "¿QUÉ ES ESTO?", "Gur erfg bs gur cncre", "Gur fnyg bs gur pbapergr ryrzrag"};

            DecimalFormat formato = new DecimalFormat("#.00");
            double bajada;

            JOptionPane.showMessageDialog(null, "Las reglas del juego son simples:\n-Debes responder a 5 preguntas.\n-Cada pregunta que aciertes restará dinero a tu deuda de forma aleatoria.\n-Si por un casual aciertas las preguntas, pero tu deuda sigue en valor positivo te la perdonaremos.\n-Si fallas alguna de las preguntas y tu deuda sigue en valor positivo perderas.\n-Si no aciertas ninguna perderas.\n-Como último inciso cada pregunta que falles aumentará tu deuda un 25%.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            JOptionPane.showMessageDialog(null, "Por cierto, ya deberías saberlo, pero si pierdes, tu pérdida se paga con la muerte.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            JOptionPane.showMessageDialog(null, "No es algo que te deba sorprender a estas alturas, ¿no? JAJAJAJAJA", "Okane", JOptionPane.DEFAULT_OPTION, cr);

//                                                       [Sección de preguntas]
            //Pregunta 1
            JOptionPane.showMessageDialog(null, "Bien, empecemos con la primera pregunta:", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            int preg1 = JOptionPane.showOptionDialog(null, "¿Cuánto es 1+1?", "Okane: Pregunta 1", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, cr, opcionesPregunta1, opcionesPregunta1[0]);
            if (preg1 == 1) {
                aciertos++;
                JOptionPane.showMessageDialog(null, "Era una pregunta de calentamiento, pero mira tu deuda bajo.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.bajarDeuda(2500);
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Te bajamos 2500€ por ser la primera pregunta, las siguientes tendrán una bajada aleatoria.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            } else {
                JOptionPane.showMessageDialog(null, "Era una pregunta de calentamiento, y aún así la fallas...", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Veo que no te estás tomando esto en serio, así que contempla tu hermosa deuda como subió:", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.aumentarDeuda();
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Espero que a partir de ahora te lo tomes más en serio.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            }

            //Pregunta 2
            JOptionPane.showMessageDialog(null, "Sigamos con la segunda pregunta:", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            int preg2 = JOptionPane.showOptionDialog(null, "¿Cuál es el elemento químico más abundante en la Tierra?", "Okane: Pregunta 2", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, cr, opcionesPregunta2, opcionesPregunta2[0]);

            if (preg2 == 2) {
                bajada = Double.parseDouble(formato.format((Math.random() * 6000) + 1000).replace(",", "."));
                JOptionPane.showMessageDialog(null, "Estoy impresionado, ni yo sabía de esa respuesta.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                aciertos++;
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.bajarDeuda(bajada);
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Te bajamos " + bajada + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, por lo que tu deuda a aumentado MUAJAJAJA.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.aumentarDeuda();
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Espero que a partir de ahora te lo tomes más en serio.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            }

            //Pregunta 3
            JOptionPane.showMessageDialog(null, "Sigamos con la tercera pregunta:", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            JOptionPane.showMessageDialog(null, "Teniendo en cuenta que mi creador me creó en Java, vamos con una con el lenguaje por excelencia.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            String preg3 = (String) JOptionPane.showInputDialog(null, "¿Cuál es la diferencia entre una clase abstracta y una interfaz en Java?:", "Okane: pregunta 3", JOptionPane.DEFAULT_OPTION, cr, opcionesPregunta3, opcionesPregunta3[0]);
            if (preg3.equals("Una interfaz solo puede contener métodos sin implementar, mientras que una clase abstracta puede tener métodos implementados y sin implementar.")) {
                JOptionPane.showMessageDialog(null, "Estoy impresionado, lo estás haciendo bien, eso me pone triste porque le quita diversión a mi juego.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                aciertos++;
                bajada = Double.parseDouble(formato.format((Math.random() * 5000) + 2000).replace(",", "."));
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.bajarDeuda(bajada);
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Te bajamos " + bajada + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, por lo que tu deuda a aumentado MUAJAJAJA.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.aumentarDeuda();
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Espero que a partir de ahora te lo tomes más en serio.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            }

            //Pregunta 4
            JOptionPane.showMessageDialog(null, "Sigamos con la cuarta pregunta:", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            String preg4 = (String) JOptionPane.showInputDialog(null, "¿Qué es una vulnerabilidad zero-day?", "Okane: pregunta 4", JOptionPane.DEFAULT_OPTION, cr, opcionesPregunta4, opcionesPregunta4[0]);

            if (preg4.equals("Una vulnerabilidad que ha sido descubierta, pero aún no se ha desarrollado un parche para corregirla.")) {
                bajada = Double.parseDouble(formato.format((Math.random() * 6000) + 4000).replace(",", "."));
                JOptionPane.showMessageDialog(null, "Estoy impresionado.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                aciertos++;
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.bajarDeuda(bajada);
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Te bajamos " + bajada + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, por lo que tu deuda a aumentado MUAJAJAJA.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.aumentarDeuda();
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Espero que a partir de ahora te lo tomes más en serio.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            }

            //Pregunta 5
            JOptionPane.showMessageDialog(null, "Sigamos con la quinta pregunta:", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            JOptionPane.showMessageDialog(null, "Por cierto, está se halla encriptada en código césar y en inglés, así que mucha suerte MUAJAJA.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            int preg5 = JOptionPane.showOptionDialog(null, "¿Frnepu naq zntvp nernf ner frafr bs cebcregl ng gur onfr bs gur Ebfre Wbarf Pnzc.?", "Okane: Pregunta 5", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, cr, opcionesPregunta5, opcionesPregunta5[0]);

            if (preg5 == 3) {
                bajada = Double.parseDouble(formato.format((Math.random() * 5000) + 2000).replace(",", "."));
                JOptionPane.showMessageDialog(null, "Estoy impresionado, has acertado la última pregunta...", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                aciertos++;
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.bajarDeuda(bajada);
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Te bajamos " + bajada + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, por lo que tu deuda a aumentado MUAJAJAJA.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Deuda que tenías anteriormente: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                d.aumentarDeuda();
                JOptionPane.showMessageDialog(null, "Deuda actual: " + d.getDeuda() + "€.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
                JOptionPane.showMessageDialog(null, "Era la última pregunta por lo que da igual si ya te lo tomas en serio o no MUAJAJAJA.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            }
        }

//                                          [Fin sección de preguntas]

//                                          [Finales buenos del juego]

        if (aciertos == 5 || Double.parseDouble(d.getDeuda().replace(",", ".")) <= 0 && controlador == 1) {
            JOptionPane.showMessageDialog(null, "Vaya...parece que has logrado pasar el juego y con ello librarte del juicio...pulsa el botón para recoger tu premio.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            juego3.setVisible(false);
            salir2.setVisible(false);
            creditos2.setVisible(false);
            titulo3.setVisible(false);
            titulo2.setVisible(true);
            creditos.setVisible(true);
            ganado.setVisible(true);
            controlador = 0;
        } else if (pulsar == juego3 && controlador == 1 && Double.parseDouble(d.getDeuda().replace(",", ".")) > 0 && aciertos < 5) {
            JOptionPane.showMessageDialog(null, "Buen intento,pero no puedes volver a realizar las preguntas, por ende, me temo que has perdido, hasta la próxima " + ID + ". MUAJAJAJA.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
            juego3.setVisible(false);
            salir2.setVisible(false);
            perdido.setVisible(true);
        }

        if (pulsar == ganado && Double.parseDouble(d.getDeuda().replace(",", ".")) <= 0 && aciertos < 5) {
            JOptionPane.showMessageDialog(null, "???", "???", JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, "???", "???", JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Uff, uff, uy, hola jugador " + ID + " cuanto tiempo amigo, no sé que me paso, oh pareces que te has librado de tu deuda.", "Okane", JOptionPane.DEFAULT_OPTION, c);
            JOptionPane.showMessageDialog(null, "Me alegro amigo. ^_^", "Okane", JOptionPane.DEFAULT_OPTION, c);
            JOptionPane.showMessageDialog(null, "Sabes, como ahora quien te debe dinero soy yo, voy a proceder a darte tu preciado beneficio. ¿Lo quieres?", "Okane", JOptionPane.DEFAULT_OPTION, c);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Quieres el regalo de Okane?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, r);
            if (confirmacion == 0) {
                JOptionPane.showMessageDialog(null, "Has recibido un total de " + Math.abs(Double.parseDouble(d.getDeuda().replace(",", "."))) + "€.", "Regalo recibido", JOptionPane.DEFAULT_OPTION, r);
                JOptionPane.showMessageDialog(null, "Has ganado, fin del juego.", "Final bueno C", JOptionPane.DEFAULT_OPTION, r);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Oh, pues gracias por perdonarme la deuda amigo ^_^, yo haría lo mismo por ti...", "Okane", JOptionPane.DEFAULT_OPTION, c);
                JOptionPane.showMessageDialog(null, "Has ganado, fin del juego.", "Final bueno C", JOptionPane.DEFAULT_OPTION, r);
                System.exit(0);
            }
        } else if (pulsar == ganado && Double.parseDouble(d.getDeuda().replace(",", ".")) <= 0 && aciertos == 5) {
            JOptionPane.showMessageDialog(null, "???", "???", JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, "???", "???", JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Uff, uff, uy, hola jugador " + ID + " cuanto tiempo amigo, no sé que me paso, oh pareces que te has librado de tu deuda.", "Okane", JOptionPane.DEFAULT_OPTION, c);
            JOptionPane.showMessageDialog(null, "VAYA ENCIMA HAS ADIVINADO TODAS LAS PREGUNTAS, ERES GENIAL.", "Okane", JOptionPane.DEFAULT_OPTION, c);
            JOptionPane.showMessageDialog(null, "Me alegro amigo. ^_^", "Okane", JOptionPane.DEFAULT_OPTION, c);
            JOptionPane.showMessageDialog(null, "Sabes, como ahora quien te debe dinero soy yo, voy a proceder a darte tu preciado beneficio. ¿Lo quieres?", "Okane", JOptionPane.DEFAULT_OPTION, c);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Quieres el regalo de Okane?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, r);
            if (confirmacion == 0) {
                JOptionPane.showMessageDialog(null, "Has recibido un total de " + Math.abs(Double.parseDouble(d.getDeuda().replace(",", "."))) + "€.", "Regalo recibido", JOptionPane.DEFAULT_OPTION, r);
                JOptionPane.showMessageDialog(null, "Has ganado, fin del juego.", "Final bueno B", JOptionPane.DEFAULT_OPTION, r);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Oh, pues gracias por perdonarme la deuda amigo ^_^, yo haría lo mismo por ti...", "Okane", JOptionPane.DEFAULT_OPTION, c);
                JOptionPane.showMessageDialog(null, "Has ganado, fin del juego.", "Final bueno B", JOptionPane.DEFAULT_OPTION, r);
                System.exit(0);
            }
        } else if (pulsar == ganado && aciertos == 5 && Double.parseDouble(d.getDeuda().replace(",", ".")) > 0) {
            JOptionPane.showMessageDialog(null, "???", "???", JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, "???", "???", JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Uff, uff, uy, hola jugador " + ID + " cuanto tiempo amigo, no sé que me paso, oh pareces que has conseguido reducir algo tu deuda, pero aún tienes un poco.", "Okane", JOptionPane.DEFAULT_OPTION, c);
            JOptionPane.showMessageDialog(null, "Sabes, no puedo dejar que cargues con ello, te la perdono amigo. ^_^", "Okane", JOptionPane.DEFAULT_OPTION, c);
            JOptionPane.showMessageDialog(null, "Has recibido el perdón por tu deuda, ahora debes 0€.", "Regalo recibido", JOptionPane.DEFAULT_OPTION, r);
            JOptionPane.showMessageDialog(null, "Has ganado, fin del juego.", "Final bueno A", JOptionPane.DEFAULT_OPTION, r);
            System.exit(0);
        }

    }

    //Parte de ventanas, aunque solo uso algunos de los métodos implementados.
    @Override
    public void windowOpened(WindowEvent e) {
        //JOptionPane.showMessageDialog(null,"Ventana abierta");
    }

    /*
    Métodos usados que nos permite dar dinamismo al juego, al permitir que cuando se cierre la ventana o se minimice o restauré
    salga o no un dialogo distinto, dependiendo de la situación del juego.
     */
    @Override
    public void windowClosing(WindowEvent e) {
        if (valuar > 0) {
            JOptionPane.showMessageDialog(null, "Parece que has encontrado la forma de huir por ahora, ya te atraparé.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
        } else if (valuar == 0) {
            JOptionPane.showMessageDialog(null, "Ventana cerrada con exito.", "Mensaje de cierre", JOptionPane.CLOSED_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Hasta la vista amigo mio.", "Okane", JOptionPane.DEFAULT_OPTION, c);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //JOptionPane.showMessageDialog(null, "Ventana cerrada con exito.", "Mensaje de cierre", JOptionPane.CLOSED_OPTION);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        if (valuar > 0) {
            JOptionPane.showMessageDialog(null, "Te piensas que minimizando la ventana te has librado de mí. JAJAJAJA.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
        } else if (valuar == 0) {
            JOptionPane.showMessageDialog(null, "Ventana minimizada con exito.", "Mensaje de cierre", JOptionPane.CLOSED_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Parece que has minimizado la ventana amigo, te espero.", "Okane", JOptionPane.DEFAULT_OPTION, c);
        }
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        if (valuar > 0) {
            JOptionPane.showMessageDialog(null, "Has vuelto, te dije que no te ibas a librar de mí tan facilmente.", "Okane", JOptionPane.DEFAULT_OPTION, cr);
        } else if (valuar == 0) {
            JOptionPane.showMessageDialog(null, "Ventana restaurada con exito.", "Mensaje de cierre", JOptionPane.CLOSED_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Hola de nuevo amigo mio.", "Okane", JOptionPane.DEFAULT_OPTION, c);
        }
    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
