package com.example.demo2;
import java.util.*;
class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String, String[][]> questions = new HashMap<>();
    public static HashMap<String, String[][]> answers = new HashMap<>();

    public static Random random = new Random();
    public static void main(String[] args) {
        Tables myTable = new Tables();

        questions.put("Authentication", myTable.AuthQs);
        questions.put("Privacy", myTable.PrivQs);
        questions.put("Confidentiality", myTable.ConfQs);
        questions.put("Passwords", myTable.PassQs);
        questions.put("Network", myTable.NetwQs);
        questions.put("Security", myTable.SecuQs);

        answers.put("Authentication", myTable.AuthAs);
        answers.put("Privacy", myTable.PrivAs);
        answers.put("Confidentiality", myTable.ConfAs);
        answers.put("Passwords", myTable.PassAs);
        answers.put("Network", myTable.NetwAs);
        answers.put("Security", myTable.SecuAs);

//        System.out.println(myTable.AuthAs[2][1]);
//        System.out.println(myTable.AuthQs[2][0]);
//        System.out.println(AuthQs.length);

        System.out.println("Welcome to Trivial Pursuit!");

        if((input("Begin game? (y/n): ").equals("y"))){



            while (true) {

                String option = input(
                        """
                                1. Authentication
                                2. Privacy
                                3. Confidentiality
                                4. Passwords
                                5. Network
                                6. Security
                                7. End Game
                                Choose your option:\s""");

                switch (option) {
                    case "1" -> playGame("Authentication");
                    case "2" -> playGame("Privacy");
                    case "3" -> playGame("Confidentiality");
                    case "4" -> playGame("Passwords");
                    case "5" -> playGame("Network");
                    case "6" -> playGame("Security");
                    default -> {
                        System.out.println("Thank you for playing!");
                        return;
                    }
                }
            }
        }
    }

    public static String playGame(String topic){
        String[][] myQuestions = questions.get(topic);
        String[][] myAnswers = answers.get(topic);

        // Get random question from array
        int qNum = random.nextInt(myQuestions.length);

        System.out.println(getQuestion(myQuestions, qNum));

//         Loop through each row
//        for (int i = 1; i < myAnswers[qNum].length;i++) {
//            // Loop through each element in the current row
//            System.out.println(myAnswers[qNum][i]);
//
//        }
        String options = displayOptions(myAnswers, qNum);
        System.out.println(options);

//        if(input("\nYour answer: (a/b/c/d) ").equals(getAnswer(myQuestions, qNum))){
//            System.out.println("You are correct!!");
//        } else {
//            System.out.println("!!!!!!!!!!!! ERRRRRR WRONG !!!!!!!!!!!!! :(((((");
//        }

        return getAnswer(myQuestions, qNum);

    }

    public static String getQuestion(String[][] questions, int num){
        return questions[num][0];
    }

    public static String getAnswer(String[][] questions, int num){
        return questions[num][1];
    }

    public static String displayOptions(String[][] myAnswers, int quesNumber){
        StringBuilder options = new StringBuilder();
        for (int i = 1; i < myAnswers[quesNumber].length;i++) {
            // Loop through each element in the current row
            options.append(myAnswers[quesNumber][i]).append("\n");
        }
        return options.toString();
    }

    /**
     * A python like wrapper function for getting input from the terminal
     * @param prompt the prompt message
     * @return the user input entered from the terminal
     */
    public static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }


}

