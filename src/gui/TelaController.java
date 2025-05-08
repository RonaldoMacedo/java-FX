package gui;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaController {
	
	@FXML
	private TextField txtNumero1;
	
	@FXML
	private TextField txtNumero2;
	
	@FXML
	private Label lblResultado;
	
	@FXML
	private Button btSoma;
	
	@FXML
	public void onBtSomaAction() {
		Locale.setDefault(Locale.US);
		double n1 = Double.parseDouble(txtNumero1.getText());
		double n2 = Double.parseDouble(txtNumero2.getText());
		double soma = n1 + n2;
		lblResultado.setText(String.format("%.2f", soma));
	}

}
