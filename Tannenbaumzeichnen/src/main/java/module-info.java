module com.example.tannenbaumzeichnen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tannenbaumzeichnen to javafx.fxml;
    exports com.example.tannenbaumzeichnen;
}