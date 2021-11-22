package com.mycompany.exameninterfaces;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private Label txtGuardar;
    @FXML
    private TextField txtCliente;
    @FXML
    private CheckBox cbHombre;
    @FXML
    private CheckBox cbMujer;
    @FXML
    private CheckBox cbOtro;
    @FXML
    private Spinner<Integer> spPeso;
    @FXML
    private TextField txtAltura;
    @FXML
    private DatePicker dtFecha;
    @FXML
    private ComboBox<String> cbActividad;
    @FXML
    private ComboBox<String> cbFisico;
    @FXML
    private Button btnCalcular;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }


    @FXML
    private void calcular(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Configurar el spinner
        SpinnerValueFactory svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,200,0,1);
        spPeso.setValueFactory(svf);
        
        cbActividad.getItems().clear();
        cbActividad.getItems().addAll("Sedentaria","Deportista","Mixta");
        //Poner por defecto
        cbActividad.setValue("Deportista");
        
        //Añade items al comboBox
        cbFisico.getItems().clear();
        cbFisico.getItems().addAll("delgado","gordo","corpulento","musculoso");
        cbFisico.setValue("delgado");
        
        //Fecha actual
        dtFecha.setValue( LocalDate.now());
    }
}
