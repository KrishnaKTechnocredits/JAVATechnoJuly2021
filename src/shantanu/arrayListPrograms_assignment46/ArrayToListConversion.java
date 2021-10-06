package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Write a program to convert Array to List.*/
public class ArrayToListConversion {
	public static void main(String[] args) {
		String[] companies = {"Yardi","Xoriant","Capgemini","Xento"};
		ArrayList<String> listOfCompanies = new ArrayList<>(Arrays.asList(companies));
		System.out.println(listOfCompanies);
	}
}
