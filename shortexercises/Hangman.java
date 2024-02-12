package shortexercises;

import java.util.Scanner;

public class Hangman {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //player 1 enter the word
        System.out.println("Lets play Hangman!\nPlayer 1, enter a word:");
        String word = sc.nextLine();
        for (int i = 0; i < 50; i++) System.out.println();
        
        char[] guessedWord = guessedWordCreation(word);
        
        int wrongGuesses = 0;
        String wrongLetters = "";
        while (wrongGuesses < 10) {
            
            printStatus(guessedWord, wrongGuesses, wrongLetters);
            
            System.out.print("\nEnter your guess: ");
            char guess = sc.next().charAt(0);
            if (checkCharacters(word, guess)) {
                guessedWord = placeCharacters(word, guessedWord, guess);
            } else {
                wrongGuesses++;
                wrongLetters += " " + guess;
            }
            
            if (wordHasBeenGuessed(word, guessedWord)) {
                System.out.println("You have guessed the word! You won!");
                break;
            }
            if (wrongGuesses == 10) {
                printHangman(wrongGuesses);
                System.out.println("You did not guess the word, you lost!");
            }
        }
	}
    
    private static char[] guessedWordCreation(String word) {
        char[] guessedWord = new char[(word.length() * 2)];
        for (int i = 0; i < (word.length() * 2) - 1; i += 2) {
            guessedWord[i] = '_';
            guessedWord[i + 1] = ' ';
            
        }
        return guessedWord;
    }
    
    private static boolean checkCharacters(String word, char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) return true;
        }
        return false;
    }
    
    private static char[] placeCharacters(String word, char[]guessedWord, char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) guessedWord[i * 2] = guess;
        }
        return guessedWord;
    }
    
    private static void printStatus(char[] guessedWord, int wrongGuesses, String wrongLetters) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Wrong guesses: " + wrongGuesses + "/10");
        printHangman(wrongGuesses);
        for (char i : guessedWord) System.out.print(i);
        System.out.println("\nWrong letters: " + wrongLetters);
    }
    
    private static boolean wordHasBeenGuessed(String word, char[]guessedWord) {
        for (int i = 0; i < word.length(); i++) {
            if (guessedWord[i * 2] != word.charAt(i)) return false;
        }
        return true;
    }
    
    private static void printHangman(int wrongGuesses) {
        System.out.println();
        
        switch (wrongGuesses) {
            case 1 -> System.out.print("______");
            case 2 -> System.out.print("""
            |
            |
            |
            |
            |
            |______
            """);
            case 3 -> System.out.print("""
            |
            |
            |
            |
            |\\
            |_\\____
            """);
            case 4 -> System.out.print("""
            ______
            |
            |
            |
            |
            |\\
            |_\\____
            """);
            case 5 -> System.out.print("""
            ______
            | /
            |/
            |
            |
            |\\
            |_\\____
            """);
            case 6 -> System.out.print("""
            ______
            | /   |
            |/
            |
            |
            |\\
            |_\\____
            """);
            case 7 -> System.out.print("""
            ______
            | /   |
            |/    O
            |
            |
            |\\
            |_\\____
            """);
            case 8 -> System.out.print("""
            ______
            | /   |
            |/    O
            |     |
            |
            |\\
            |_\\____
            """);
            case 9 -> System.out.print("""
            ______
            | /   |
            |/    O
            |    /|\\
            |
            |\\
            |_\\____
            """);
            case 10 -> System.out.print("""
            ______
            | /   |
            |/    O
            |    /|\\
            |     /\\
            |\\
            |_\\____
            """);
            default -> System.out.println();
        }
        System.out.println();
    }
}

/*
______
|/   |
|    O
|   /|\
|	/ \
|\
|_\____

*/