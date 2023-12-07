module com.example.projects {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.projects to javafx.fxml;
    exports com.example.projects;
}