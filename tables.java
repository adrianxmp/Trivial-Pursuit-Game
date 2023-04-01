class Tables{
    public static void main(String args[]){
        //arrays with questions and the correct answer number (abcd)
        String[][] AuthQs = {{"Using supporting evidence to corroborate an asserted identity","c"}
                            ,{"What tools can you use for authentication?","a"}
                            ,{"What are NOT examples of physiological biometrics?","d"}
                            ,{"Suppose Bob was to make a return on a purchase he made at a retail store. The original method of payment Bob used was a credit card and the cashier has to ask Bob for the last 4 digits of that credit card before he can complete the return transaction. This is an example of:","c"}};
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
        String[][] AuthAs = {{"1","a.What is privacy?"},{"1","b.What is security?"},{"1","c.What is authentication?"},{"1","d.What are networks?"}
                            ,{"2","a.Something you are"},{"2","b.Something you cherish"},{"2","c.Both a and b"},{"2","d.None of the above"}
                            ,{"3","a.Iris Scan"},{"3","b.Finger prints"},{"3","c.Facial recognition"},{"3","d.Handwriting"}
                            ,{"4","a.Privacy"},{"4","b.Networking"},{"4","c.Authentication"},{"4","d.Security"}};
        String[][] NetwAs = {{"1",""},{"1",""},{"1",""},{"1",""}
                            ,{"2",""},{"2",""},{"2",""},{"2",""}
                            ,{"3",""},{"3",""},{"3",""},{"3",""}
                            ,{"4",""},{"4",""},{"4",""},{"4",""}};                     
        String[][] PrivAs = {{"1","a.True"},{"1","b.False"},{"1",""},{"1",""}
                            ,{"2",""},{"2",""},{"2",""},{"2",""}
                            ,{"3",""},{"3",""},{"3",""},{"3",""}
                            ,{"4",""},{"4",""},{"4",""},{"4",""}};
        String[][] ConfAs = {{"1",""},{"1",""},{"1",""},{"1",""}
                            ,{"2",""},{"2",""},{"2",""},{"2",""}
                            ,{"3",""},{"3",""},{"3",""},{"3",""}
                            ,{"4",""},{"4",""},{"4",""},{"4",""}};
        String[][] PassAs = {{"1","a.True"},{"1","b.False"},{"1",""},{"1",""}
                            ,{"2","a.Hash"},{"2","b.Digest"},{"2","c.Both (a) and (b)"},{"2","d.None of the above"}
                            ,{"3","a.The number of bits in the digest"},{"3","b.The number of bytes in the digest"},{"3","c.Nothing, it's just a random number"},{"3","d. 10000000 (Binary)  in decimal form"}
                            ,{"4","a.When a strong collision occurs, salting is used to undo it"},{"4","b. When a string is mixed into a particular password/phrase before it is hashed"},{"4","c.Both (a) and (b)"},{"4","d.None of the above"}}; 
        String[][] SecuAs = {{"1",""},{"1",""},{"1",""},{"1",""}
                            ,{"2",""},{"2",""},{"2",""},{"2",""}
                            ,{"3",""},{"3",""},{"3",""},{"3",""}
                            ,{"4",""},{"4",""},{"4",""},{"4",""}};
         
        //System.out.println(AuthQs[3]);
    }
}