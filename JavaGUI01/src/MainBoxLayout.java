import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;


public class MainBoxLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame finestra = new JFrame("Utilizzo di box layout");
		finestra.setBounds(100,100,500,600);
		
		Container contenuto = finestra.getContentPane();	
		contenuto.setLayout(new BoxLayout(contenuto, BoxLayout.X_AXIS));
		
		JPanel sx = new JPanel();
		JPanel dx = new JPanel();
		JPanel sep = new JPanel();
		
		
		sx.setLayout(new BoxLayout(sx, BoxLayout.Y_AXIS));
		dx.setLayout(new BoxLayout(dx, BoxLayout.Y_AXIS));
		sep.setLayout(new BoxLayout(sep, BoxLayout.Y_AXIS));

		contenuto.add(sx);
		contenuto.add(sep);
		contenuto.add(dx);
		
		contenuto.setBackground(Color.GREEN);
		
		sep.add(new JButton("Bottone 1"));
		sep.add(new JButton("Bottone 2"));
		sep.add(new JButton("Bottone 3"));
		
		JLabel label1 = new JLabel("XXXX    ");
		label1.setOpaque(true);
		label1.setBackground(Color.BLUE);
		label1.setForeground(Color.WHITE);
		sx.add(label1);
		
		JLabel label2 = new JLabel("XXXX    ");
		label2.setOpaque(true);
		label2.setBackground(Color.RED);
		dx.add(label2);
		
		finestra.setVisible(true);

		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
