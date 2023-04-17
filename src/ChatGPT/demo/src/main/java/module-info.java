module prueba {
    requires javafx.controls;
    requires javafx.fxml;

    opens prueba to javafx.fxml;
    exports prueba;
}
