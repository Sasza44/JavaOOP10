package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Second {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(List.of(56, 75, 3, 456, 7, -3, -695, 84, -12));
		System.out.println(l1);
		Comparator<Integer> c1 = (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)); // умови сортування списку
		Comparator <Integer> c2 = (a, b) -> Integer.compare(b, a);
		Comparator<Integer> c3 = c1.thenComparing(c2);
		l1.sort(c3); // сортування списку
		System.out.println(l1.get(0));
	}
}