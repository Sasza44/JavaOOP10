package supplier;

import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

public class Second {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(List.of("Hello", "world", "Java"));
		List<String> list1 = new ArrayList<>();
		list.forEach(e -> list1.add(e)); // створюємо копію списку
		list1.removeIf(a -> checkLower(a)); // видаляємо з копії рядки з малої літери
		String s1 = list1.get(0);
		for(int i = 1; i < list1.size(); i++) { // перетворення списку на рядок, у якому слова розділені пробілами
			s1 += (" " + list1.get(i));
		}
		Supplier<String> sup = new GetWord(s1);
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
	}
	
	public static boolean checkLower(String s) { // перевірка, чи рядок починається з малої літери
		char[] a1 = s.toCharArray();
		if(Character.isLowerCase(a1[0])) {return true;}
		else {return false;}
	}
}

class GetWord implements Supplier<String> {
	private String s1;
	private int n1 = 0;

	public GetWord(String s1) {
		super();
		this.s1 = s1;
	}
	@Override
	public String get() {
		String[] arr = s1.split(" ");
		String s1 = null;
		if(n1 < arr.length) {s1 = arr[n1];}
		n1 += 1;
		return s1;
	}
}