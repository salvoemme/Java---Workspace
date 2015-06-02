package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
