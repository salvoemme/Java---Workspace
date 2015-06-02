import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class FinestraConBottone {
	Container contenuto = null;
	
	public FinestraConBottone(){
		JFrame finestra = new JFrame("Esempio con Listener");
		finestra.setBounds(100, 100, 180, 200);
		contenuto = finestra.getContentPane();
		contenuto.setLayout(new BoxLayout(contenuto,BoxLayout.Y_AXIS));
		
		JButton b1 = new JButton("Bottone 1");
		contenuto.add(b1);
		
		b1.addActionListener(new clickBottone());
		
		JTextField cognome = new JTextField();
//		cognome.addKeyListener(new intercettaTasti());
	
		cognome.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e){
				JTextField casella =  (JTextField)e.getSource();
				String testo = casella.getText();
				casella.setText(testo.toUpperCase());
			}
		});
		
		contenuto.add(cognome);
		
		finestra.setVisible(true);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private class intercettaTasti implements  KeyListener{
		
		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			JTextField casellaDiTesto = (JTextField)e.getSource();
			String testo = casellaDiTesto.getText();
			casellaDiTesto.setText(testo.toUpperCase());
			
		}
		
	}
	private class clickBottone implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			if (contenuto.getBackground().getRGB() == Color.gray.getRGB()){
				contenuto.setBackground(Color.cyan);
			}else{
				contenuto.setBackground(Color.gray);
			}

		}
	}
}

