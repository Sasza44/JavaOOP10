package function;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.function.Function;

public class Fifth {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		Function<Calendar, Integer> f = a -> (int)a.get(Calendar.YEAR);
		System.out.println(f.apply(cl));
//		System.out.println(cl.get(Calendar.YEAR));
	}
}