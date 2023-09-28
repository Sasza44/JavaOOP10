package comparable;

import java.util.Arrays;

public class Second {

	public static void main(String[] args) {
		Number n1 = new Number(174);
		Number n2 = new Number(54);
		Number n3 = new Number(754);
		Number n4 = new Number(4);
		Number[] arr = new Number[] {n1, n2, n3, n4}; // створюємо масив з прямокутників
		Number n = searchMax(arr);
		System.out.println(n.getNumber()); // виведення на консоль максимального елементу в масиві
	}
	
	public static <T extends Comparable<T>> T searchMax(T[] array) { // пошук максимального елементу в масиві
		Arrays.sort(array);
		return array[array.length - 1];
	}
}