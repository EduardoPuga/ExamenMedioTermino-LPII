import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NewFolsom {

	public void newFolsomPlanet(){
		
		final JFrame newFolsomFrame = new JFrame();
		newFolsomFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFolsomFrame.getContentPane().setLayout(null);
		newFolsomFrame.setUndecorated(true);
		newFolsomFrame.setBackground(new Color(0, 0, 0, 0));
		newFolsomFrame.setBounds(810, 380, 300, 315);
		newFolsomFrame.setPreferredSize(new Dimension(300, 315));
		
		JButton newFolsomButton = new JButton("");
		newFolsomButton.setBorderPainted(false);
		newFolsomButton.setBackground(new Color(0, 0, 0, 0));
		newFolsomButton.setBounds(0, 0, 300, 300);
		ImageIcon newFolsomImg = new ImageIcon(getClass().getResource("New_Folsom_SC2_DevArt1.png"));
		newFolsomButton.setIcon(newFolsomImg);
		
		newFolsomFrame.add(newFolsomButton);
		
		JLabel newFolsomLabel = new JLabel("New Folsom");
		newFolsomLabel.setBounds(120, 303, 100, 10);
		
		newFolsomFrame.add(newFolsomLabel);
		
		newFolsomButton.addActionListener(
				new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
					
						NewFolsom info = new NewFolsom();
						info.infoPlanet();
						
					}
				}
		);
		
		newFolsomFrame.pack();
		newFolsomFrame.setVisible(true);
		
	}
	
	
	public void infoPlanet(){
		
		double diametro = 			13920000;//Km
		double superficie = 		608770000;//Km^2
		double volumen = 			141230000;//Km^3
		double masa = 				20891000;//Kg
		double densidad = 			1.411;//Kg/cm^3
		
		final JFrame ventanaInfoFolsom = new JFrame("New Folsom");
		ventanaInfoFolsom.getContentPane().setLayout(null);
		ventanaInfoFolsom.setBounds(1570, 700, 300, 300);
		
		JLabel radioLabel = new JLabel("Diametro:                       " + diametro + "           Km");
		radioLabel.setBounds(20, 40, 300, 30);
		ventanaInfoFolsom.add(radioLabel);
		
		JLabel superficieLabel = new JLabel("Superficie:                     " + superficie + "         Km^2");
		superficieLabel.setBounds(20, 60, 300, 30);
		ventanaInfoFolsom.add(superficieLabel);
		
		JLabel volumenLabel = new JLabel("Volumen:                        " + volumen + "         Km^3");
		volumenLabel.setBounds(20, 80, 300, 30);
		ventanaInfoFolsom.add(volumenLabel);
		
		JLabel masaLabel = new JLabel("Masa:                              " + masa + "         Kg");
		masaLabel.setBounds(20, 100, 300, 30);
		ventanaInfoFolsom.add(masaLabel);
		
		JLabel densidadLabel = new JLabel("Densidad:                       " + densidad + "               Kg/cm^3");
		densidadLabel.setBounds(20, 120, 300, 30);
		ventanaInfoFolsom.add(densidadLabel);
		
		JButton ok = new JButton("OK");
		ok.setBounds(20, 180, 260, 50);
		ventanaInfoFolsom.add(ok);
		
		ok.addActionListener(
				new ActionListener(){
					
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e){
						
						ventanaInfoFolsom.hide();
						
					}
				}
		);
		
		ventanaInfoFolsom.setPreferredSize(new Dimension(320, 300));
		
		ventanaInfoFolsom.pack();
		ventanaInfoFolsom.setVisible(true);
	}
}
