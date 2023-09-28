package function;

import java.util.function.Function;
import java.util.Arrays;

public class Third {

	public static void main(String[] args) {
		String text = "Hello world";
		Function<String, char[]> f1 = a -> a.toCharArray(); // перетворення рядка на масив символів
		Function<char[], Integer> f2 = a -> sumCodes(a); // отримання кодів ASC II для кожного символа та підрахунок їх суми
		Function<String, Integer> f3 = f1.andThen(f2); // послідовна реалізація двох функцій
		int sum = f3.apply(text);
		System.out.println(sum);
	}
	public static Integer sumCodes(char[] arr) { // отримання кодів ASC II для кожного символа та підрахунок їх суми
		int s = 0;
		for(int i = 0; i < arr.length; i++) {
//			System.out.println((int)arr[i]);
			s += (int)arr[i];
		}
		return s;
	}
}