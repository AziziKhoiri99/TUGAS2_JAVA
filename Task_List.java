package Task;

import java.util.ArrayList;

public class Task_List {
    public static void main(String[] args) {
        ArrayList<String> g = new ArrayList<>();

        System.out.println("Berikut Diantara 70 Demonios De Solomon");
        
        g.add("Ba'al");
        g.add("Agares");
        g.add("Vassago");
        g.add("Gusion");
        g.add("Marbas");
        g.add("Valefor");
        g.add("Amon");

        g.remove("");
        System.out.println(g);

        System.out.println("Terdapat " + g.size() + " lebih iblis di Kerajaan Solomon");
    }
}
