package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import static com.example.demo2.Main.random;

public class HelloController {

    @FXML
    private Button Abutton;

    @FXML
    private Button Bbutton;

    @FXML
    private Button Cbutton;

    @FXML
    private Button Dbutton;

    @FXML
    private Label statusLabel;

    @FXML
    private CheckBox P1CheckBox;

    @FXML
    public BorderPane borderpane;

    @FXML
    public Button option1;

    private boolean inGame = false;
    private String myAnswer;
    private String[][] options;
    private String[][] questions;

    @FXML
    private Label answerBox = new Label();

    @FXML
    private Label questionBox = new Label();


    @FXML
    void category1Btn(ActionEvent event) {
        if(inGame){
            statusLabel.setTextFill(Color.DARKMAGENTA);
            statusLabel.setText("Choose an answer for displayed question before changing topic!");
        } else {
            inGame = true;

            options = Main.answers.get("Authentication");
            questions = Main.questions.get("Authentication");
            int qNum = random.nextInt(questions.length);
            myAnswer = Main.getAnswer(questions, qNum);
            displayQuestionsAnswers(qNum);
            statusLabel.setTextFill(Color.DARKGREEN);
            statusLabel.setText("Authentication question, please select your answer!");
        }

    }

    @FXML
    void category2Btn(ActionEvent event) {
        if(inGame){
            statusLabel.setTextFill(Color.DARKMAGENTA);
            statusLabel.setText("Choose an answer for displayed question before changing topic!");
        } else {
            inGame = true;
            options = Main.answers.get("Privacy");
            questions = Main.questions.get("Privacy");
            int qNum = random.nextInt(questions.length);
            myAnswer = Main.getAnswer(questions, qNum);
            displayQuestionsAnswers(qNum);
            statusLabel.setTextFill(Color.DARKGREEN);
            statusLabel.setText("Privacy question, please select your answer!");
        }
    }

    @FXML
    void category3Btn(ActionEvent event) {
        if(inGame){
            statusLabel.setTextFill(Color.DARKMAGENTA);
            statusLabel.setText("Choose an answer for displayed question before changing topic!");
        } else {
            inGame = true;
            options = Main.answers.get("Confidentiality");
            questions = Main.questions.get("Confidentiality");
            int qNum = random.nextInt(questions.length);
            myAnswer = Main.getAnswer(questions, qNum);
            displayQuestionsAnswers(qNum);
            statusLabel.setTextFill(Color.DARKGREEN);
            statusLabel.setText("Confidentiality question, please select your answer!");
        }
    }

    @FXML
    void category4Btn(ActionEvent event) {
        if(inGame){
            statusLabel.setTextFill(Color.DARKMAGENTA);
            statusLabel.setText("Choose an answer for displayed question before changing topic!");
        } else {
            inGame = true;
            options = Main.answers.get("Passwords");
            questions = Main.questions.get("Passwords");
            int qNum = random.nextInt(questions.length);
            myAnswer = Main.getAnswer(questions, qNum);
            displayQuestionsAnswers(qNum);
            statusLabel.setTextFill(Color.DARKGREEN);
            statusLabel.setText("Passwords question, please select your answer!");
        }
    }

    @FXML
    void category5Btn(ActionEvent event) {
        if(inGame){
            statusLabel.setTextFill(Color.DARKMAGENTA);
            statusLabel.setText("Choose an answer for displayed question before changing topic!");
        } else {
            inGame = true;
            options = Main.answers.get("Network");
            questions = Main.questions.get("Network");
            int qNum = random.nextInt(questions.length);
            myAnswer = Main.getAnswer(questions, qNum);
            displayQuestionsAnswers(qNum);
            statusLabel.setTextFill(Color.DARKGREEN);
            statusLabel.setText("Network question, please select your answer!");
        }
    }

    @FXML
    void category6Btn(ActionEvent event) {
        if (inGame) {
            statusLabel.setTextFill(Color.DARKMAGENTA);
            statusLabel.setText("Choose an answer for displayed question before changing topic!");
        } else {
            inGame = true;
            options = Main.answers.get("Security");
            questions = Main.questions.get("Security");
            int qNum = random.nextInt(questions.length);
            myAnswer = Main.getAnswer(questions, qNum);
            displayQuestionsAnswers(qNum);
            statusLabel.setTextFill(Color.DARKGREEN);
            statusLabel.setText("Security question, please select your answer!");

        }
    }

    void displayQuestionsAnswers(int questionNumber){
        questionBox.setWrapText(true);
        answerBox.setWrapText(true);
        questionBox.setText(questions[questionNumber][0]);
        answerBox.setText(Main.displayOptions(options, questionNumber));
    }

    @FXML
    void Aclick(ActionEvent event) {
        if(inGame){
            if(myAnswer.equals("a")){
                statusLabel.setTextFill(Color.DARKGREEN);
                statusLabel.setText("CORRECT! Choose your next topic");
                inGame = false;

            } else {
                statusLabel.setTextFill(Color.DARKMAGENTA);
                statusLabel.setText("WRONG! The correct answer is " + myAnswer);
                inGame = false;
            }
        }
    }

    @FXML
    void Bclick(ActionEvent event) {
        if(inGame){
            if(myAnswer.equals("b")){
                statusLabel.setTextFill(Color.DARKGREEN);
                statusLabel.setText("CORRECT! Choose your next topic");
                inGame = false;

            } else {
                statusLabel.setTextFill(Color.DARKMAGENTA);
                statusLabel.setText("WRONG! The correct answer is " + myAnswer);
                inGame = false;
            }
        }
    }

    @FXML
    void Cclick(ActionEvent event) {
        if(inGame){
            if(myAnswer.equals("c")){
                statusLabel.setTextFill(Color.DARKGREEN);
                statusLabel.setText("CORRECT! Choose your next topic");
                inGame = false;

            } else {
                statusLabel.setTextFill(Color.DARKMAGENTA);
                statusLabel.setText("WRONG! The correct answer is " + myAnswer);
                inGame = false;
            }
        }
    }

    @FXML
    void Dclick(ActionEvent event) {
        if(inGame){
            if(myAnswer.equals("d")){
                statusLabel.setTextFill(Color.DARKGREEN);
                statusLabel.setText("CORRECT! Choose your next topic");
                inGame = false;

            } else {
                statusLabel.setTextFill(Color.DARKMAGENTA);
                statusLabel.setText("WRONG! The correct answer is " + myAnswer);
                inGame = false;
            }
        }
    }
}