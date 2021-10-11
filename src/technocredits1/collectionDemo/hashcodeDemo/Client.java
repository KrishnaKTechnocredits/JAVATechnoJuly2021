package technocredits1.collectionDemo.hashcodeDemo;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		Student s1 = new Student("Maulik",33);
		Student s2 = new Student("Harsh",25);
		Student s3 = new Student("Atul",32);
		Student s4 = new Student("Harsh",25);
		Student s5 = new Student("Harsh",27);
		
		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2.hashCode());
		System.out.println("s4 - " + s4.hashCode());
		System.out.println("s5 - " + s5.hashCode());
		System.out.println(s2.equals(s4));
		HashSet<Student> setOfStudent = new HashSet<>();
		setOfStudent.add(s1);
		setOfStudent.add(s2);
		setOfStudent.add(s3);
		setOfStudent.add(s4);
		setOfStudent.add(s5);
		
		System.out.println(setOfStudent.size()); // 4
	}
}
