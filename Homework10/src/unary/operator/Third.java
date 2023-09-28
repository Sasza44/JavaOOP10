package unary.operator;

import java.util.function.UnaryOperator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Third {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>(List.of("Java", "Java Script", "Basic", "Assembler")); // список рядків
		List<String> l2 = new ArrayList<>(); // новий список рядків
		UnaryOperator<List<String>> u1 = a -> { // копіюємо в новий список елементи. довжина яких більша за 5 символів
			for(String e: a) {
				if(e.length() > 5) {l2.add(e);}
			}
			return a;
		};
		u1.apply(l1);
		System.out.println(l2);
	}
}