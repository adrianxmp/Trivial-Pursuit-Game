package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private CheckBox P1CheckBox;

    @FXML
    public BorderPane borderpane;

    @FXML
    public Button option1;

    @FXML
    private Button Abutton;

    @FXML
    public ProgressBar P1ProgressBar;

    @FXML
    public ProgressIndicator P1ProgressIndicator;


    @FXML
    void option1Clicked(ActionEvent event) {
        P1CheckBox.setSelected(false);
    }

    @FXML
    void AbuttonClicked(ActionEvent event) {
        if (P1CheckBox.isSelected()){
            progress(P1ProgressIndicator);
            progress(P1ProgressBar);
        }
        P1CheckBox.setSelected(false);
    }

    public void progress(ProgressIndicator p){
        double value = p.getProgress();
        if (value < 0){
            value = 0.1;
        }else {
            value = value + 0.17;
            if (value >= 1.0){
                value = 1.0;
            }
        }
        p.setProgress(value);
    }

    @FXML
    void category1Btn(ActionEvent event) {

    }

    @FXML
    void category2Btn(ActionEvent event) {

    }

    @FXML
    void category3Btn(ActionEvent event) {

    }

    @FXML
    void category4Btn(ActionEvent event) {

    }

    @FXML
    void category5Btn(ActionEvent event) {

    }

    @FXML
    void category6Btn(ActionEvent event) {

    }
}