package it.salvoemme;

import it.salvoemme.model.ImpiccatoModel;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class ImpiccatoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWordLucky;

    @FXML
    private Button btnStart;

    @FXML
    private ChoiceBox chkWord = new ChoiceBox(FXCollections.observableArrayList("A","B","C","D","E","F","G","H","I","J","K","L","M",
			   "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));

    @FXML
    private ProgressBar prgBarWrong = new ProgressBar(60);

    @FXML
    private TextField txtTotalWrong;

    @FXML
    private TextField txtWordMask;

    @FXML
    private TextField txtSolution;
    
    @FXML
    private Label lblStatus;

    private ImpiccatoModel model;
    
    public void setModel(ImpiccatoModel model) {
		this.model = model;
	}

	@FXML
    void initialize() {
        assert txtWordLucky != null : "fx:id=\"txtWordLucky\" was not injected: check your FXML file 'Impiccato.fxml'.";
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'Impiccato.fxml'.";
//        assert chkWord != null : "fx:id=\"chkWord\" was not injected: check your FXML file 'Impiccato.fxml'.";
        assert prgBarWrong != null : "fx:id=\"prgBarWrong\" was not injected: check your FXML file 'Impiccato.fxml'.";
        assert txtTotalWrong != null : "fx:id=\"txtTotalWrong\" was not injected: check your FXML file 'Impiccato.fxml'.";
        assert txtWordMask != null : "fx:id=\"txtWordMask\" was not injected: check your FXML file 'Impiccato.fxml'.";
        assert txtSolution != null : "fx:id=\"txtSolution\" was not injected: check your FXML file 'Impiccato.fxml'.";
        assert lblStatus != null : "fx:id=\"lblStatus\" was not injected: check your FXML file 'Impiccato.fxml'.";
        this.chkWord.setDisable(true);
        this.txtSolution.setEditable(false);
        this.txtWordMask.setEditable(false);
        this.chkWord.getItems().addAll("A","B","C","D","E","F","G","H","I","J","K","L","M",
        							   "N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
//      this.chkWord.getSelectionModel().selectFirst();
        this.chkWord.getSelectionModel().selectedItemProperty().addListener((ObservableValue observable, 
                Object oldValue, Object newValue) -> 
        {this.txtWordLucky.setText((String)newValue);
        onChange();
        });
    }

    @FXML
    void doStart(ActionEvent event) {
    	model = new ImpiccatoModel(txtWordLucky.getText(),8);
    	txtWordLucky.setText("");
    	this.chkWord.setDisable(false);
    	this.btnStart.setDisable(false);
    	this.txtSolution.setText("");
    	setProgressBar();
    	setMask();
    	setLblStatus("Partita iniziata");
    }
    
    void setProgressBar(){
    	prgBarWrong.setProgress(model.getNumberError()*1.0/model.getNumberMaxError());
    	this.txtTotalWrong.setText(Integer.toString(model.getNumberError()));
    }
    
    void setLblStatus(String messaggio){
    	this.lblStatus.setText("Status: " + messaggio);
    }
    
    void onChange(){
    	model.insertkWord(this.txtWordLucky.getText());
    	setMask();
    	setProgressBar();
    	statusGame();
    }
    
    void setMask(){
    	this.txtWordMask.setText(this.model.getWordMask());
    }
    
    void statusGame(){
    	if (model.getNumberError() == model.getNumberMaxError()||!this.txtWordMask.getText().contains("_")){
    		this.btnStart.setDisable(false);
        	this.chkWord.setDisable(true);
        	this.txtWordLucky.setText("");	
        	if (model.getNumberError() == model.getNumberMaxError()){
        		setLblStatus("Hai Perso");
        		this.txtSolution.setText(model.getWordLucky());
        	}
        		
        	if (!this.txtWordMask.getText().contains("_"))
        		setLblStatus("Hai Vinto");
    	}
    }
}
