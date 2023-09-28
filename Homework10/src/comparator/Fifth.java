package comparator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Fifth {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>(List.of("b1.txt", "b2.txt", "b3.txt"));
		Comparator<String> c1 = (a, b) -> Integer.compare(countSymbols(a), countSymbols(b));
		l1.sort(c1);
		System.out.println(l1);
	}
	
	public static int countSymbols(String fileName) { // зчитування тексту з файлу з підрахунком розділових знаків в ньому
		File file = new File(fileName);
		StringBuilder sb = new StringBuilder();
		String text = "";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for(; (text = br.readLine()) != null; ) {
				sb.append(text);
				sb.append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		text = sb.toString();
		char[] arr = new char[] {',', '.', '-', '?', '!', ' '}; // масив символів, кількість яких підраховуємо
		int c1 = 0; // загальна кількість усіх розділових знаків
		for(int i = 0; i < arr.length; i++) {
			int c2 = 0; // кількість повторень певного символу
			for (int j = 0; j < text.length(); j++)
		    {
		        if (text.charAt(j) == arr[i]) {
		            c2++;
		        }
		    }
			c1 += c2;
		}
		return c1;
	}
}