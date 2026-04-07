package calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class Main extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        // Cargar el archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));

        // Crear la escena y configurar la ventana
        Scene scene = new Scene(root, 700, 500);

        primaryStage.setTitle("Calculadora JAVA -  Taller 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
