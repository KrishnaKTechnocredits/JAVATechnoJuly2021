package technocredits1.collectionFramework.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCustomClass {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		list.add(new Student(5, "nasir"));
		list.add(new Student(1, "monali"));
		list.add(new Student(3, "aniket"));
		list.add(new Student(9, "parthav"));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
