package chirag.assignment46;

import java.util.Arrays;
import java.util.List;

//Write a program to convert Array to List

public class ConvertArrayToList {
	
	public static void main(String[] args) {
		String [] str= {"Chirag","Madhvi","Aarti","Megha","Priya"};
		List<String> list=Arrays.asList(str);
		System.out.println(list);
	}

}
