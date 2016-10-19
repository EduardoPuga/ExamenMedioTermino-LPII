import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args){
		
		System.out.println("Arrancando Sistema Solar...");
		
		final JFrame MainMenu = new JFrame("Menu");
		MainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainMenu.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Desea iniciar la simulacion");
		label1.setBounds(60, 15, 200, 30);
		
		MainMenu.add(label1);
		
		JButton yes = new JButton("Yes");
		yes.setBounds(60, 50, 70, 30);
		
		MainMenu.add(yes);
		
		JButton no = new JButton("no");
		no.setBounds(140, 50, 70, 30);
		
		MainMenu.add(no);
		
		MainMenu.setPreferredSize(new Dimension(300, 150));
		
		MainMenu.pack();
		MainMenu.setVisible(true);
		MainMenu.setLocationRelativeTo(null);
		
		yes.addActionListener(
				new ActionListener(){
					
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e){
						
						MainMenu.hide();
						SistemaSolar sistemaSolar = new SistemaSolar();
						sistemaSolar.executeStar();
						
						Hilos vida = new Hilos("");
						vida.isAlive = true;
						
						
					}
				}
		);
		
		no.addActionListener(
				new ActionListener(){
					
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e){
						
						MainMenu.hide();
						System.out.println("Saliendo");
					
					}
				}
		);
	}
}
