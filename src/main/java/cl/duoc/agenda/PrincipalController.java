package cl.duoc.agenda;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrincipalController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtCorreo;
    @FXML private TextField txtTelefono;
    @FXML private Label lblMensaje;

    @FXML
    private void initialize() {
        lblMensaje.setText("");
    }

    @FXML
    private void onAgregar() {
        String nombre = txtNombre.getText().trim();
        String correo = txtCorreo.getText().trim();
        String telefono = txtTelefono.getText().trim();

        lblMensaje.setText("Contacto: " + nombre + " | " + correo + " | " + telefono);
    }
}