package predicate;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.function.BiPredicate;

public class Fourth {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(3, "Hello");
		map1.put(4, "Java");
		map1.put(6, "Language");
		map1.put(7, "Program");
		BiPredicate<Integer, String> biPr1 = (a, b) -> b.length() != a;
		List<Integer> list1 = new ArrayList<>(); // список елементів, які потрібно видалити
		for(Map.Entry<Integer, String> item: map1.entrySet()) { // перебирання елементів карти
			if(biPr1.test(item.getKey(), item.getValue())) {
				list1.add(item.getKey()); // вставка в колекцію значень ключів елементів, які потрібно видалити
			}
		}
		for(int i = 0; i < list1.size(); i++) {
			map1.remove(list1.get(i)); // видалення елементів
		}
		System.out.println(map1);
	}
}