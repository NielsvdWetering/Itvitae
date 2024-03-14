package lesopdrachten.week6;

public class Gier extends Vogel{
    int age;

    public Gier(double wingspan, int age){
        super(wingspan);
        this.age = age;
    }

    @Override
    public void vlieg(){
        System.out.println("flap flap woosh woosh");
    }

    @Override
    public void makeSound() {
        System.out.println("screeeeech");
    }
}
