package lesopdrachten.week6;

public class Vogel {
    double wingspan;

    public Vogel(double wingspan){
        this.wingspan = wingspan;
    }
    public void vlieg(){
        System.out.println("flap flap");
    }

    public void makeSound() {
        System.out.println("tjilp tjilp");
    }
}
