module oop.project.codes.project {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.project.codes.project to javafx.fxml;
    exports oop.project.codes.project;
}