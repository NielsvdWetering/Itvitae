public class Parrot extends AbstractAnimal {
    String featherColor;
    
    public Parrot(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }
    
    public void makeSound() {
        System.out.println("Squawk");
    }
    
    public void mimicSound() {
        System.out.println("mimicing sound");
    }
}