package com.apekshapms.factory;

import com.apekshapms.controller.Controller;
import com.apekshapms.controller.DashboardController;
import com.apekshapms.controller.login.LoginController;
import com.apekshapms.controller.main.AdminDashboardController;
import com.apekshapms.controller.main.ConsultantDashboardController;
import com.apekshapms.controller.main.LabAssistantDashboardController;
import com.apekshapms.controller.main.RegisterDoctorDashboardController;
import com.apekshapms.services.SystemServices;
import com.apekshapms.ui.UI;
import com.apekshapms.ui.UIName;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.HashMap;

public class UIFactory {
    private static final HashMap<UIName, UI> UI_HASH_MAP = new HashMap<>();

    public static UI getUI(UIName uiName) {
        if (UIFactory.UI_HASH_MAP.containsKey(uiName)) {
            return UIFactory.UI_HASH_MAP.get(uiName);
        } else {
            try {
                return loadUI(uiName, uiName.getLocation());
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static UI getNewUI(UIName uiName) {
        try {
            return loadUI(uiName, uiName.getLocation());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void initializeAllUIs() {
        for (UIName uiName : UIName.values()) {
            try {
                loadUI(uiName, uiName.getLocation());
            } catch (IOException e) {
                System.out.println("UI initialization error : " + uiName.name());
                e.printStackTrace();
            }
        }
    }

    private static UI loadUI(UIName uiName, String location) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UIFactory.class.getResource(location));
        Parent parent = fxmlLoader.load();
        Controller controller = fxmlLoader.getController();

        UI ui = new UI(parent, controller);
        UIFactory.UI_HASH_MAP.put(uiName, ui);

        return ui;
    }

    public static void launchUI(UIName uiName, boolean isRefreshed) {
        UI ui = UIFactory.getUI(uiName);
        Parent parent = ui.getParent();
        if (isRefreshed) {
            Controller controller = ui.getController();
            controller.refreshView();
        }

        DashboardController dashboardController = ((DashboardController) (UIFactory.getUI(UIName.DASHBOARD).getController()));
        dashboardController.setWorkspace(parent);

        /*
        RegisterDoctorDashboardController registerDoctorDashboardController = ((RegisterDoctorDashboardController) (UIFactory.getUI(UIName.REGISTER_DOCTOR_DASHBOARD).getController()));
        registerDoctorDashboardController.setWorkspace(parent);


        LabAssistantDashboardController labAssistantDashboardController = ((LabAssistantDashboardController) (UIFactory.getUI(UIName.LAB_ASSISTANT_DASHBOARD).getController()));
        labAssistantDashboardController.setWorkspace(parent);

        ConsultantDashboardController consultantDashboardController = ((ConsultantDashboardController) (UIFactory.getUI(UIName.CONSULTANT_DASHBOARD).getController()));
        consultantDashboardController.setWorkspace(parent);


        AdminDashboardController adminDashboardController = ((AdminDashboardController) (UIFactory.getUI(UIName.ADMIN_DASHBOARD).getController()));
        adminDashboardController.setWorkspace(parent);
        */

    }
}
