module com.example.exercice4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.exercice4 to javafx.fxml;
    exports com.example.exercice4;
}