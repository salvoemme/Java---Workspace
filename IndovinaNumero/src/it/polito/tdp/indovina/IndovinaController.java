package it.polito.tdp.indovina;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class IndovinaController {

	private int numeroDaIndovinare = 0;
	private int numeroTentativi = 0;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInizio;

    @FXML
    private TextField txtGuess;

    @FXML
    private Button btnInserisci;

    @FXML
    private Label txtMessaggio;

    @FXML
    private TextField txtTentativi;
    
    @FXML
    private Button btnRedo;

    @FXML
    void doGuess(ActionEvent event) {
    	numeroTentativi++;
    	txtTentativi.setText(Integer.toString(numeroTentativi));
    	try {
			int tentativo = Integer.parseInt(txtGuess.getText());
			if (tentativo == numeroDaIndovinare){
				txtMessaggio.setText("Hai Indovinato");
				btnInizio.setDisable(false);
				btnInserisci.setDisable(true);
			}else {
				if (tentativo > numeroDaIndovinare)
					txtMessaggio.setText("Troppo Grande");
				else
					txtMessaggio.setText("Troppo piccolo");
			}
		} catch (NumberFormatException e) {
			txtMessaggio.setText("Devi inserire un valore numerico");
		}
    	txtGuess.setText("");
    	
    	
    	
    }

    @FXML
    void doIniziaPartita(ActionEvent event) {
    	btnInizio.setDisable(true);
    	btnInizio.setText("Partita Iniziata");
    	Random r = new Random();
    	numeroDaIndovinare = r.nextInt(100);
    	numeroTentativi = 0;
    	txtTentativi.setText("");
    	btnInserisci.setDisable(false);
    }

    @FXML
    void doRedo(ActionEvent event) {
    	doIniziaPartita(event);
    }
    
    @FXML
    void initialize() {
        assert btnInizio != null : "fx:id=\"btnInizio\" was not injected: check your FXML file 'Indovina.fxml'.";
        assert txtGuess != null : "fx:id=\"txtGuess\" was not injected: check your FXML file 'Indovina.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Indovina.fxml'.";
        assert txtMessaggio != null : "fx:id=\"txtMessaggio\" was not injected: check your FXML file 'Indovina.fxml'.";
        assert txtTentativi != null : "fx:id=\"txtTentativi\" was not injected: check your FXML file 'Indovina.fxml'.";
        assert btnRedo != null : "fx:id=\"btnRedo\" was not injected: check your FXML file 'Indovina.fxml'.";
        btnInserisci.setDisable(true);
    }
}

