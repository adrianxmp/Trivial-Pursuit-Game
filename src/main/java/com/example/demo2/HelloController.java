package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import org.jetbrains.annotations.NotNull;

import static com.example.demo2.Main.random;

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

    private String myAnswer;
    private String[][] options;
    private String[][] questions;

    @FXML
    private Label answerBox = new Label();

    @FXML
    private Label questionBox = new Label();

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

        options = Main.answers.get("Authentication");
        questions = Main.questions.get("Authentication");
        int qNum = random.nextInt(questions.length);

//        for (int i = 1; i < options[qNum].length;i++) {
//            // Loop through each element in the current row
//            System.out.println(options[qNum][i]);
//
//        }
        myAnswer = Main.playGame("Authentication");
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category2Btn(ActionEvent event) {
        options = Main.answers.get("Privacy");
        questions = Main.questions.get("Privacy");
        int qNum = random.nextInt(questions.length);

//        for (int i = 1; i < options[qNum].length;i++) {
//            // Loop through each element in the current row
//            System.out.println(options[qNum][i]);
//
//        }
        myAnswer = Main.playGame("Privacy");
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category3Btn(ActionEvent event) {
        options = Main.answers.get("Confidentiality");
        questions = Main.questions.get("Confidentiality");
        int qNum = random.nextInt(questions.length);

//        for (int i = 1; i < options[qNum].length;i++) {
//            // Loop through each element in the current row
//            System.out.println(options[qNum][i]);
//
//        }
        myAnswer = Main.playGame("Confidentiality");
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category4Btn(ActionEvent event) {
        options = Main.answers.get("Passwords");
        questions = Main.questions.get("Passwords");
        int qNum = random.nextInt(questions.length);

//        for (int i = 1; i < options[qNum].length;i++) {
//            // Loop through each element in the current row
//            System.out.println(options[qNum][i]);
//
//        }
        myAnswer = Main.playGame("Passwords");
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category5Btn(ActionEvent event) {
        options = Main.answers.get("Network");
        questions = Main.questions.get("Network");
        int qNum = random.nextInt(questions.length);

//        for (int i = 1; i < options[qNum].length;i++) {
//            // Loop through each element in the current row
//            System.out.println(options[qNum][i]);
//
//        }
        myAnswer = Main.playGame("Network");
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category6Btn(ActionEvent event) {
        options = Main.answers.get("Security");
        questions = Main.questions.get("Security");
        int qNum = random.nextInt(questions.length);

//        for (int i = 1; i < options[qNum].length;i++) {
//            // Loop through each element in the current row
//            System.out.println(options[qNum][i]);
//
//        }
        myAnswer = Main.playGame("Security");
        displayQuestionsAnswers(qNum);
    }

    void displayQuestionsAnswers(int questionNumber){
        questionBox.setText(questions[questionNumber][0]);
        answerBox.setText(Main.displayOptions(options, questionNumber));
    }
}