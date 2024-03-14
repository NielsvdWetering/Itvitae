package lesopdrachten.week6;

public class Gier extends Vogel{

    public Gier(double wingspan){
        this.wingspan = wingspan;
    }

    @Override
    public void vlieg(){
        System.out.println("flap flap woosh woosh");
    }
}
