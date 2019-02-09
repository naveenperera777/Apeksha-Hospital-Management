package com.apekshapms.controller.admin;

import com.apekshapms.controller.Controller;
import com.apekshapms.controller.DashboardController;
import com.apekshapms.controller.PatientHistoryController;
import com.apekshapms.controller.main.AdminDashboardController;
import com.apekshapms.factory.UIFactory;
import com.apekshapms.ui.UI;
import com.apekshapms.ui.UIName;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Thilina on 10/10/2017.
 * Univercity of Colombo School of Computing
 */
public class ReportDashboardController implements Controller {
    @FXML
    private Button addReportButton;

    @Override
    public void refreshView() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addReportButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                UI ui = UIFactory.getUI(UIName.LAB_OVERVIEW);
                Parent parent = ui.getParent();
                AdminDashboardController adminDashboardController = ((AdminDashboardController) (UIFactory.getUI(UIName.ADMIN_DASHBOARD).getController()));
                adminDashboardController.setWorkspace(parent);
            }
        });

    }
}
