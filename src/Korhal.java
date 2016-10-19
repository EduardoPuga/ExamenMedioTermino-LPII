import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Korhal {

	public void korhalPlanet(){
		
		Hilos hiloKorhal = new Hilos("hiloKorhal");
		
		hiloKorhal.setMensaje("Hilo Prueba Korhal");
		hiloKorhal.setAlive(true);
		hiloKorhal.start();
		
		final JFrame korhalFrame = new JFrame();
		korhalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		korhalFrame.getContentPane().setLayout(null);
		korhalFrame.setUndecorated(true);
		korhalFrame.setBackground(new Color(0, 0, 0, 0)); 
		korhalFrame.setBounds(770, 30, 150, 150);
		korhalFrame.setPreferredSize(new Dimension(150, 165));
		
		JButton korhalButton = new JButton("");
		korhalButton.setBorderPainted(false);
		korhalButton.setBackground(new Color(0, 0, 0, 0)); 
		korhalButton.setBounds(0, 0, 150, 150);
		ImageIcon korhalImg = new ImageIcon(getClass().getResource("Korhal_SC2_DevArt1.png"));
		korhalButton.setIcon(korhalImg);
		
		korhalFrame.add(korhalButton);
		
		JLabel korhalLabel = new JLabel("Korhal");
		korhalLabel.setBounds(55, 150, 150, 10);
		
		korhalFrame.add(korhalLabel);
		
		korhalButton.addActionListener(
				new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
					
						Korhal info = new Korhal();
						info.infoPlanet();
						
					}
				}
		);
		
		korhalFrame.pack();
		korhalFrame.setVisible(true);
		
	}
	
	
	public void infoPlanet(){
		
		double distanciaAlSol = 		778500000; //Km
		double diametro = 				139822;//Km
		double superficie = 			143000;//Km^2
		double volumen = 				143130000;//Km^3
		double masa = 					189813000;//Kg
		double densidad = 				1.3262;//g/cm^3
		
		final JFrame ventanaInfoKorhal = new JFrame("Korhal");
		ventanaInfoKorhal.getContentPane().setLayout(null);
		ventanaInfoKorhal.setBounds(1570, 700, 150, 150);
		
		JLabel distanciaLabel = new JLabel("Distancia al Sol:            " + distanciaAlSol + "         Km");
		distanciaLabel.setBounds(20, 20, 300, 30);
		ventanaInfoKorhal.add(distanciaLabel);
		
		JLabel radioLabel = new JLabel("Diametro:                       " + diametro + "        Km");
		radioLabel.setBounds(20, 40, 300, 30);
		ventanaInfoKorhal.add(radioLabel);
		
		JLabel superficieLabel = new JLabel("Superficie:                     " + superficie + "         Km^2");
		superficieLabel.setBounds(20, 60, 300, 30);
		ventanaInfoKorhal.add(superficieLabel);
		
		JLabel volumenLabel = new JLabel("Volumen:                        " + volumen + "         Km^3");
		volumenLabel.setBounds(20, 80, 300, 30);
		ventanaInfoKorhal.add(volumenLabel);
		
		JLabel masaLabel = new JLabel("Masa:                              " + masa + "       Kg");
		masaLabel.setBounds(20, 100, 300, 30);
		ventanaInfoKorhal.add(masaLabel);
		
		JLabel densidadLabel = new JLabel("Densidad:                       " + densidad + "              g/Cm^3");
		densidadLabel.setBounds(20, 120, 300, 30);
		ventanaInfoKorhal.add(densidadLabel);
		
		JButton ok = new JButton("OK");
		ok.setBounds(20, 180, 240, 50);
		ventanaInfoKorhal.add(ok);
		
		ok.addActionListener(
				new ActionListener(){
					
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e){
						
						ventanaInfoKorhal.hide();
						
					}
				}
		);
		
		ventanaInfoKorhal.setPreferredSize(new Dimension(300, 300));
		
		ventanaInfoKorhal.pack();
		ventanaInfoKorhal.setVisible(true);
	}
}
