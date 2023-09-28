package comparable;

import java.util.Arrays;

public class First {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(45, 20); // площа 900
		Rectangle r2 = new Rectangle(34, 20); // площа 680
		Rectangle r3 = new Rectangle(38, 30); // площа 1140
		Rectangle r4 = new Rectangle(42, 18); // площа 756
//		System.out.println(r4.square());
		Rectangle[] arr = new Rectangle[] {r1, r2, r3, r4}; // створюємо масив з прямокутників
		for(Rectangle r: arr) { // виводимо масив на консоль
			System.out.println(r);
		}
		System.out.println();
		Arrays.sort(arr);
		for(Rectangle r: arr) { // виводимо відсортований масив на консоль
			System.out.println(r);
		}
	}
}