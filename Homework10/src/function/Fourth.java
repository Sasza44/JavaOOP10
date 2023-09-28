package function;

import java.util.function.BiFunction;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Fourth {

	public static void main(String[] args) {
		String text1 = "Hello Java";
		String text2 = "Hello Python";
		BiFunction<String, String, String[]> biFunc = (a, b) -> searchRepeat(a, b); // перетворення кожного з рядків на масив слів (пробіл як роздільник) з пошуком повторень
		System.out.println(Arrays.toString(biFunc.apply(text1, text2)));

	}
	
	public static String[] searchRepeat(String text1, String text2) { // перетворення кожного з рядків на масив слів (пробіл як роздільник) з пошуком повторень
		String[] arr1 = text1.split(" ");
		String[] arr2 = text2.split(" ");
		List<String> list = new ArrayList<>();
		for(int i = 0; i < arr1.length; i++) { // пошук повторень з вкиданням повторюваних слів в окремий список
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i].equals(arr2[j])) {list.add(arr2[j]);}
			}
		}
		String[] arr3 = new String[list.size()]; // масив повторюваних слів (утворюємо зі списку)
		list.toArray(arr3);
		return arr3;
	}
}