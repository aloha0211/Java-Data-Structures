package ch02_10;

import ch02_10.olives.Kalamata;
import ch02_10.olives.Ligurio;
import ch02_10.olives.Olive;
import ch02_10.olives.Picholine;

import java.util.TreeSet;

public class TreeSetMain {

    public static void main(String[] args) {
        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        TreeSet<Olive> set = new TreeSet<>();
        set.add(lig);
        set.add(kal);
        set.add(pic);
        System.out.println(set);
    }

}
