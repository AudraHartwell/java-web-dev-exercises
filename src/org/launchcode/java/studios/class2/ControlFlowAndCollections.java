package org.launchcode.java.studios.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControlFlowAndCollections {
    public static void main(String[] args) {
            HashMap<Character, Integer> charCount = new HashMap();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a quote:");
            String quote = input.nextLine().toLowerCase();


            char[] charactersInString = quote.toCharArray();

            for (int i=0; i<charactersInString.length; i++){
                char theCharacter=charactersInString[i];
                if  (charCount.containsKey(theCharacter)==false) {
                    charCount.put(theCharacter, 1);
                } else {
                    Integer numOfChar= charCount.get(theCharacter);
                    numOfChar += 1;
                    charCount.put(theCharacter, numOfChar);
                }
            }

            System.out.println(charCount);











    }
}
