package predicate;

import java.util.function.IntPredicate;

public class Fifth {

	public static void main(String[] args) {
		int n1 = 493735; // задане число
		int n2 = sum(n1); // сума цифр числа
		System.out.println(n2);
		IntPredicate pr = a -> a % 2 == 0;
		System.out.println(pr.test(n2));
	}
	
	public static int sum(int number) { // метод, який обчислює суму цифр числа (до тисяч)
		int a1 = number / 100000;
		int a2 = (number - a1 * 100000) / 10000;
		int a3 = (number - a1 * 100000 - a2 * 10000) / 1000;
		int a4 = (number - a1 * 100000 - a2 * 10000 - a3 * 1000) / 100;
		int a5 = (number - a1 * 100000 - a2 * 10000 - a3 * 1000 - a4 * 100) / 10;
		int a6 = number - a1 * 100000 - a2 * 10000 - a3 * 1000 - a4 * 100 - a5 * 10;
		return a1 + a2 + a3 + a4 + a5 + a6;
	}
}