package lesopdrachten.week6;

public class AbstracteKlassenOpdracht {
    public static void main(String[] args){
        Gier piet = new Gier(3.8, 5);
        Koolmees meesje = new Koolmees(0.2, "Yellow");

        meesje.vlieg();
        piet.vlieg();
    }

}
