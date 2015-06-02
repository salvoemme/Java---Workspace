package application;


import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcolatriceController {
	int uno = 0;
	int due = 0;
    @FXML
    private Label lblStatus;

    @FXML
    private TextField txtOperandoUno;

    @FXML
    private TextField txtOpernadoDue;

    @FXML
    private Button btnAdd;
    
    @FXML
    private ChoiceBox choiceBoxScelta = new ChoiceBox();
    
    @FXML
    private Button btnSubtract;

    @FXML
    private Button btnMoltiply;

    @FXML
    private Button btnDivide;

    @FXML
    private TextField txtRisultato;

    @FXML
    void doAdd(ActionEvent event) {
    	if (controlliFormali()){
    		txtRisultato.setText(Integer.toString(uno+due));
    		setLblStatus("Operazione di somma effettuata");
    	}
    }

    @FXML
    void doDivide(ActionEvent event) {
    	if (controlliFormali()){
    		if (due!=0){
    			txtRisultato.setText(Double.toString(uno*1.0/due));
        		setLblStatus("Operazione di divisione effettuata");
    		} else
    			setLblStatus("Non puoi dividere per zeo");
    	}
    }

    @FXML
    void doMoltiply(ActionEvent event) {
    	if (controlliFormali()){
    		txtRisultato.setText(Integer.toString(uno*due));
    		setLblStatus("Operazione di moltiplicazione effettuata");
    	}
    }

    @FXML
    void doSubtract(ActionEvent event) {
    	if (controlliFormali()){
    		txtRisultato.setText(Integer.toString(uno-due));
    		setLblStatus("Operazione di sottrazione effettuata");
    	}
    }
    
    @FXML
    void doEsegui(ActionEvent event) {
    	if (choiceBoxScelta.getValue() == null){
    		setLblStatus("Devi selezione una operazione");
    		return;
    	}
    	if (choiceBoxScelta.getValue().equals("Addizione"))
    		doAdd(event);
    	else if (choiceBoxScelta.getValue().equals("Sottrazione"))
    			doSubtract(event);
    	else if (choiceBoxScelta.getValue().equals("Moltiplicazione"))
    		doMoltiply(event);
    	else if (choiceBoxScelta.getValue().equals("Divisione"))
    		doDivide(event);
    }
    
    @FXML
    void doChoice(ActionEvent event) {
    	
    	System.out.println("sono qui");
    }
    
    @FXML
    void initialize() {
        assert lblStatus != null : "fx:id=\"lblStatus\" was not injected: check your FXML file 'Calcolatrice.fxml'.";
        assert txtOperandoUno != null : "fx:id=\"txtOperandoUno\" was not injected: check your FXML file 'Calcolatrice.fxml'.";
        assert txtOpernadoDue != null : "fx:id=\"txtOpernadoDue\" was not injected: check your FXML file 'Calcolatrice.fxml'.";
        assert choiceBoxScelta != null : "fx:id=\"choiceBoxScelta\" was not injected: check your FXML file 'Calcolatrice.fxml'.";
        assert btnDivide != null : "fx:id=\"btnDivide\" was not injected: check your FXML file 'Calcolatrice.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Calcolatrice.fxml'.";
        choiceBoxScelta.setItems(FXCollections.observableArrayList("Addizione","Sottrazione","Moltiplicazione","Divisione"));
        
    }
    
    boolean controlliFormali(){
    	if (txtOperandoUno.getText().isEmpty()){
    		setLblStatus("Operando uno obbligatorio");
    		return false;
    	}
    	if (txtOpernadoDue.getText().isEmpty()){
    		setLblStatus("Operando due obbligatorio");
    		return false;
    	}
    	try {
			Integer.parseInt(txtOperandoUno.getText());
		} catch (NumberFormatException e) {
			setLblStatus("Operando uno non numerico");
			return false;
		}
    	try {
			Integer.parseInt(txtOpernadoDue.getText());
		} catch (NumberFormatException e) {
			setLblStatus("Operando due non numerico");
			return false;
		}
    	uno = Integer.parseInt(txtOperandoUno.getText());
    	due = Integer.parseInt(txtOpernadoDue.getText());
    	setLblStatus("");
    	return true;	
    }

	void setLblStatus(String lblStatus) {
		this.lblStatus.setText("Status: " + lblStatus);
	}
    
}
