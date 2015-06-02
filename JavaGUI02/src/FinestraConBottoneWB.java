import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class FinestraConBottoneWB {
	Container contenuto = null;
	
	public FinestraConBottoneWB(){
		JFrame finestra = new JFrame("Esempio con Listener");
		finestra.setBounds(100, 100, 180, 200);
		contenuto = finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto,BoxLayout.Y_AXIS));
		
		JButton b1 = new JButton("Bottone WB");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent ea) {
				((JButton)ea.getSource()).setForeground(Color.RED);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				((JButton)e.getSource()).setForeground(Color.GREEN);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				((JButton)e.getSource()).setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				((JButton)e.getSource()).setForeground(Color.BLACK);
			}
		});

		contenuto.add(b1);

		JTextField cognome = new JTextField();
		cognome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				JTextField l1 = (JTextField)e.getSource();
				l1.setText(l1.getText().toUpperCase());
			}
		});

	
		
		contenuto.add(cognome);
		
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

