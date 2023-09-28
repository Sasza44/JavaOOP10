package unary.operator;

import java.util.function.UnaryOperator;
import java.util.List;
import java.util.ArrayList;

public class First {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(List.of(879, 45,24, 872, 6, 93, 84, 3, 992, 45, 7));
		UnaryOperator<Integer> u1 = a -> {
			if(a % 2 != 0) {a = 0;}
			return a;
		};
		System.out.println(l1);
		l1.replaceAll(u1);
		System.out.println(l1);
	}
}