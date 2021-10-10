package technocredits1.collectionDemo;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	int age;
	int rollNum;
	String name;
	int marks;
	
	public Student() {
		
	}
	public Student(int age, int rollNum, String name, int marks) {
		this.age = age;
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int compareTo(Student o1) {
		return this.name.compareTo(o1.name);
	}
	
	
}
