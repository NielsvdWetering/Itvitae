package shortexercises;

public class Hangman {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //player 1 enter the word
        System.out.println("Lets play Hangman!\nPlayer 1, enter a word:");
        String word = sc.nextLine();
        for (int i = 0; i < 50; i++) System.out.println();
        
        char[] guessedWord = guessedWordCreation(word);
        
        int wrongGuesses = 0;
        while (wrongGuesses < 10) {
            
            printStatus(guessedWord, wrongGuesses);
            
            System.out.print("Enter your guess: ");
            char guess = sc.next.charAt(0);
            if (checkCharacters(word, guess) {
                guessedWord = placeCharacters(word, guessedWord, guess);
            } else {
                wrongGuesses++;
            }
            
        }
	}
    
    private char[] guessedWordCreation (word) {
        char[] guessedWord = new char[(word.length() * 2)];
        for (int i = 0; i < (word.length() * 2); i++) {
            guessedWord[i] = '_';
            guessedWord[i + 1] = ' ';
            
        }
        return guessedWord;
    }
    
    private boolean checkCharacters(String word, char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (guess == word.charAt(i)) return true;
        }
        return false;
    }
    
    private char[] placeCharacters(String word, char[]guessedWord, char guess) {
        for (int i = 0; i < word.length(); i++) {
            guessedWord[i * 2] = (guess == word.charAt(i)) ? guess : '_' ;
        }
        return guessedWord;
    }
    
    private void printStatus(char[] guessedWord, int wrongGuesses) {
        System.out.println("Wrong guesses: " + wrongGuesses + "/10");
        printHangman(wrongGuesses);
        System.out.println("         " + guessedWord);
    }
    
    private void printHangman(int wrongGuesses) {
        System.out.println();
        
        switch (wrongGuesses) {
            case 0 -> break;
            case 1 -> System.out.print("______");
            case 2 -> System.out.print("|\n|\n|\n|\n|\n|______");
            case 3 -> System.out.print("|\n|\n|\n|\n|\\n|_\____");
            case 4 -> System.out.print("______\n|\n|\n|\n|\n|\\n|_\____");
            case 5 -> System.out.print("______\n| /\n|/\n|\n|\n|\\n|_\____");
            case 6 -> System.out.print("______\n| /   |\n|/\n|\n|\n|\\n|_\____");
            case 7 -> System.out.print("______\n| /   |\n|/    O\n|\n|\n|\\n|_\____");
            case 8 -> System.out.print("______\n| /   |\n|/    O\n|     |\n|\n|\\n|_\____");
            case 9 -> System.out.print("______\n| /   |\n|/    O\n|    /|\\n|\n|\\n|_\____");
            case 10 -> System.out.print("______\n| /   |\n|/    O\n|    /|\\n|     /\\n|\\n|_\____");
        }
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