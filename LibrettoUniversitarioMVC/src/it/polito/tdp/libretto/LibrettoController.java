package it.polito.tdp.libretto;

import it.polito.tdp.libretto.model.Esame;
import it.polito.tdp.libretto.model.LibrettoModel;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LibrettoController {

	private LibrettoModel model; 
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtCorso;

    @FXML
    private TextField txtVoto;

    @FXML
    private DatePicker txtData;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextField txtEsami;

    @FXML
    private TextField txtMedia;

    @FXML
    private Button btnVisualizza;

    @FXML
    private TextArea txtResult;

    public void setModel(LibrettoModel model){
    	this.model = model;
    }
    
    @FXML
    void doInserisci(ActionEvent event) {
    	LocalDate data = txtData.getValue();
    	String corso = txtCorso.getText();
    	int voto = Integer.parseInt(txtVoto.getText());
    	
    	model.addEsame(new Esame(data,corso,voto));
    	
    	txtEsami.setText(String.format("%d", model.getNumeroEsami()));
    	txtMedia.setText(String.format("%.2f", model.getMedia()));
    }

    @FXML
    void doVisualizza(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtCorso != null : "fx:id=\"txtCorso\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtEsami != null : "fx:id=\"txtEsami\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtMedia != null : "fx:id=\"txtMedia\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert btnVisualizza != null : "fx:id=\"btnVisualizza\" was not injected: check your FXML file 'Libretto.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Libretto.fxml'.";

    }
}
