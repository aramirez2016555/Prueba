package org.angelramirez.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.angelramirez.Principal;

public class MenuPrincipalController implements Initializable{
    private Principal escenarioPrincipal;

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
}
