module com.example.brrrrr {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.brrrrr to javafx.fxml;
    exports com.example.brrrrr;
}