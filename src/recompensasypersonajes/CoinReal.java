/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recompensasypersonajes;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Manuel Garrido Serrano
 */

//Clase creada solo para crear el icono usado en los JOptionPane del personaje Okane psicopata
public class CoinReal implements Icon{
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image coinBro = new ImageIcon(getClass().getResource("/imagenes/coinreal.png")).getImage();
        g.drawImage(coinBro, x, y, c);
    }

    @Override
    public int getIconWidth() {
        return 150;
    }

    @Override
    public int getIconHeight() {
        return 150;
    }
}
