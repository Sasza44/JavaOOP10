package unary.operator;

import java.util.function.UnaryOperator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Second {

	public static void main(String[] args) {
		String s1 = "Hello 123 world";
		System.out.println(s1);
		char[] arr1 = s1.toCharArray(); // перетворення рядка на масив символів
		List<String> l1 = new ArrayList<>(); // перетворення символів на рядки та копіювання їх у список
		for(int i = 0; i < arr1.length; i++) {
			l1.add(Character.toString(arr1[i]));
		}
		UnaryOperator<String> u1 = a -> { // метод, який відкидає усі символи (перетворені на рядки), крім цифрових
			char[] arr2 = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
			boolean b = false;
			for(int i = 0; i < arr2.length; i++) {
				if(a.equals(Character.toString(arr2[i]))) {b = true;}
			}
			if(b == false) {a = "";}
			return a;
		};
		l1.replaceAll(u1);  // залишаємо в списку лише цифрові символи (перетворені на рядки)
		String s2 = String.join("", l1); // об'єднання рядків, в результаті з початкового рядка залишаються тільки цифри
		System.out.println(s2);
	}
}