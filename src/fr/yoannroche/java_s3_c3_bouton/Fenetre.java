package fr.yoannroche.java_s3_c3_bouton;

import java.awt.BorderLayout;
import java.awt.Color; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Fenetre extends JFrame{
  private Panneau pan = new Panneau();
  private JButton bouton = new JButton("mon bouton");
  private JPanel container = new JPanel();
  
  public Fenetre(){
    this.setTitle("Test");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    container.add(pan, BorderLayout.CENTER);
    container.add(new JButton("test"), BorderLayout.SOUTH);
    container.add(new JButton("test"), BorderLayout.WEST);
    container.add(new JButton("test"),BorderLayout.NORTH);
    container.add(new JButton("test"),BorderLayout.EAST);
     
    this.setContentPane(container);
    this.setVisible(true);    
   
  
  
  
    
  }  
}