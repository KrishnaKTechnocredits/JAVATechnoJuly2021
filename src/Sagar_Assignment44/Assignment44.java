/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/
package Sagar_Assignment44;

import java.util.ArrayList;

public class Assignment44 {
	int getMaxNoFromArrayList() {
		int max=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		
		for (int index=0; index<al.size();index++) {
			if(al.get(index)>max){
				max=al.get(index);
			}
		}
		System.out.println("Array Elements are :");
		for(int num:al) {
			System.out.print(num+" ");
		}
		System.out.print("\n"+"Max Number = "+max);
		
		return max;
	}
	
	public static void main(String[] args) {
		//int input : [10,7,99,53,74];
		Assignment44 assignment44= new Assignment44();
		assignment44.getMaxNoFromArrayList();
	}
}
