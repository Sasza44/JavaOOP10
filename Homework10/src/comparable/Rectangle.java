package comparable;

public class Rectangle implements Comparable<Rectangle> {
	private int length;
	private int hight;
	
	public Rectangle() {
		super();
	}
	public Rectangle(int length, int hight) {
		super();
		this.length = length;
		this.hight = hight;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int square() {
		return length * hight;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", hight=" + hight + ", square=" + square() + "]";
	}
	@Override
	public int compareTo(Rectangle o) {
		if(this.length * this.hight > o.length * o.hight) {
			return 1;
		}
		else if(this.length * this.hight < o.length * o.hight) {
			return -1;
		}
		else {
			return 0;
		}
	}
}