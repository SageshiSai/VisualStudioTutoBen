package prueba;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Creamos la etiqueta del título
        Label title = new Label("Inicio de sesión");
        title.setFont(new Font("Arial", 20));
        
        // Creamos los campos de entrada de usuario y contraseña
        Label userLabel = new Label("Usuario:");
        TextField userField = new TextField();
        Label passLabel = new Label("Contraseña:");
        PasswordField passField = new PasswordField();
        
        // Creamos un botón para iniciar sesión
        Button loginButton = new Button("Iniciar sesión");
        Button registerButton = new Button("Registrarse");
        
        // Creamos un VBox para organizar los componentes
        VBox vbox = new VBox(20, title, userLabel, userField, passLabel, passField, loginButton, registerButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));
        
        // Creamos un GridPane para dar estilo a la ventana
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(vbox, 0, 0);
        
        // Creamos una escena y mostramos la ventana
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Inicio de sesión");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}