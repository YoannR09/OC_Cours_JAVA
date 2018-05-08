package fr.yoannroche.java_s3_c2_animation;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {

  private int posX = -50;
  private int posY = -50;
  private int x9 = this.getWidth()/4;
  private int y9 = this.getHeight()/4;

  public void paintComponent(Graphics g) {
	   // On décide d'une couleur de fond pour notre rectangle
	    g.setColor(Color.white);
	    // On dessine celui-ci afin qu'il prenne tout la surface
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    // On redéfinit une couleur pour notre rond
	    g.setColor(Color.red);
	    // On le dessine aux coordonnées souhaitées
	    g.fillOval(posX, posY, 50, 50);
	    
	    g.setColor(Color.yellow);
	    
	    g.fill3DRect(0, 0, 20, 1000 , true);
	    
	    g.setColor(Color.black);
	    
	    g.fill3DRect( x9 , y9 , 3 ,this.getWidth()*2 , true);
	  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }
}