package binary.operator;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BinaryOperator;

public class Third {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(List.of(5, 0, 3, 4));
		List<Integer> l2 = new ArrayList<>(List.of(10, -2, 5));
		BinaryOperator<List<Integer>> b1 = (a, b) -> {
			int a2 = Collections.min(a);
			int b2 = Collections.min(b);
			if(a2 <= b2) {return a;}
			else {return b;}
		};
		System.out.println(b1.apply(l1, l2));
	}
}