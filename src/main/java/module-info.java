module com.example.encapsulacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.encapsulacion to javafx.fxml;
    exports com.example.encapsulacion;
}