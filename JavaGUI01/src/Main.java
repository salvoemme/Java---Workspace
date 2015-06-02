import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
//import javax.swing.border.Border;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame finestra = new JFrame("La mia prima fienstra con JAVA");
		
		finestra.setBounds(200, 100, 600, 300);
		
		//Cambiare il colore di una finrestra
		//non cambia con finestra.setBackground(Color.CYAN);
		//ha bisogno di getContentPane().
		Container contenuto = finestra.getContentPane(); 
		contenuto.setBackground(Color.GREEN);
		
		JLabel label1 = new JLabel("Il mio primo applicativo con JAVA");
		label1.setOpaque(true);
		label1.setBackground(Color.BLUE);
		label1.setForeground(Color.WHITE);
		finestra.add(label1,BorderLayout.NORTH);
		
		JLabel label2 = new JLabel("Il mia seconda label con JAVA");
		label2.setOpaque(true);
		label2.setBackground(Color.RED);
		finestra.add(label2,BorderLayout.SOUTH);

		JLabel label3 = new JLabel("Zona menù");
		label3.setOpaque(true);
		label3.setBackground(Color.YELLOW);
		finestra.add(label3,BorderLayout.WEST);
		
		JLabel label4 = new JLabel("Zona info");
		label4.setOpaque(true);
		label4.setBackground(Color.PINK);
		finestra.add(label4,BorderLayout.EAST);
		
		finestra.setVisible(true);
		
		//Chiusura on exit
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	static void pausa(int secondi){
		try {
			Thread.sleep(1000*secondi);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
