
/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/
package santosh_Assignment44;

import java.util.ArrayList;
public class MaxNoInArrayList{
	
	void getMaxArrElement(){
    ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(7);
		arr.add(99);
		arr.add(53);
		arr.add(74);
    int max=arr.get(0);
	for(int i=0;i<arr.size();i++){
	   if(arr.get(i)>max){
		max = arr.get(i);
	System.out.println("\n The maxmimum Array number is :: " + max);

	    }
	  }
	}
	
	public static void main(String [] args){
	MaxNoInArrayList assignment44=new MaxNoInArrayList();
    assignment44.getMaxArrElement();
	}
}
