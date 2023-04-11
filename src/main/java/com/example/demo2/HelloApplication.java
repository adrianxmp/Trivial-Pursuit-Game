package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Trivial Pursuit - CPSC329!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Tables myTable = new Tables();

        Main.questions.put("Authentication", myTable.AuthQs);
        Main.questions.put("Privacy", myTable.PrivQs);
        Main.questions.put("Confidentiality", myTable.ConfQs);
        Main.questions.put("Passwords", myTable.PassQs);
        Main.questions.put("Network", myTable.NetwQs);
        Main.questions.put("Security", myTable.SecuQs);

        Main.answers.put("Authentication", myTable.AuthAs);
        Main.answers.put("Privacy", myTable.PrivAs);
        Main.answers.put("Confidentiality", myTable.ConfAs);
        Main.answers.put("Passwords", myTable.PassAs);
        Main.answers.put("Network", myTable.NetwAs);
        Main.answers.put("Security", myTable.SecuAs);
        launch();
    }
}