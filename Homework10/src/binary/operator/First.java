package binary.operator;

import java.util.function.BinaryOperator;
import java.util.Comparator;

public class First {

	public static void main(String[] args) {
		Comparator<String> c1 = (a, b) -> Integer.compare(a.length(), b.length());
		BinaryOperator<String> b1 = BinaryOperator.maxBy(c1);
		String s1 = b1.apply("Java", "Assembler");
		System.out.println(s1);
	}
}