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
                                This is an example of:""","c"}
                            ,{"Which is not a classification of biometrics?","a"}
                            ,{"There are two types of errors that occur during authentication. Which choice best defines them?","a"}};
        String[][] NetwQs = {{"What is a router?","a"}
                            ,{"What is routing?","b"}
                            ,{"Suppose you are connected to a network with an ip address that is “192.168.1.4” with a subnet mask of “255.255.0.0”. What is the maximum number of devices that can connect to this network?","b"}
                            ,{"Mac addresses are dynamic while IP addresses are static","b"}};
        String[][] PrivQs = {{"Privacy and Security are essentially two different things, but they have overlapping properties","a"}
                            ,{"How can you control who sees your data?","c"}
                            ,{"What is secondary use of data?","b"}
                            ,{"Which of the following is a principle of the PIPEDA act?","b"}};
        String[][] ConfQs = {{"Which is not possible if VMs can communicate?","c"}
                            ,{"Although physical confinement decreases the chances of the compromise of one system if another is intercepted, what is the setback of this method?","d"}
                            ,{"If a guest OS is subject to a malware attack, which is presumed to be affected under security assumptions?","d"}
                            ,{"What are the qualities of a good reference monitor?","a"}
                            ,{"Which choice correctly states the three methods of confinement?","b"}};
        String[][] PassQs = {{"For hash functions, weak collisions always imply strong collisions","b"}
                            ,{"The output of a hash function is called a","c"}
                            ,{"In regards to SHA-256, what does the 256 part represent?","a"}
                            ,{"What is salting?","b"}
                            ,{"In regards to SHA-256, what does the 256 part represent?","a"}
                            ,{"Which types of attacks can compromise a password?","d"}
                            ,{"Which password policies or practices are not counterproductive?","d"}
                            ,{"When using physical locks with numeric combinations for passwords, it is true that passwords are uniformly distributed.","b"}
                            ,{"Suppose Alice takes a random  iPhone 7. The iPhone is locked and requires a fingerprint ID to unlock. Alice somehow manages to unlock the phone with her fingerprint when she shouldn’t have. This is an example of: ","a"}};
        String[][] SecuQs = {{"Which of the following is a principle of security?","a"}
                            ,{"When a false positive happens, what aspect of the security triad does this breach?","a"}
                            ,{"What is the principle of least privilege?","b"}
                            ,{"What is it called when information is checked after being input by possibly untrusted users?","c"}
                            ,{"Why must some services be handled on the server side while others need client side input?","d"}};
        //arrays with question number and option. Will need to filter by question number to get question answers
        String[][] AuthAs = {{"1","a.What is privacy?","b.What is security?","c.What is authentication?","d.What are networks?"}
                            ,{"2","a.Something you are","b.Something you cherish","c.Both a and b","d.None of the above"}
                            ,{"3","a.Iris Scan","b.Finger prints","c.Facial recognition","d.Handwriting"}
                            ,{"4","a.Privacy","b.Networking","c.Authentication","d.Security"}
                            ,{"5","a- psychological","b- physiological","c-behavioural","d- b and c"}
                            ,{"6","a- False positive: a user gets authenticated when they shouldn't be","b- False positive: a user gets denied access when they shouldn't be","c- False positive: a user gets authenticated when they shouldn't be","d- True positive: a user gets denied access when they shouldn't be"}};
        String[][] NetwAs = {{"1","a.A device that acts as a gateway between LAN and WAN","b.A software utility used for identifying network problems","c.A device that connects you to the internet","d.None of the above"}
                            ,{"2","a.The process of communicating between to ip addresses","b.The process of sending packets between networks","c.The process of configuring your subnet mask","d.None of the above"}
                            ,{"3","a.256","b.512","c.128","d.200"}
                            ,{"4","a.True","b.False","",""}};
        String[][] PrivAs = {{"1","a.True","b.False","",""}
                            ,{"2","a- require a password","b- limit the classification of people who can access the information","c- all of the above","d- none of the above"}
                            ,{"3","a.When you use data collected towards research","b.When data is used for a purpose other than what it was originally used for ","c.When data is only used for the purpose it was originally used for.","d.None of the above"}
                            ,{"4","a.Don’t give away personal info","b. Limit use, disclosure and retention","c.Give individuals limited access","d.None of the above"}};
        String[][] ConfAs = {{"1","a- malware compromisation","b- information sharing","c- independent operation of VMs","d- information leaks"}
                            ,{"2","a- money","b- space","c- security","d- a and b"}
                            ,{"3","a- host VM","b- other VMs","c-both","d- neither"}
                            ,{"4","a- allows for complete mediation","b- can be tampered with","c- unanalyzable","d- all of the above"}
                            ,{"5","a-physical, metaphysical, and quantum confinement","b- physical, temporal, and logical confinement","c-abstract, logical, and sandbox confinement","d- temporal, privileged, and tamperproof confinement"}};
        String[][] PassAs = {{"1","a.True","b.False","",""}
                            ,{"2","a.Hash","b.Digest","c.Both (a) and (b)","d.None of the above"}
                            ,{"3","a.The number of bits in the digest","b.The number of bytes in the digest","c.Nothing, it's just a random number","d. 10000000 (Binary)  in decimal form"}
                            ,{"4","a.When a strong collision occurs, salting is used to undo it","b. When a string is mixed into a particular password/phrase before it is hashed","c.Both (a) and (b)","d.None of the above"}
                            ,{"5","a.The number of bits in the digest","b.The number of bytes in the digest","c. Nothing, it's just a random number","d. 10000000 (Binary)  in decimal form"}
                            ,{"6","a-brute force guessing","b-capture and replay","c- phishing","d- all of the above"}
                            ,{"7","a- character type limitations","b- blacklisted words","c- periodically renewing passwords","d- no repetition of passwords"}
                            ,{"8","a- True","b- False","",""}
                            ,{"9","a.False positive","b.False negative","c.There is not enough information to answer this question","d.Authentication"}};
        String[][] SecuAs = {{"1","a.Psychological acceptability","b.Economy of grief","c.Both (a) and (b)","d.None of the above"}
                            ,{"2","a.Confidentiality","b.Availability","c.Integrity",""}
                            ,{"3","a- a system is only as strong as its weakest link","b- a system should be designed to allow a test to be done with the least assigned privileges possible in the shortest time possible","c- a system should be designed without complex instructions to be easy as possible to be properly operated by a person","d- a system should preferably require more than one key for access to a system for robustness and better security"}
                            ,{"4","a- salting","b- hashing","c- sanitizing","d- encrypting"}
                            ,{"5","a- to save memory on the server side","b- to authenticate users before confirming actions","c- to prevent service exploitation by client/user","d- all of the above"}};


}
