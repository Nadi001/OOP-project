package oop.project.codes.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SystemReliabilityDashboard extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("System Reliability Dashboard");

        // Create UI elements
        Label serverStatusIndicator = new Label("Status: Unknown");
        Button healthCheckButton = new Button("Run Health Check");
        Button maintenanceButton = new Button("Schedule Maintenance");
        Button viewLogsButton = new Button("View Logs");

        // Set up button actions
        healthCheckButton.setOnAction(e -> runHealthCheck(serverStatusIndicator));
        maintenanceButton.setOnAction(e -> scheduleMaintenance());
        viewLogsButton.setOnAction(e -> viewLogs());

        // Create layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(serverStatusIndicator, healthCheckButton, maintenanceButton, viewLogsButton);

        // Set up the scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void runHealthCheck(Label serverStatusIndicator) {
        boolean isHealthy = checkServerHealth();
        updateServerStatus(serverStatusIndicator, isHealthy);
    }

    private void scheduleMaintenance() {
        System.out.println("Maintenance scheduled.");
    }

    private void viewLogs() {
        System.out.println("Viewing logs...");
    }

    private boolean checkServerHealth() {
        // Simulating health check
        return true; // Assume server is healthy
    }

    private void updateServerStatus(Label serverStatusIndicator, boolean isHealthy) {
        if (isHealthy) {
            serverStatusIndicator.setText("Status: ✔️ Healthy");
            serverStatusIndicator.setTextFill(Color.GREEN);
        } else {
            serverStatusIndicator.setText("Status: ❌ Unhealthy");
            serverStatusIndicator.setTextFill(Color.RED);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
