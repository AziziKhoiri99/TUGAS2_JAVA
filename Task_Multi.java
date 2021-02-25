package Task;

import java.util.Scanner;

public class Task_Multi {
    public static void main(String[] args) {

        String[][] c = new String[2][3];
        Scanner scan = new Scanner(System.in);

        for (int a = 0; a < c.length; a++) {
            for (int b = 0; b < c[a].length; b++) {
                System.out.format("Siapa yang akan menempati kursi di Komisi 1 DPR - RI - (%d,%d): ", a, b);
                c[a][b] = scan.nextLine();
            }
        }
 
        System.out.println("-----------------------");
        for (int a = 0; a < c.length; a++) {
            for (int b = 0; b < c[a].length; b++) {
                System.out.format("| %s | \t", c[a][b]);
            }
            System.out.println("");
        }
        System.out.println("-----------------------");
    }
}
