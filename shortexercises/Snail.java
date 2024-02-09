package shortexercises;

public class Snail {
    final static int N = 3;
    static int[][] snail = new int[N][N];
    static int y = 0;   //rows of the matrix
    static int x = 0;   //columns of the matrix
    
    public static void main(String[] args) {
        
        System.out.println("The matrix is:");
        
        //initializes the elements of the matrix and prints it out on the console
        int number = 1;
        for (int xx = 0; xx < snail.length; xx++){
            for (int yy = 0; yy < snail[xx].length; yy++) {
                snail[xx][yy] = number;
                number++;
                System.out.print(snail[xx][yy] + " ");
            }
            System.out.println();
        }
        
        for (int i = 1; i < N; i++) {
            int xyMax = N - i;
            int xyMin = i;
            //moving to the right
            for (int right = x; right < xyMax; right++) {
                printSnail();
                x++;
            }
            //moving down
            for (int down = y; down < xyMax; down++) {
                printSnail();
                y++;
            }
            //moving left
            for (int left = x; left > (xyMin - 1); left--) {
                printSnail();
                x--;
            }
            //movign up
            for (int up = y; up > xyMin; up--) {
                printSnail();
                y--;
            }
        }
        printSnail();
    }
    
    static void printSnail() {
        System.out.print(snail[y][x] + ", ");
    }
}
