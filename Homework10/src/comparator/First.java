package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class First {

	public static void main(String[] args) {
		Cat c1 = new Cat("Umka", 12);
		Cat c2 = new Cat("Luska", 5);
		Cat c3 = new Cat("Barsic", 8);
		Cat c4 = new Cat("Timka", 5);
		Cat c5 = new Cat("Kuzia", 2);
		Cat[] arr = new Cat[] {c1, c2, c3, c4, c5};
		Comparator<Cat> comp = (a, b) -> a.getName().length() - b.getName().length();
		Arrays.sort(arr, comp);
		for(Cat c: arr) {
			System.out.println(c);
		}
	}
}