package Task;

import java.util.Scanner;

public class Task_SwitchCase {
    public static void main(String[] args) {
        String search;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nama Ibu Kota; ");
        search = scan.nextLine();

        switch (search) {
            case "Jakarta":
                System.out.println(" Daerah Khusus Ibukota Jakarta adalah ibu kota negara dan kota terbesar di Indonesia. Jakarta merupakan satu-satunya kota di Indonesia yang memiliki status setingkat provinsi. Jakarta terletak di pesisir bagian barat laut Pulau Jawa. Dahulu pernah dikenal dengan beberapa nama di antaranya Sunda Kelapa, Jayakarta, dan Batavia. Di dunia internasional Jakarta juga mempunyai julukan J-Town, atau lebih populer lagi The Big Durian karena dianggap kota yang sebanding New York City di Indonesia.");
                break;
            case "Bandung":
                System.out.println("Kota Bandung adalah kota metropolitan terbesar di Provinsi Jawa Barat, sekaligus menjadi ibu kota provinsi tersebut. Kota ini terletak 140 km sebelah tenggara Jakarta, dan merupakan kota terbesar di wilayah Pulau Jawa bagian selatan.");
                break;
            case "Semarang":
                System.out.println("Kota Semarang adalah ibu kota Provinsi Jawa Tengah, Indonesia sekaligus kota metropolitan terbesar kelima di Indonesia setelah Jakarta, Surabaya, Medan, dan Bandung.");
                break;
            default:
                System.out.println("Maaf, Tidak dapat Menemukan");
        }
    }
}
