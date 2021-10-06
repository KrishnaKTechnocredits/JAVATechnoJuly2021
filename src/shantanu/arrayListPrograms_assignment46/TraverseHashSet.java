package shantanu.arrayListPrograms_assignment46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*Write a program to traverse(or iterate) HashSet.*/
public class TraverseHashSet {
	public static void main(String[] args) {
		String[] companies = {"Yardi","Xoriant","Capgemini","Xento"};
		HashSet<String> setOfCompanies = new HashSet<>(Arrays.asList(companies));
		
		Iterator<String> itr = setOfCompanies.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
