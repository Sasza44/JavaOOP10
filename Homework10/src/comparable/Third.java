package comparable;

public class Third {

	public static void main(String[] args) {
		Cat c1 = new Cat("Umka", 12);
		Cat c2 = new Cat("Luska", 5);
		Cat c3 = new Cat("Kuzia", 2);
		Cat c4 = new Cat("Umka", 12);
		Cat c5 = new Cat("Barsic", 12);
		System.out.println(c1.compareTo(c2) < 0);
		System.out.println(c2.compareTo(c3) > 0);
	}
}