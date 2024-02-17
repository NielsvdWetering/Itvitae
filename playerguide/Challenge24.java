package playerguide;

import helperclasses.ConsoleHelper;

public class Challenge24 {
    public static void main(String[] args) {
        ConsoleHelper ch = new ConsoleHelper();
        
        SoupType soupType = SoupType.SOUP;
        System.out.println("Welcome to Simula's Soup restaurant!");
        
        //choosing soup type
        System.out.println("We have the following soup types: ");
        SoupType.printOptions();
        int choice = ch.askForInteger("Enter your choice: ", 1, SoupType.values().length);
        
        switch (choice) {
            case 1 -> soupType = SoupType.SOUP;
            case 2 -> soupType = SoupType.STEW;
            case 3 -> soupType = SoupType.GUMBO;
        }
        
        //choosing ingredients
        Ingredient ingredient = Ingredient.MUSHROOMS;
        System.out.println("\nWe have the following main ingredients:");
        Ingredient.printOptions();
        choice = ch.askForInteger("Enter your choice: ", 1, Ingredient.values().length);
        
        switch (choice) {
            case 1 -> ingredient = Ingredient.MUSHROOMS;
            case 2 -> ingredient = Ingredient.CHICKEN;
            case 3 -> ingredient = Ingredient.CARROTS;
            case 4 -> ingredient = Ingredient.PATATOES;
        }
        
        //choosing seasoning
        Seasoning seasoning = Seasoning.SPICY;
        System.out.println("\nWe have the following seasoning available:");
        Seasoning.printOptions();
        choice = ch.askForInteger("Enter your choice: ", 1, Seasoning.values().length);
        
        switch (choice) {
            case 1 -> seasoning = Seasoning.SPICY;
            case 2 -> seasoning = Seasoning.SALTY;
            case 3 -> seasoning = Seasoning.SWEET;
        }
        
        //creating and the soup
        Soup bowlOfSoup = new Soup(soupType, ingredient, seasoning);
        bowlOfSoup.serveSoup();
        
    }
}

class Soup {
    private String soup;
    private String ingredient;
    private String seasoning;
    
    Soup(SoupType soup, Ingredient ingredient, Seasoning seasoning) {
        this.soup = soup.name;
        this.ingredient = ingredient.name;
        this.seasoning = seasoning.name;
    }
    
    public void serveSoup() {
        System.out.printf("Here is your %s %s %s!", seasoning, ingredient, soup);
    }
}

enum SoupType {
    SOUP("Soup"),
    STEW("Stew"),
    GUMBO("Gumbo");
    
    final String name;
    SoupType(String name) {
        this.name = name; 
    }
    
    static void printOptions() {
        for (SoupType options : SoupType.values()) {
            System.out.println((options.ordinal() + 1) + ". " + options.name);
        }
    }
}

enum Ingredient {
    MUSHROOMS("Mushrooms"),
    CHICKEN("Chicken"),
    CARROTS("Carrots"),
    PATATOES("Patatoes");
    
    final String name;
    Ingredient(String name) {
        this.name = name;
    }
    
    static void printOptions() {
        for (Ingredient options : Ingredient.values()) {
            System.out.println((options.ordinal() + 1) + ". " + options.name);
        }
    }
}

enum Seasoning {
    SPICY("Spicy"),
    SALTY("Salty"),
    SWEET("Sweet");
    
    final String name;
    Seasoning(String name) {
        this.name = name;
    }
    
    static void printOptions() {
        for (Seasoning options : Seasoning.values()) {
            System.out.println((options.ordinal() + 1) + ". " + options.name);
        }
    }
}