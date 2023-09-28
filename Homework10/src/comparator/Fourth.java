package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Fourth {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(List.of(2, 6, 19, 68, 199, 45)); // список, у якому присутні прості числа
		List<Integer> l2 = new ArrayList<>(List.of(308, 8, 70, 99)); // список без простих чисел
		Comparator<Integer> c1 = (a, b) -> Integer.compare(a, b);
		System.out.println(l1);
		l1.sort(c1); // сортування списку
		System.out.println(l1);
		System.out.println(getMaxSimple(l1));
		
	}
	
	public static int getMaxSimple(List<Integer> l1) { // знаходження максимального простого числа у відсортованому списку (інакше виводиться мінімальне число)
		boolean b = false;
		for(int i = l1.size() - 1; i >= 0; i--) {
			for(int j = 2; j < l1.get(i); j++) {
				if(l1.get(i) % j == 0) {
					b = true;
				}
				if(b == false) {
					return l1.get(i);
				}
			}
		}
		return l1.get(0);
	}
}