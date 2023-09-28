package supplier;

import java.util.function.Supplier;

public class First {

	public static void main(String[] args) {
		Supplier<String> sup = new ReturnWord("Paris London Warszawa Kyiv");
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
		System.out.println(sup.get());
	}
}

class ReturnWord implements Supplier<String> {
	private String string1;
	private int n1 = 0;

	public ReturnWord(String string1) {
		super();
		this.string1 = string1;
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	@Override
	public String get() {
		String[] arr = string1.split(" ");
		String s1 = arr[n1];
		n1 += 1;
		if(n1 >= arr.length) {n1 = 0;}
		return s1;
	}
}