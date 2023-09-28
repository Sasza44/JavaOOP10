package function;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		Integer[] array = new Integer[] {5, 6, 7, 8, 9, 10};
		Function<Integer[], Integer> f = a -> countSimple(a);
		System.out.println(f.apply(array));
	}
	
	public static Integer countSimple(Integer[] array) {
		List<Integer> copyArr = new ArrayList<>(); // створення списку, в який скопіюємо масив
		for(int i = 0; i < array.length; i++) { // копіюємо масив
			copyArr.add(array[i]);
		}
		Predicate<Integer> pr = a -> {
			boolean b = false;
			for(int i = 2; i < a; i++) { // виявлення складеденого числа
				if(a % i == 0) {
					b = true;
				}
			}
			return b;
		};
		copyArr.removeIf(pr); // видалення складених чисел зі списку
		return copyArr.size(); // розмір списку з простих чисел
	}
}