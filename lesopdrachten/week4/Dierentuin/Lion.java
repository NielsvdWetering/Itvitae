public class Lion extends AbstractAnimal {
    int maneLength;
    
    public Lion(String name, int age, int maneLength) {
        super(name, age);
        this.maneLength = maneLength;
    }
    
    public void makeSound() {
        System.out.println("Roar");
    }
    
    public void hunt() {
        System.out.println("Catching prey");
    }
}