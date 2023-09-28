package supplier;

import java.util.Arrays;
import java.util.function.IntSupplier;

public class Third {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 43, 934, 56, 7, 45, 342, 23, 76, 233, 976, 3};
		IntSupplier ins = new GetElement(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(ins.getAsInt());
		System.out.println(ins.getAsInt());
		System.out.println(ins.getAsInt());
		System.out.println(ins.getAsInt());
		System.out.println(ins.getAsInt());
	}
}

class GetElement implements IntSupplier {
	private int[] arr;
	private int n1 = 0;
	
	public GetElement(int[] arr) {
		super();
		this.arr = arr;
	}
	@Override
	public int getAsInt() {
		int x = arr[n1];
		n1 += 1;
		if(n1 >= arr.length) {n1 = 0;}
		return x;
	}
}