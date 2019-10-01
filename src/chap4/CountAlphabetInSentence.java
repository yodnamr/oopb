package chap4;

import java.util.Scanner;

public class CountAlphabetInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        do {
            System.out.print("Enter sentence : ");
            String sentence = sc.next().toLowerCase().replace(" ", "");
            System.out.println("Input : " + sentence.toLowerCase());
            System.out.println("Input : " + sentence.toUpperCase());
            System.out.println("ความยาว : " + sentence.length());
            int countVowel = 0, countNotVowel = 0;
            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                //System.out.println("c = " + c);
                if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                    countVowel++;
                } else {
                    countNotVowel++;
                }
            }
            System.out.println("Here countVowel = " + countVowel);
            System.out.println("Here countNotVowel = " + countNotVowel);
            System.out.print("Continue [Y/N] : " );
            ans = sc.next();
            
        } while (ans.equalsIgnoreCase("y"));

    }
}
