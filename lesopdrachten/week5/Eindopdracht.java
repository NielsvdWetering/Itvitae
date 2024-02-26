package lesopdrachten.week5;

import java.util.Scanner;

public class Eindopdracht{
    public static void main(String[] args) {
        int[] alphabethNumbersAndSpace = new int[37];
        
        String text = userInput();
        alphabethNumbersAndSpace = countEachCharacter(alphabethNumbersAndSpace, text);
        printResults(alphabethNumbersAndSpace, text);
    }
    
    private static String userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text:");
        return sc.nextLine();
    }
    
    private static int[] countEachCharacter(int[] alphabethNumbersAndSpace, String text) {
        nextcharacter:
        for (int charOfInputStr = 0; charOfInputStr < text.length(); charOfInputStr++) {
            //check 1 character en vergelijk die met alle opties in de volgende loop
            char letter = 'a';
            char number = '0';
            for (int characterArrayIndex = 0; characterArrayIndex < 37; characterArrayIndex++) {  //ittereerd door alle opties
                if (characterArrayIndex < 26) {
                    if (text.charAt(charOfInputStr) == letter) {
                        alphabethNumbersAndSpace[characterArrayIndex]++;
                        continue nextcharacter;
                    } else {
                        letter++;
                    }
                } else if (characterArrayIndex >= 26 && characterArrayIndex < 36) {
                    if (text.charAt(charOfInputStr) == number) {
                        alphabethNumbersAndSpace[characterArrayIndex]++;
                        continue nextcharacter;
                    } else {
                        number++;
                    }
                } else if (text.charAt(charOfInputStr) == 32) {
                    alphabethNumbersAndSpace[36]++;
                }
            }
        }
        
        return alphabethNumbersAndSpace;
    }
    
    private static int countTotalCharacters(int[] alphabethNumbersAndSpace) {
        int count = 0;
        for (int characterCount : alphabethNumbersAndSpace) {
            count += characterCount;
        }
        return count;
    }
    
    private static int countWords(int[] alphabethNumbersAndSpace) {
        return alphabethNumbersAndSpace[36] + 1;
    }
    
    private static int countVowels(int[] alphabethNumbersAndSpace) {
        int[] vowelIndexes = {0, 4, 8, 14, 20, 24};
        int count = 0;
        for (int vowel : vowelIndexes) {
            count += alphabethNumbersAndSpace[vowel];
        }
        return count;
    }
    
    private static void printResults(int[] alphabethNumbersAndSpace, String text) {
        System.out.println("\n");
        System.out.printf("%-22s %d %n", "Amount of characters:", countTotalCharacters(alphabethNumbersAndSpace));
        System.out.printf("%-22s %d %n", "Amount of words:", countWords(alphabethNumbersAndSpace));
        System.out.printf("%-22s %d %n", "Amount of vowels:", countVowels(alphabethNumbersAndSpace));
        System.out.printf("%-22s %b %n", "Palindrome?", palindrome(text));
        System.out.println("");
        
        int max = maxValue(alphabethNumbersAndSpace);
        printGraph(max, alphabethNumbersAndSpace);
        System.out.println("a b c d e f g h i j k l m n o p q r s t u v w x y z 0 1 2 3 4 5 6 7 8 9  ");
    }
    
    private static int maxValue(int[] alphabethNumbersAndSpace) {
        int maxValue = 0;
        for (int count : alphabethNumbersAndSpace) {
            if (count > maxValue) {
                maxValue += count;
            }
        }
        return maxValue;
    }
    
    private static void printGraph(int max, int[] alphabethNumbersAndSpace) {
        for (int i = max; i > 0; i--) {
            for (int characterCount : alphabethNumbersAndSpace) {
                if (i <= characterCount) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    private static boolean palindrome(String text) {
        int a = 0;
        int b = text.length() - 1;
        while (a < b) {
            while (text.charAt(a) == 32) a++;
            while (text.charAt(b) == 32) b--;
            
            if (text.charAt(a) != text.charAt(b)) {
                return false;
            } else {
                a++;
                b--;
            }
        }
        return true;
    }
    
}