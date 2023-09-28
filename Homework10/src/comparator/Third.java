package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Third {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>(List.of(62, 2000, 306, 55));
		Comparator<Integer> c1 = (a, b) -> Integer.compare(sumFL(a), sumFL(b));
		l1.sort(c1);
		System.out.println(l1);
	}
	
	public static int sumFL(int n) { // обчислення суми першої та останньої цифри числа
		String s = Integer.toString(n); // перетворення числа на рядок
		String sf = s.substring(0, 1); // перша цифра (рядок)
		String sl = s.substring(s.length() - 1, s.length()); // остання цифра (рядок)
		int nf = Integer.parseInt(sf); // перша цифра (число)
		int nl = Integer.parseInt(sl); // остання цифра (число)
		return nf + nl;
	}
}