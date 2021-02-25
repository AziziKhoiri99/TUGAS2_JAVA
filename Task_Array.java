package Task;

import java.util.Scanner;

public class Task_Array {
    public static void main(String[] args) {
        String[] x = new String[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < x.length; i++) {
            System.out.print("Siswa Ke- " + i + ": ");
            x[i] = scan.nextLine();
        }
        System.out.println("----------------------");
        System.out.println("Berikut Daftar Siswa :");

        for (String y : x) {
            System.out.println(y);
        }
    }
}
