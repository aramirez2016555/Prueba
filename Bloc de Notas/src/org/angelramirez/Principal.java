package org.angelramirez;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    private final String PAQUETE_VISTA = "/org/angelramirez/view/";
    private Stage escenarioPrincipal;
    private Scene escena;

    @Override
    public void start(Stage primaryStage) throws Exception {
            this.escenarioPrincipal = escenarioPrincipal;
       this.escenarioPrincipal.setTitle("Sales App");
       Parent root = FXMLLoader.load(getClass().getResource("/org/angelramirez/view/MenuPrincipalView.fxml"));
       Scene escena = new Scene(root);
       escenarioPrincipal.setScene(escena);
       escenarioPrincipal.show();
    }
    }
