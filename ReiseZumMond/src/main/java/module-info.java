module com.example.reisezummond {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.reisezummond to javafx.fxml;
    exports com.example.reisezummond;
}