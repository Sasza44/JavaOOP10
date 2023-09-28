package function;

import java.util.function.Function;

public class Second {

	public static void main(String[] args) {
		String text = "Hello, world";
		Function<String, Integer> f1 = a -> countLet(a);
		System.out.println(f1.apply(text));
	}
	
	public static Integer countLet(String text) {
		char[] arr = text.toLowerCase().toCharArray();
		char[] arr1 = new char[] {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
		int a1 = 0; // кількість приголосних літер
		for(char ch: arr) {
			boolean b = false;
			for(int i = 0; i < arr1.length; i++) {
				if(ch == arr1[i]) {b = true;}
			}
			if(b) {a1 += 1;}
		}
		return a1;
	}
}