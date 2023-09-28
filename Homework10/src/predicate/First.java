package predicate;

import java.util.ArrayList;
import java.util.List;

public class First {

	public static void main(String[] args) {
		List<String> cars = new ArrayList<>(List.of("Audi", "BMW", "Chery", "Chevrolet", "Citroen", "FIAT", "Ford", "Geely", "Honda", "Hyundai", "KIA", "Lexus", "Mazda", "Mercedes", "Mitsubishi", "Nissan", "Opel"));
		cars.removeIf(a -> a.startsWith("F"));
		System.out.println(cars);
	}
}