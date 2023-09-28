package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class First {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 , 12, 13, 14, 15));
		Consumer<Integer> c1 = a -> {
			if(a % 2 != 0) {
				System.out.print(a + " ");
			}
		};
		l1.forEach(c1);
	}
}