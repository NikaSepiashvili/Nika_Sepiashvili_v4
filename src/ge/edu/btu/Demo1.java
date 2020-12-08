package ge.edu.btu;

import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();

        names.add("Nika");
        names.add("Tazo");
        names.add("Nato");

        for (Object n : names)
            System.out.println(n + " ");
    }
}
