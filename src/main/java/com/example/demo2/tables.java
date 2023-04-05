package com.example.demo2;

import java.util.Arrays;

class Tables{
    public static void main(String[] args){
        //System.out.println((AuthQs[3][0]));
    }

        //arrays with questions and the correct answer number (abcd)
        String[][] AuthQs = {{"Using supporting evidence to corroborate an asserted identity???","c"}
                            ,{"What tools can you use for authentication?","a"}
                            ,{"What are NOT examples of physiological biometrics?","d"}
                            ,{"""
                                Suppose Bob was to make a return on a purchase he made at a retail store.\s
                                The original method of payment Bob used was a credit card and the cashier has to ask Bob\s
                                for the last 4 digits of that credit card before he can complete the return transaction.\s
                                This is an example of:""","c"}};
        String[][] NetwQs = {{"",""}
                            ,{"",""}
                            ,{"",""}
                            ,{"",""}};
        String[][] PrivQs = {{"Privacy and Security are essentially two different things, but they have overlapping properties","a"}
                            ,{"",""}
                            ,{"",""}
                            ,{"",""}};
        String[][] ConfQs = {{"",""}
                            ,{"",""}
                            ,{"",""}
                            ,{"",""}};
        String[][] PassQs = {{"For hash functions, weak collisions always imply strong collisions","b"}
                            ,{"The output of a hash function is called a","c"}
                            ,{"In regards to SHA-256, what does the 256 part represent?","a"}
                            ,{"What is salting?","b"}};
        String[][] SecuQs = {{"Which of the following is a principle of security?","a"}
                            ,{"Suppose Alice takes a random  iPhone 7. The iPhone is locked and requires a fingerprint ID to unlock. Alice somehow manages to unlock the phone with her fingerprint when she shouldn’t have. This is an example of: ","a"}
                            ,{"",""}
                            ,{"",""}};
        //arrays with question number and option. Will need to filter by question number to get question answers
        String[][] AuthAs = {{"1","a.What is privacy?","b.What is security?","c.What is authentication?","d.What are networks?"}
                            ,{"2","a.Something you are","b.Something you cherish","c.Both a and b","d.None of the above"}
                            ,{"3","a.Iris Scan","b.Finger prints","c.Facial recognition","d.Handwriting"}
                            ,{"4","a.Privacy","b.Networking","c.Authentication","d.Security"}};
        String[][] NetwAs = {{"1",""}
                            ,{"2",""}
                            ,{"3",""}
                            ,{"4",""}};
        String[][] PrivAs = {{"1","a.True","b.False","",""}
                            ,{"2",""}
                            ,{"3", ""}
                            ,{"4",""}};
        String[][] ConfAs = {{"1",""}
                            ,{"2",""}
                            ,{"3",""}
                            ,{"4",""}};
        String[][] PassAs = {{"1","a.True","b.False","",""}
                            ,{"2","a.Hash","b.Digest","c.Both (a) and (b)","d.None of the above"}
                            ,{"3","a.The number of bits in the digest","b.The number of bytes in the digest","c.Nothing, it's just a random number","d. 10000000 (Binary)  in decimal form"}
                            ,{"4","a.When a strong collision occurs, salting is used to undo it","b. When a string is mixed into a particular password/phrase before it is hashed","c.Both (a) and (b)","d.None of the above"}};
        String[][] SecuAs = {{"1",""}
                            ,{"2",""}
                            ,{"3",""}
                            ,{"4",""}};


}