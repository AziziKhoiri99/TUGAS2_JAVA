package Task;

import java.util.Scanner;

public class Task_If {
    public static void main(String[] args) {
        int nilai = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Berapa Nilai Mu ? ");
        nilai = scan.nextInt();

        if (nilai >= 70) {
            System.out.println("Hebat");
        }

        System.out.println("Semangat Ya");
    }
}
