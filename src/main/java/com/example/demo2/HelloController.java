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
    private RadioButton Abutton;

    @FXML
    private RadioButton Bbutton;

    @FXML
    private RadioButton Cbutton;

    @FXML
    private RadioButton Dbutton;

    @FXML
    private Label statusLabel;

    @FXML
    private CheckBox P1CheckBox;

    @FXML
    public BorderPane borderpane;

    @FXML
    public Button option1;


    private String myAnswer;
    private String[][] options;
    private String[][] questions;

    @FXML
    private Label answerBox = new Label();

    @FXML
    private Label questionBox = new Label();


    @FXML
    void category1Btn(ActionEvent event) {

        options = Main.answers.get("Authentication");
        questions = Main.questions.get("Authentication");
        int qNum = random.nextInt(questions.length);
        myAnswer = Main.getAnswer(questions, qNum);
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category2Btn(ActionEvent event) {
        options = Main.answers.get("Privacy");
        questions = Main.questions.get("Privacy");
        int qNum = random.nextInt(questions.length);
        myAnswer = Main.getAnswer(questions, qNum);
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category3Btn(ActionEvent event) {
        options = Main.answers.get("Confidentiality");
        questions = Main.questions.get("Confidentiality");
        int qNum = random.nextInt(questions.length);
        myAnswer = Main.getAnswer(questions, qNum);;
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category4Btn(ActionEvent event) {
        options = Main.answers.get("Passwords");
        questions = Main.questions.get("Passwords");
        int qNum = random.nextInt(questions.length);
        myAnswer = Main.getAnswer(questions, qNum);
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category5Btn(ActionEvent event) {
        options = Main.answers.get("Network");
        questions = Main.questions.get("Network");
        int qNum = random.nextInt(questions.length);
        myAnswer = Main.getAnswer(questions, qNum);
        displayQuestionsAnswers(qNum);
    }

    @FXML
    void category6Btn(ActionEvent event) {
        options = Main.answers.get("Security");
        questions = Main.questions.get("Security");
        int qNum = random.nextInt(questions.length);
        myAnswer = Main.getAnswer(questions, qNum);
        displayQuestionsAnswers(qNum);
    }

    void displayQuestionsAnswers(int questionNumber){
        questionBox.setWrapText(true);
        answerBox.setWrapText(true);
        questionBox.setText(questions[questionNumber][0]);
        answerBox.setText(Main.displayOptions(options, questionNumber));
    }
}