package comparable;

public class Number implements Comparable<Number> {
	private int number;

	public Number(int number) {
		super();
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Number [number=" + number + "]";
	}
	@Override
	public int compareTo(Number o) {
		if(this.number > o.number) {
			return 1;
		}
		else if(this.number < o.number) {
			return -1;
		}
		else {
			return 0;
		}
	}
}