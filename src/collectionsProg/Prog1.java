package collectionsProg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prog1 {
	public static void main(String[] args) {
		List<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(5);
		arrlist.add(99);
		arrlist.add(55);
		arrlist.add(88);
		arrlist.add(1);
		System.out.println("using iterator and for loop");
		for (Iterator<Integer> iterator = arrlist.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + ", ");
		}
		System.out.println("\nusing for loop:");
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.print(arrlist.get(i) + ", ");
		}
		System.out.println("\nusing for each loop");
		for (Integer integer : arrlist) {
			System.out.print(integer + ", ");
		}
	}

}
