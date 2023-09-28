package comparable;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
	private String name;
	private int age;
	
	public Cat() {
		super();
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(getClass() != obj.getClass()) {
			return false;
		}
		if(obj == null) {
			return false;
		}
		if(this == obj) {
			return true;
		}
		Cat c = (Cat) obj;
		return age == c.age && Objects.equals(name, c.name);
	}
	@Override
	public int compareTo(Cat o) {
		if(this.name.length() > o.name.length()) {
			return 1;
		}
		else if(this.name.length() < o.name.length()) {
			return -1;
		}
		else {
			if(this.age > o.age) {
				return 1;
			}
			else if(this.age < o.age) {
				return -1;
			}
		}
		return 0;
	}
}