package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Student s1 = new Student(11,1,"Margi",93);
		Student s2 = new Student(17,12,"Amruta",98);
		Student s3 = new Student(15,11,"Madhvi",17);
		
		ArrayList<Student> listOfStudent = new ArrayList<Student>();
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		
		Collections.sort(listOfStudent);
		System.out.println(listOfStudent);
		
		Collections.sort(listOfStudent, new StudentAgeComparator());
		System.out.println(listOfStudent);
		
		//Collections.sort(listOfStudent, new StudentNameComparator());
		//Collections.sort(listOfStudent, new StudentMarksComparator());
		
	}
}
