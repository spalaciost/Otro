/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Personaje principal
 */
public class Carro {
    private int x;
    private int y;
    private Image tileset;
        
    public Carro(int x, int y) {
        this.x = x;
        this.y = y;
        this.tileset = loadImage("link.png");
    }

    public Image getTileset() {
        return tileset;
    }

    public void setTileset(Image tileset) {
        this.tileset = tileset;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
    public Carro(){
       this.x=20;
       this.y=20;
       
       
    }
    public void dibujar(Graphics g, JPanel panel){
       g.setColor(Color.red);
       g.drawImage(tileset, x, y, panel);
      
    }
    
    
   protected Image loadImage(String imageName) {
       ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
         return image;
    }
    
    public void keyPressed1(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y += 85; break;
            case KeyEvent.VK_UP: y -= 85; break;
            case KeyEvent.VK_LEFT: x -= 85; break;
            case KeyEvent.VK_RIGHT: x += 85; break;
              
          }
    }
    public void keyPressed2(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_S: y += 85; break;
            case KeyEvent.VK_W: y -= 85; break;
            case KeyEvent.VK_A: x -= 85; break;
            case KeyEvent.VK_D: x += 85; break;
              
          }
    }
    
    public void mover(){
       this.x+=1;
       //this.y+=1;
       
    }
    
     public Rectangle obtenerRectangulo(){
       return new Rectangle(x, y, 20, 20);
    }
}
