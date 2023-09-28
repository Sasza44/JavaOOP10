package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Third {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Umka", 12);
		Cat cat2 = new Cat("Luska", 5);
		Cat cat3 = new Cat("Barsic", 8);
		Cat cat4 = new Cat("Timka", 4);
		Cat cat5 = new Cat("Kuzia", 2);
		List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));
		delSomeOb(cats, 5, "C"); // видалення елементів, які відповідають одночасно двом умовам (молодше параметру та ім'я починається з літери після параметру)
		System.out.println(cats);
	}
	public static List<Cat> delSomeOb(List<Cat> cats, int age, String firsrLet) { // видалення елементів, які відповідають одночасно двом умовам (молодше параметру та ім'я починається з літери після параметру)
		Predicate<Cat> pr1 = a -> a.getAge() < age;
		Predicate<Cat> pr2 = a -> {
			if(a.getName().substring(0, 1).compareTo(firsrLet) > 0) {
				return true;
			}
			else {return false;}
		};
		cats.removeIf(pr1.and(pr2));
		return cats;
	}
}