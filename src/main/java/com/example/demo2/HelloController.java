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
    private Label questionTextField;

    @FXML
    private Label AtextField;

    @FXML
    private Label BtextField;

    @FXML
    private Label CtextField;

    @FXML
    private Label DtextField;

    @FXML
    private CheckBox P1CheckBox;

    @FXML
    private CheckBox P2CheckBox;

    @FXML
    private CheckBox P3CheckBox;

    @FXML
    private CheckBox P4CheckBox;

    @FXML
    public BorderPane borderpane;

    @FXML
    public Button option1;

    @FXML
    private Button Abutton;

    @FXML
    private Button Bbutton;

    @FXML
    private Button Cbutton;

    @FXML
    private Button Dbutton;

    @FXML
    public ProgressBar P1ProgressBar;

    @FXML
    public ProgressIndicator P1ProgressIndicator;

    @FXML
    private ProgressBar P2ProgressBar;

    @FXML
    private ProgressIndicator P2ProgressIndicator;

    @FXML
    private ProgressBar P3ProgressBar;

    @FXML
    private ProgressIndicator P3ProgressIndicator;

    @FXML
    private ProgressBar P4ProgressBar;

    @FXML
    private ProgressIndicator P4ProgressIndicator;


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

    @FXML
    void BbuttonClicked(ActionEvent event) {

    }

    @FXML
    void CbuttonClicked(ActionEvent event) {

    }

    @FXML
    void DbuttonClicked(ActionEvent event) {

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