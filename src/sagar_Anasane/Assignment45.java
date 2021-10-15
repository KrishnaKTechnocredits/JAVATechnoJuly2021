/*Assignment-45 : 2nd Oct

Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]

Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]

program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4

program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/
package sagar_Anasane;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45 {
	void removeDuplicatesFromArrayList() {
		/*ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		ArrayList<String> list1 = new ArrayList<String>();
		for(String name:list) {
			if(list.indexOf(name)!=list.lastIndexOf(name)) {
				list1.add(name);
			}
		}*/
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno"); 
		al.add("Mayur");
		al.add("Chandni");
		al.add("Amruta");
		al.add("Chandni");
		al.add("Parthav");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Credits");
		al.add("Amruta");
		System.out.println("Before Removal of Duplicates"+"\n"+al);
		ArrayList<String> al1 =new ArrayList<String>();
		for(int index=0;index<al.size();index++) {
			if(!al1.contains(al.get(index))) {
				al1.add(al.get(index));
			}
		}
		System.out.println("After Removal of Duplicates"+"\n"+al1);
		
		}
	void printDuplicatesInArrayList() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno"); 
		al.add("Mayur");
		al.add("Chandni");
		al.add("Amruta");
		al.add("Chandni");
		al.add("Parthav");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Credits");
		al.add("Amruta");
		//System.out.println(al);
		ArrayList<String> al1 =new ArrayList<String>();
		for(int index=0;index<al.size();index++) {
			if(al.indexOf(al.get(index))!=al.lastIndexOf(al.get(index))) {
				if(!al1.contains(al.get(index))) {
				al1.add(al.get(index));
				}
			}
		}
		System.out.println("\n"+"Duplicates in Array List :"+"\n"+al1);
	}
	void printIndexOfOccurannces() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Akanksha");
		al.add("Mayur");
		al.add("Chandni");
		al.add("Akanksha");
		al.add("Amruta");
		al.add("Chandni");
		al.add("Parthav");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Credits");
		al.add("Amruta");
		//System.out.println(al);
		System.out.println("\n"+"Index of All Occurences of Akanksha : ");
		for(int index=0;index<al.size();index++) {
			if(al.get(index)=="Akanksha") {
				System.out.println(index);
			}
		}	
	}
	void ArraylistHavingNameStartsWithAandLengthMoreThanSix() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Akanksha");
		al.add("Mayur");
		al.add("Chandni");
		al.add("Akanksha");
		al.add("Amruta");
		al.add("Chandni");
		al.add("Parthav");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Credits");
		al.add("Amruta");
		al.add("AparnaTiwari");
		ArrayList<String> al1=new ArrayList<String>();
		for(int index=0;index<al.size();index++) {
			if(al.get(index).charAt(0)=='A'&&al.get(index).length()>6) {
				if(!al1.contains(al.get(index)))
				al1.add(al.get(index));
			}
		}
		System.out.println("\n"+"Returns ArrayList Which Contains Names Starts with 'A' and having length more than 6 :"+"\n"+al1);
	}
	public static void main(String[] args) {
		Assignment45 assignment45 =new Assignment45();
		assignment45.removeDuplicatesFromArrayList();
		assignment45.printDuplicatesInArrayList();
		assignment45.printIndexOfOccurannces();
		assignment45.ArraylistHavingNameStartsWithAandLengthMoreThanSix();
	}
}
