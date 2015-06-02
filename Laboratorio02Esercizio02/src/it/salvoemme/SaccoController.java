package it.salvoemme;

import it.salvoemme.model.SaccoModel;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SaccoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblStatus;

    @FXML
    private Button btnStart;

    @FXML
    private TextField txtGuess;

    @FXML
    private Button btnGuess;

    @FXML
    private CheckBox chkWordOk;

    @FXML
    private CheckBox chkWordDuplicate;

    @FXML
    private CheckBox chkWordWrong;

    @FXML
    private Label lblTotalWords;

    @FXML
    private Label lblTotalWrong;
    
    private SaccoModel model;
    
    public void setModel(SaccoModel model){
    	this.model = model;
    }
    
    @FXML
    void doInsert(ActionEvent event) {
//    	model.addWord(txtGuess.getText());
    	setChk(model.addWord(txtGuess.getText()));
    		if (model.getGuessWrong() == 10)
    			finishGame();
    		
    }

    @FXML
    void doStart(ActionEvent event) {
    	otherOrNewGame();
    }

    @FXML
    void initialize() {
        assert lblStatus != null : "fx:id=\"lblStatus\" was not injected: check your FXML file 'Sacco.fxml'.";
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'Sacco.fxml'.";
        assert txtGuess != null : "fx:id=\"txtGuess\" was not injected: check your FXML file 'Sacco.fxml'.";
        assert btnGuess != null : "fx:id=\"btnGuess\" was not injected: check your FXML file 'Sacco.fxml'.";
        assert chkWordOk != null : "fx:id=\"chkWordOk\" was not injected: check your FXML file 'Sacco.fxml'.";
        assert chkWordDuplicate != null : "fx:id=\"chkWordDuplicate\" was not injected: check your FXML file 'Sacco.fxml'.";
        assert chkWordWrong != null : "fx:id=\"chkWordWrong\" was not injected: check your FXML file 'Sacco.fxml'.";
        assert lblTotalWords != null : "fx:id=\"lblTotalWords\" was not injected: check your FXML file 'Sacco.fxml'.";
        assert lblTotalWrong != null : "fx:id=\"lblTotalWrong\" was not injected: check your FXML file 'Sacco.fxml'.";
        this.btnGuess.setDisable(true);
        this.lblTotalWords.setText("");
        this.lblTotalWrong.setText("");
        this.chkWordDuplicate.setDisable(true);
        this.chkWordOk.setDisable(true); 
        this.chkWordWrong.setDisable(true);
        this.txtGuess.setText("");
    }
    
    void otherOrNewGame(){
    	this.btnStart.setDisable(true);
    	this.btnGuess.setDisable(false);
    	setLblStatus("");
    	model.setGuessWrong(0);
    	model.getParole().clear();
    }
    
    void finishGame(){
    	this.btnStart.setDisable(false);
    	this.btnGuess.setDisable(true);
        this.lblTotalWords.setText("");
        this.lblTotalWrong.setText("");
        this.chkWordDuplicate.setDisable(true);
        this.chkWordOk.setDisable(true); 
        this.chkWordWrong.setDisable(true);
        this.txtGuess.setText("");
        setLblStatus("Hai commesso 10 errori, ritenta!");
    }
    
    void setLblStatus(String messaggio){
    	this.lblStatus.setText("Status: " + messaggio);
    }
    
    void setLblTotalWords(){
    	this.lblTotalWords.setText("Totale parole inserite " + model.getParole().size());
    }
    
    void setLblTotalWrong(){
    	this.lblTotalWrong.setText("Totale errori " + model.getGuessWrong());
    }
    
    void setChk(int risultato){
    	switch (risultato){
    	case 1:
    		this.chkWordOk.setSelected(true);
    		this.chkWordDuplicate.setSelected(false);
    		this.chkWordWrong.setSelected(false);
    		break;
    	case 2:
    		this.chkWordOk.setSelected(false);
    		this.chkWordDuplicate.setSelected(true);
    		this.chkWordWrong.setSelected(false);
    		break;
    	case 3:
    		this.chkWordOk.setSelected(false);
    		this.chkWordDuplicate.setSelected(false);
    		this.chkWordWrong.setSelected(true);
    		break;
    	}
    	setLblTotalWords();
    	setLblTotalWrong();
    }
}
