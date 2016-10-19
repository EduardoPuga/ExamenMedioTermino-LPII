import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Kaldir {

	public void kaldirPlanet(){
		
		Hilos hiloKaldir = new Hilos("hiloKaldir");
		
		hiloKaldir.setMensaje("Hilo Prueba Kaldir");
		hiloKaldir.setAlive(true);
		hiloKaldir.start();
		
		final JFrame kaldirFrame = new JFrame();
		kaldirFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kaldirFrame.getContentPane().setLayout(null);
		kaldirFrame.setUndecorated(true);
		kaldirFrame.setBackground(new Color(0, 0, 0, 0)); 
		kaldirFrame.setBounds(850, 310, 50, 50);
		kaldirFrame.setPreferredSize(new Dimension(50, 65));
		
		JButton kaldirButton = new JButton("");
		kaldirButton.setBorderPainted(false);
		kaldirButton.setBackground(new Color(0, 0, 0, 0)); 
		kaldirButton.setBounds(0, 0, 50, 50);
		ImageIcon kaldirImg = new ImageIcon(getClass().getResource("Kaldir_SC2_DevArt1.png"));
		kaldirButton.setIcon(kaldirImg);
		
		kaldirFrame.add(kaldirButton);
		
		JLabel kaldirLabel = new JLabel("Kaldir");
		kaldirLabel.setBounds(10, 50, 50, 10);
		
		kaldirFrame.add(kaldirLabel);
		
		kaldirButton.addActionListener(
				new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
					
						Kaldir info = new Kaldir();
						info.infoPlanet();
						
					}
				}
		);
		
		kaldirFrame.pack();
		kaldirFrame.setVisible(true);
		
	}
	
	
	public void infoPlanet(){
		
		double distanciaAlSol = 		108208930; //Km
		double diametro = 				12103.6;//Km
		double superficie = 			460000000;//Km^2
		double volumen = 				928430000;//Km^3
		double masa = 					486900000;//Kg
		double densidad = 				5.24;//g/cm^3
		
		final JFrame ventanaInfoKaldir = new JFrame("Kaldir");
		ventanaInfoKaldir.getContentPane().setLayout(null);
		ventanaInfoKaldir.setBounds(1570, 700, 50, 50);
		
		JLabel distanciaLabel = new JLabel("Distancia al Sol:            " + distanciaAlSol + "     Km");
		distanciaLabel.setBounds(20, 20, 300, 30);
		ventanaInfoKaldir.add(distanciaLabel);
		
		JLabel radioLabel = new JLabel("Diametro:                       " + diametro + "               Km");
		radioLabel.setBounds(20, 40, 300, 30);
		ventanaInfoKaldir.add(radioLabel);
		
		JLabel superficieLabel = new JLabel("Superficie:                     " + superficie + "                   Km^2");
		superficieLabel.setBounds(20, 60, 300, 30);
		ventanaInfoKaldir.add(superficieLabel);
		
		JLabel volumenLabel = new JLabel("Volumen:                        " + volumen + "            Km^3");
		volumenLabel.setBounds(20, 80, 300, 30);
		ventanaInfoKaldir.add(volumenLabel);
		
		JLabel masaLabel = new JLabel("Masa:                              " + masa + "               Kg");
		masaLabel.setBounds(20, 100, 300, 30);
		ventanaInfoKaldir.add(masaLabel);
		
		JLabel densidadLabel = new JLabel("Densidad:                       " + densidad + "                     g/Cm^3");
		densidadLabel.setBounds(20, 120, 300, 30);
		ventanaInfoKaldir.add(densidadLabel);
		
		JButton ok = new JButton("OK");
		ok.setBounds(20, 180, 240, 50);
		ventanaInfoKaldir.add(ok);
		
		ok.addActionListener(
				new ActionListener(){
					
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e){
						
						ventanaInfoKaldir.hide();
						
					}
				}
		);
		
		ventanaInfoKaldir.setPreferredSize(new Dimension(300, 300));
		
		ventanaInfoKaldir.pack();
		ventanaInfoKaldir.setVisible(true);
	}	
}
