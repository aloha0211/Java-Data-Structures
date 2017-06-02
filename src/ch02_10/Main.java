package ch02_10;

import ch02_10.olives.Kalamata;
import ch02_10.olives.Ligurio;
import ch02_10.olives.Olive;
import ch02_10.olives.Picholine;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Olive lig = new Ligurio();
		Olive kal = new Kalamata();
		Olive pic = new Picholine();

		HashSet<Olive> set = new HashSet<>();
		set.add(lig);
		set.add(kal);
		System.out.println("There are " + set.size() + " olives in the set.");
		set.add(pic);
		System.out.println(set);
//		System.out.println("There are " + set.size() + " olives in the set.");
//		set.add(lig);
//		System.out.println("There are " + set.size() + " olives in the set.");
//		set.add(null);
//		System.out.println("There are " + set.size() + " olives in the set.");
//		set.add(null);
//		System.out.println("There are " + set.size() + " olives in the set.");
//		set.remove(lig);
//		System.out.println("There are " + set.size() + " olives in the set.");
//		set.remove(lig);
//		System.out.println("There are " + set.size() + " olives in the set.");
//		set.remove(null);
//		System.out.println("There are " + set.size() + " olives in the set.");
	}

}
