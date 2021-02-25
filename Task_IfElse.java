package Task;

import java.util.Scanner;

public class Task_IfElse {
    public static void main(String[] args) {
        int time;
        Scanner scan = new Scanner(System.in);

        System.out.print("Waktu: ");
        time = scan.nextInt();

        if ( time <= 12) {
            System.out.println( time + " AM");
        } else if ( time <= 24) {
            System.out.println( time + " PM");
        } else {
            System.out.println("There's Something Wrong");
        }
    }
}
