module com.example.ex1_java_interface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex1_java_interface to javafx.fxml;
    exports com.example.ex1_java_interface;
}