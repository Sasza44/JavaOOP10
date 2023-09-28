package predicate;

import java.util.ArrayList;
import java.util.List;

public class Second {

	public static void main(String[] args) {
		List<String> wordsList = new ArrayList<>(List.of("humor", "array", "tower", "house", "garden", "bridge"));
		char[] charArr = new char[] {'h', 'a', 't'};
		for(int i = 0; i < charArr.length; i++) {
			String st = Character.toString(charArr[i]);
			wordsList.removeIf(a -> a.startsWith(st));
		}
		System.out.println(wordsList);
	}
}