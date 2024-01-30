/*
* Prints Hello, World!
* Everyone's first program
*/

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");  //Deze regel print "Hello World" op de command line

        int a = 75;
        int b = 8;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a= " + a + " b= " + b);

        int x = 10;
        int y = 4;
        int over = x % y;
        System.out.println(over);
    }


    /* Dit zijn meerdere regels comments
    *  Om te kijken of dit werkt
    */
}