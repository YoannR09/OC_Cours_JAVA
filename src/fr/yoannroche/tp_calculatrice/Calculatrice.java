package fr.yoannroche.tp_calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Calculatrice extends JFrame {

	/**
	 * Les Variables d'instance.
	 */

	private JPanel container = new JPanel();
	private JButton bouton0 = new JButton("0");
	private JButton bouton1 = new JButton("1");
	private JButton bouton2 = new JButton("2");
	private JButton bouton3 = new JButton("3");
	private JButton bouton4 = new JButton("4");
	private JButton bouton5 = new JButton("5");
	private JButton bouton6 = new JButton("6");
	private JButton bouton7 = new JButton("7");
	private JButton bouton8 = new JButton("8");
	private JButton bouton9 = new JButton("9");
	private JButton boutonad = new JButton("+");
	private JButton boutonso = new JButton("-");
	private JButton boutondi = new JButton("/");
	private JButton boutonmu = new JButton("*");
	private JButton boutonc = new JButton("C");
	private JButton boutonp = new JButton(".");
	private JButton boutoneg = new JButton("=");
	



	private JLabel ecran = new JLabel();
	private String operateur ;
	

	/**
	 * Création de la boite Calculatrice
	 */
	public Calculatrice () {
		this.setTitle("Calculatrice");
		this.setSize(270, 265);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.DARK_GRAY);

		Contenu();



		this.setVisible(true);
		this.setContentPane(container);
	}
	private void Contenu() {

		JPanel ecranP = new JPanel();
		ecranP.setPreferredSize(new Dimension(235, 50));
		ecranP.setBackground(Color.GRAY);
		container.add(ecranP, BorderLayout.NORTH);
		ecranP.setBorder(BorderFactory.createLineBorder(Color.black));
		Font police = new Font ("Impact",Font.BOLD,40);
		
		ecran = new JLabel ("0");
		ecran.setForeground(Color.black);
		ecran.setFont(police);
		

		JPanel chiffre = new JPanel(); 
		chiffre.setPreferredSize(new Dimension(165, 140));
		chiffre.setBackground(Color.LIGHT_GRAY);
		container.add(chiffre, BorderLayout.CENTER);
		chiffre.setBorder(BorderFactory.createLineBorder(Color.black));


		chiffre.add(bouton1);
		chiffre.add(bouton2);
		chiffre.add(bouton3);
		chiffre.add(bouton4);
		chiffre.add(bouton5);
		chiffre.add(bouton6);
		chiffre.add(bouton7);
		chiffre.add(bouton8);
		chiffre.add(bouton9);
		chiffre.add(boutonp);
		chiffre.add(bouton0); 
		chiffre.add(boutoneg);
		
		
		


		JPanel operateur = new JPanel();
		operateur.setPreferredSize(new Dimension (70, 170));
		operateur.setBackground(Color.orange);
		container.add(operateur, BorderLayout.EAST);
		operateur.setBorder(BorderFactory.createLineBorder(Color.black));

		operateur.add(boutonad);
		operateur.add(boutonso);
		operateur.add(boutondi);
		operateur.add(boutonmu);
		operateur.add(boutonc);



		ecran.setHorizontalAlignment(JLabel.RIGHT);
		ecran.setPreferredSize(new Dimension(220, 40));
		ecranP.add(ecran);




	}
	
}





