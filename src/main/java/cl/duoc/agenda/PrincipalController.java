package cl.duoc.agenda;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrincipalController {

    private static final String PATRON_CORREO = "^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$";
    private static final String PATRON_TELEFONO = "^\\+?\\d{8,12}$";

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

        String error = validar(nombre, correo, telefono);
        if (error != null) {
            mostrarError(error);
            return;
        }

        mostrarExito("Contacto válido: " + nombre + " | " + correo + " | " + telefono);
    }

    @FXML
    private void onLimpiar() {
        txtNombre.clear();
        txtCorreo.clear();
        txtTelefono.clear();
        lblMensaje.setText("");
        txtNombre.requestFocus();
    }

    private String validar(String nombre, String correo, String telefono) {
        if (nombre.isEmpty()) {
            txtNombre.requestFocus();
            return "El nombre es obligatorio";
        }
        if (correo.isEmpty()) {
            txtCorreo.requestFocus();
            return "El correo es obligatorio";
        }
        if (!correo.matches(PATRON_CORREO)) {
            txtCorreo.requestFocus();
            return "El correo no tiene un formato válido";
        }
        if (telefono.isEmpty()) {
            txtTelefono.requestFocus();
            return "El teléfono es obligatorio";
        }
        if (!telefono.matches(PATRON_TELEFONO)) {
            txtTelefono.requestFocus();
            return "El teléfono debe tener entre 8 y 12 dígitos";
        }
        return null;
    }

    private void mostrarError(String texto) {
        lblMensaje.setStyle("-fx-text-fill: #c62828");
        lblMensaje.setText(texto);
    }

    private void mostrarExito(String texto) {
        lblMensaje.setStyle("-fx-text-fill: #2e7d32;");
        lblMensaje.setText(texto);
    }
}