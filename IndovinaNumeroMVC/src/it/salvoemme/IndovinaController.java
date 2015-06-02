package it.salvoemme;

import it.salvoemme.model.IndovinaModel;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class IndovinaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblStatus;

    @FXML
    private Button btnStart;

    @FXML
    private TextField txtNumberGuess;

    @FXML
    private Button btnInsert;

    @FXML
    private Label lblGuess;
    
    private IndovinaModel model;  
    
    public IndovinaModel getModel() {
		return model;
	}

	public void setModel(IndovinaModel model) {
		this.model = model;
	}

	@FXML
    void DoInsert(ActionEvent event) {
		int s=0;
		boolean continua = true;
		try {
			s = Integer.parseInt(txtNumberGuess.getText());
		} catch (NumberFormatException e) {
			setLblStatus("Inserire un valore numerico");
			continua = false;
			
		}
		if (continua){
			if (model.insertGuess(s)){
				if (model.getLuckyNumber() == s){
					setLblStatus("Hai vinto!");	
					buttonAnotherGame();
				}
				else{
					if (s > model.getLuckyNumber())
						setLblStatus("Hai inserito un numero più grande");
					else
						setLblStatus("Hai inserito un numero più piccolo");
				}
			}else{
				setLblStatus("Valore già inserito");
			}
		}
		txtNumberGuess.setText("");
		setLblGuess();
    }

    @FXML
    void doStart(ActionEvent event) {
    	btnStart.setDisable(true);
    	btnInsert.setDisable(false);
    	setLblStatus("Partita iniziata");
    	setLblGuess();
    }

    @FXML
    void initialize() {
        assert lblStatus != null : "fx:id=\"lblStatus\" was not injected: check your FXML file 'Indovina.fxml'.";
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'Indovina.fxml'.";
        assert txtNumberGuess != null : "fx:id=\"txtNumberGuess\" was not injected: check your FXML file 'Indovina.fxml'.";
        assert btnInsert != null : "fx:id=\"btnInsert\" was not injected: check your FXML file 'Indovina.fxml'.";
        assert lblGuess != null : "fx:id=\"lblGuess\" was not injected: check your FXML file 'Indovina.fxml'.";
        buttonAnotherGame();
        lblGuess.setText("");
    }

	private void buttonAnotherGame() {
		model = new IndovinaModel();
		btnStart.setDisable(false);
        btnInsert.setDisable(true);
	}
    
    void setLblStatus (String messaggio){
    	lblStatus.setText("Status: " + messaggio);
    }
    
    void setLblGuess (){
    	lblGuess.setText("Tentativo n°" + model.getNumberOfGuess());
    }
}

