package com.apekshapms.ui;

public enum UIName {
    DASHBOARD("/com/apekshapms/ui/view/Dashboard.fxml"),
    REGISTER_DOCTOR_DASHBOARD("/com/apekshapms/ui/view/main/RegisterDoctorDashboard.fxml"),
    CONSULTANT_DASHBOARD("/com/apekshapms/ui/view/main/ConsultantDashboard.fxml"),
    LAB_ASSISTANT_DASHBOARD("/com/apekshapms/ui/view/main/LabAssistantDashboard.fxml"),
    ADMIN_DASHBOARD("/com/apekshapms/ui/view/main/AdminDashboard.fxml"),


    //Admin Dashborad
    PATIENT_DASHBOARD("/com/apekshapms/ui/view/admin/PatientDashboard.fxml"),
    EMPLOYEE_DASHBOARD("/com/apekshapms/ui/view/admin/EmployeeDashboard.fxml"),
    REPORT_DASHBOARD("/com/apekshapms/ui/view/admin/ReportDashboard.fxml"),
    WARD_DASHBOARD("/com/apekshapms/ui/view/admin/WardDashboard.fxml"),
    TREATMENT_DASHBOARD("/com/apekshapms/ui/view/admin/TreatmentDashboard.fxml"),
    EXAMPLE("/com/apekshapms/ui/view/admin/Example.fxml"),

    ADMIN_SEARCH_EMPLOYEE("/com/apekshapms/ui/view/admin/AdminSearchEmployee.fxml"),


    //Report
    LAB_OVERVIEW("/com/apekshapms/ui/view/LabOverview.fxml"),

    //Lab Assistant
    ADD_REPORT("/com/apekshapms/ui/view/labAssistant/AddReport.fxml"),
    ADD_DETAILS("/com/apekshapms/ui/view/labAssistant/AddDetails.fxml"),
    CHECK_REPORT("/com/apekshapms/ui/view/labAssistant/CheckReport.fxml"),

    //Ward
    NEW_WARD("/com/apekshapms/ui/view/ward/NewWard.fxml"),
    WARD_MANAGEMENT("/com/apekshapms/ui/view/ward/WardManagement.fxml"),

    NEW_PATIENT("/com/apekshapms/ui/view/NewPatient.fxml"),
    PATIENT_HISTORY("/com/apekshapms/ui/view/PatientHistory.fxml"),
    ASSIGNING("/com/apekshapms/ui/view/Assigning.fxml"),
    SOME_LOGIN("/com/apekshapms/ui/view/SomeLogin.fxml"),
    LOGIN("/com/apekshapms/ui/view/login.fxml"),

    SEARCH_PATIENT("/com/apekshapms/ui/view/SearchPatient.fxml"),

    //Side Bar
    REGISTOR_DOCTOR_SIDEBAR("/com/apekshapms/ui/view/sidebar/RegisterDoctorSideBar.fxml"),
    LAB_ASSISTANT_SIDEBAR("/com/apekshapms/ui/view/sidebar/LabAssistantSideBar.fxml"),
    CONSULTANT_DOCTOR_SIDEBAR("/com/apekshapms/ui/view/sidebar/ConsultantDoctorSideBar.fxml");

    private final String location;

    UIName(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
