package binary.operator;

import java.util.List;
import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class Second {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(List.of(1, 43, 934, 56, 7, 45, 342, 23, 76));
		List<Integer> l2 = new ArrayList<>(List.of(1, 43, 934, 56, 7, 45, 342, 23, 76, 233, 976, 3));
		BinaryOperator<List<Integer>> b1 = (a, b) -> { // вставка в новий список чисел, які присутні у двох, поданих як параметри
			List<Integer> l3 = new ArrayList<>();
			for(int i = 0; i < a.size(); i++) {
				for(int j = 0; j < b.size(); j++) {
					if(Math.abs(a.get(i) - b.get(j)) < 1) {
						l3.add(a.get(i));
					}
				}
			}
			return l3;
		};
		List<Integer> l3 = b1.apply(l1, l2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
	}
}