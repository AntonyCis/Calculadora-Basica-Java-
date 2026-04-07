package calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControladorCalculadora {

    @FXML private TextField txtN1;
    @FXML private TextField txtN2;
    @FXML private Label lblSalida;
    private ModeloCalculadora modelo = new ModeloCalculadora();

    @FXML
    private void sumar() {
        double n1 = Double.parseDouble(txtN1.getText());
        double n2 = Double.parseDouble(txtN2.getText());

        double resultado = modelo.sumar(n1, n2);

        lblSalida.setText(String.valueOf(resultado));
    }

    @FXML
    private void restar() {
        double n1 = Double.parseDouble(txtN1.getText());
        double n2 = Double.parseDouble(txtN2.getText());

        double resultado = modelo.restar(n1, n2);

        lblSalida.setText(String.valueOf(resultado));
    }

    @FXML
    private void multiplicar() {
        double n1 = Double.parseDouble(txtN1.getText());
        double n2 = Double.parseDouble(txtN2.getText());

        double resultado = modelo.multiplicar(n1, n2);

        lblSalida.setText(String.valueOf(resultado));
    }

    @FXML
    private void dividir() {
        double n1 = Double.parseDouble(txtN1.getText());
        double n2 = Double.parseDouble(txtN2.getText());
        // La validacion clasica de la division
        if (n2 != 0) {
            double resultado = modelo.dividir(n1, n2);
            lblSalida.setText(String.valueOf(resultado));
        } else {
            lblSalida.setText("Error: Div / 0");
        }
    }

    @FXML
    private void limpiar() {
        txtN1.clear();
        txtN2.clear();
        lblSalida.setText("0.0");
        txtN1.requestFocus(); // Esto es para que se selecciones automaticamente el primer recuadro despues de limpiar
    }
}