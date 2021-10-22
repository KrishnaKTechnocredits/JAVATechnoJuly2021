package technocredits1.collectionFramework.comparable;

public class Student implements Comparable<Student> {

	String name;
	int rollNum;

	Student(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		if (this.rollNum > o.rollNum)
			return 1;
		else if (this.rollNum < o.rollNum)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return rollNum + " : " + name;
	}

}
