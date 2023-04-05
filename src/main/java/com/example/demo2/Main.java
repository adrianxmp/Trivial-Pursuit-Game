package com.example.demo2;
import java.util.*;
class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String, String[][]> topics = new HashMap<>();

    public static Random random = new Random();
    public static void main(String[] args) {
        Tables myTable = new Tables();

        topics.put("Authentication", myTable.AuthQs);
        topics.put("Privacy", myTable.PrivQs);
        topics.put("Confidentiality", myTable.ConfQs);
        topics.put("Passwords", myTable.PassQs);
        topics.put("Network", myTable.NetwQs);
        topics.put("Security", myTable.SecuQs);

//        System.out.println(myTable.AuthAs[2][1]);
//        System.out.println(myTable.AuthQs[2][0]);
//        System.out.println(AuthQs.length);

        System.out.println("Welcome to Trivial Pursuit!");

        if((input("Begin game? (y/n): ").equals("y"))){



            while (true) {

                String option = input(
                        """
                                Choose your topic:
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

    public static void playGame(String topic){
        String[][] myQuestions = topics.get(topic);

        // Get random question from array
        int qNum = random.nextInt(myQuestions.length);
        System.out.println(myQuestions[qNum][0]);



        // Loop through each row
//        for (String[] myQuestion : myQuestions) {
//            // Loop through each element in the current row
//            if(input("Show question: (y/n)").equals("y")) {
//                System.out.println(myQuestion[0]);
//            }
//        }

        System.out.println();

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

