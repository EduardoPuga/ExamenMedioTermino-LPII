import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SistemaSolar extends JPanel{
	
	public void executeStar(){
		
		final JFrame sistemaSolar = new JFrame("sistemaSolar");
		sistemaSolar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sistemaSolar.getContentPane().setLayout(null);
		sistemaSolar.setUndecorated(true);
		sistemaSolar.setBackground(new Color(0, 0, 0, 0)); 
		sistemaSolar.setPreferredSize(new Dimension(1820, 980));
		
		sistemaSolar.pack();
		sistemaSolar.setVisible(true);
		
		sistemaSolar.setLocationRelativeTo(null);
		
		NewFolsom dibujarNewFolsom = new NewFolsom();
		dibujarNewFolsom.newFolsomPlanet();
		
		Kaldir dibujarKaldir = new Kaldir();
		dibujarKaldir.kaldirPlanet();
		
		Braxis dibujarBraxis = new Braxis();
		dibujarBraxis.braxisPlanet();
		
		Korhal dibujarKorhal = new Korhal();
		dibujarKorhal.korhalPlanet();
		
	}
}
