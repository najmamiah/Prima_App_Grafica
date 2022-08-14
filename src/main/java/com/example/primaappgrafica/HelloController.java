package com.example.primaappgrafica;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label LabelDaNascondere;

    public void NascondiTitolo(ActionEvent actionEvent) {
        LabelDaNascondere.setOpacity(0);
    }
}