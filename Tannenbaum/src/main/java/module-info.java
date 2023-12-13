module com.example.tannenbaum {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tannenbaum to javafx.fxml;
    exports com.example.tannenbaum;
}