module com.example.wuerfel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.wuerfel to javafx.fxml;
    exports com.example.wuerfel;
}