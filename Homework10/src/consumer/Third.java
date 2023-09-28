package consumer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.BiConsumer;

public class Third {

	public static void main(String[] args) {
		File consumer = new File("consumer.txt");
		BiConsumer<String, File> b1 = (a, b) -> {
			try {
				writeToFile(b, a);
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
		b1.accept("Hello, world!", consumer);
		b1.accept("I'm a student.", consumer);
	}
	
	public static void writeToFile(File file, String text) throws IOException { // запис тексту в файл
		try(FileWriter fw = new FileWriter(file, true)) {
			fw.write(text);
			fw.write("\n");
		} catch(FileNotFoundException e) {
			System.out.println("Error file write");
		}
	}
}