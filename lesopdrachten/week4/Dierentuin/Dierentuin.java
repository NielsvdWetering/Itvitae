public class Dierentuin {
    public static void main(String[] args) {
        Lion fred = new Lion("Fred", 6, 40);
        Parrot henk = new Parrot("Henk", 4, "rood");
        
        System.out.println("Fred's age: " + fred.age);
        fred.makeSound();
    }
}