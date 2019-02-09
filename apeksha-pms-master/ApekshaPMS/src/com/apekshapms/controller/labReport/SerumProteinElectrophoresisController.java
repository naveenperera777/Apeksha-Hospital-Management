package com.apekshapms.controller.labReport;


import com.apekshapms.controller.Controller;
import com.apekshapms.model.LabReport;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class SerumProteinElectrophoresisController implements Controller{

    @FXML
    private DatePicker date;

    @FXML
    private TextField PatientIDTextField;

    @FXML
    private Label ReportTypeLabel;

    @FXML
    private TextField PatientNameTextField;

    @FXML
    private TextField ReferenceTextField;

    @FXML
    private TextArea RemarksTextField;

    @FXML
    private TextField AlbumineeTextField;

    @FXML
    private TextField Alpha1TextField;

    @FXML
    private TextField Alpha2TextField;

    @FXML
    private TextField BetaTextTextField;

    @FXML
    private TextField GammaTextField;

    @FXML
    private Button SubmitButton;

    @FXML
    private Button CancelButton;

    private LabReport labReport ;

    public void initialize(URL location, ResourceBundle resources) {
        SubmitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                labReport.setID(PatientIDTextField.getText());
                labReport.setName(PatientNameTextField.getText());
                labReport.setDate(date.getValue());
                labReport.setReference(ReferenceTextField.getText());
                labReport.setRemarks(RemarksTextField.getText());
                labReport.setAlbuminee(AlbumineeTextField.getText());
                labReport.setAplha1(Alpha1TextField.getText());
                labReport.setAlpha2(Alpha2TextField.getText());
                labReport.setBeta(BetaTextTextField.getText());
                labReport.setGamma(GammaTextField.getText());

            }});}


    @Override
    public void refreshView() {

    }
}
