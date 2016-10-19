import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Braxis {

	public void braxisPlanet(){
		
		Hilos hiloBraxis = new Hilos("hiloBraxis");
		
		hiloBraxis.setMensaje("Hilo Prueba Braxis");
		hiloBraxis.setAlive(true);
		hiloBraxis.start();
		
		final JFrame braxisFrame = new JFrame();
		braxisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		braxisFrame.getContentPane().setLayout(null);
		braxisFrame.setUndecorated(true);
		braxisFrame.setBackground(new Color(0, 0, 0, 0)); 
		braxisFrame.setBounds(720, 240, 100, 100);
		braxisFrame.setPreferredSize(new Dimension(100, 115));
		
		JButton braxisButton = new JButton("");
		braxisButton.setBorderPainted(false);
		braxisButton.setBackground(new Color(0, 0, 0, 0)); 
		braxisButton.setBounds(0, 0, 100, 100);
		ImageIcon braxisImg = new ImageIcon(getClass().getResource("Braxis_SC2_DevArt1.png"));
		braxisButton.setIcon(braxisImg);
		
		braxisFrame.add(braxisButton);
		
		JLabel braxisLabel = new JLabel("Braxis");
		braxisLabel.setBounds(30, 100, 100, 10);
		
		braxisFrame.add(braxisLabel);
		
		braxisButton.addActionListener(
				new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
					
						Braxis info = new Braxis();
						info.infoPlanet();
						
					}
				}
		);
		
		braxisFrame.pack();
		braxisFrame.setVisible(true);
		
	}
	
	
	public void infoPlanet(){
		
		double distanciaAlSol = 		449800000; //Km
		double diametro = 				49572;//Km
		double superficie = 			765000000;//Km^2
		double volumen = 				625400000;//Km^3
		double masa = 					124000000;//Kg
		double densidad = 				1.64;//g/cm^3
		
		final JFrame ventanaInfoBraxis = new JFrame("Braxis");
		ventanaInfoBraxis.getContentPane().setLayout(null);
		ventanaInfoBraxis.setBounds(1570, 700, 100, 100);
		
		JLabel distanciaLabel = new JLabel("Distancia al Sol:            " + distanciaAlSol + "     Km");
		distanciaLabel.setBounds(20, 20, 300, 30);
		ventanaInfoBraxis.add(distanciaLabel);
		
		JLabel radioLabel = new JLabel("Diametro:                       " + diametro + "      Km");
		radioLabel.setBounds(20, 40, 300, 30);
		ventanaInfoBraxis.add(radioLabel);
		
		JLabel superficieLabel = new JLabel("Superficie:                     " + superficie + "        Km^2");
		superficieLabel.setBounds(20, 60, 300, 30);
		ventanaInfoBraxis.add(superficieLabel);
		
		JLabel volumenLabel = new JLabel("Volumen:                        " + volumen + "     Km^3");
		volumenLabel.setBounds(20, 80, 300, 30);
		ventanaInfoBraxis.add(volumenLabel);
		
		JLabel masaLabel = new JLabel("Masa:                              " + masa + "        Kg");
		masaLabel.setBounds(20, 100, 300, 30);
		ventanaInfoBraxis.add(masaLabel);
		
		JLabel densidadLabel = new JLabel("Densidad:                       " + densidad + "            g/Cm^3");
		densidadLabel.setBounds(20, 120, 300, 30);
		ventanaInfoBraxis.add(densidadLabel);
		
		JButton ok = new JButton("OK");
		ok.setBounds(20, 180, 240, 50);
		ventanaInfoBraxis.add(ok);
		
		ok.addActionListener(
				new ActionListener(){
					
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e){
						
						ventanaInfoBraxis.hide();
						
					}
				}
		);
		
		ventanaInfoBraxis.setPreferredSize(new Dimension(300, 300));
		
		ventanaInfoBraxis.pack();
		ventanaInfoBraxis.setVisible(true);
	}
}
