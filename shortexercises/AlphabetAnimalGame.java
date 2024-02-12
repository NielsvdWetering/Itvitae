package shortexercises;

import java.util.Scanner;

public class AlphabetAnimalGame {
    static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
        System.out.println("\nLets play the animal guessing game.\nYou should enter an animal name that starts with the last letter of the animal name before it");
        System.out.println("I will start with the first animal:");
        String animal = "dog";
        System.out.println(animal + "!");
        
        boolean aiCorrectAnswer = true;
        while (aiCorrectAnswer) {
            String newAnimal = userInput(animal);
            if (newAnimal.equals("0")) break;
            animal = aiAnswer(newAnimal);
            if (animal.equals("1")) {
                aiCorrectAnswer = false;
            } else {
                System.out.println(animal + "!");
            }
        }
        
        switch (animal) {
            case "0" -> System.out.println("That was not correct, you lose!");
            case "1" -> System.out.println("I don't know any valid animal names anymore, you win!");
        }
        
	}
    
    //if no valid answer returns "0"
    private static String userInput(String animal) {
        for (int i = 0; i < 3; i++){
            System.out.print("\nEnter an animal (in lower case letters) that starts with the last letter of the previous animal: ");
            String newAnimal = sc.nextLine();
            if (validAnswer(animal, newAnimal)) return newAnimal;
            System.out.println("That was not a correct answer, try again. (try " + (i + 1) + " of 3)");
        }
        return "0";
    }
    
    private static boolean validAnswer(String animal, String newAnimal) {
        int lastLetter = animal.charAt(animal.length() - 1);
        if (lastLetter == newAnimal.charAt(0)) return true;
        return false;
    }
    
    //if none exists returns "1"
    private static String aiAnswer(String animal) {
        String[] animalDatabase = new String[] {"cat","turtle", "horse", "eagle",  "whale", "rabbit", "bear", "lion", "zebra", "mous"};
        for (int i = 0; i < animalDatabase[i].length(); i++) {
            if (validAnswer(animal, animalDatabase[i])) return animalDatabase[i];
        }
        return "1";
    }
}

//methode user input

//methode that checks if first letter equals the last of the last animal

//methode that looks for a new answer to respond

//prints the name or that it does not know