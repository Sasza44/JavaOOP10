package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Second {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		Consumer<String> c1 = a -> {
			if(searchN(a) == true) {
				l1.add(a);
			}
		};
		c1.accept("Hello");
		c1.accept("Hello1");
		c1.accept("Hello2");
		System.out.println(l1);
	}
	
	public static boolean searchN(String s) {
		char[] num = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int index = -1;
		boolean b = false;
		for(int i = 0; i < num.length; i++) {
			index = s.indexOf(num[i]);
			if(index > 0) {b = true;}
		}
		return b;
	}
}