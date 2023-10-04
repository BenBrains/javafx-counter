package com.fyxren.counter;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    int count = 0;

    @FXML
    private TextField countField;

    @FXML
    protected void onAdd() {
        count++;
        countField.setText(String.valueOf(count));
    }

    @FXML
    protected void onReset() {
        count = 0;
        countField.setText(String.valueOf(count));
    }
}