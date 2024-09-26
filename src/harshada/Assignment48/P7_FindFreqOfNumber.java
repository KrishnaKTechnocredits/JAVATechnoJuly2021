//program 7 : find the freq of each number in given array.

package harshada.Assignment48;

import java.util.HashMap;

public class P7_FindFreqOfNumber {

	void usingArray(int number[]) {
		
		for(int i=0; i< number.length ; i++) {
			int count=0;
			boolean visited=false;
			for(int j=i; j< number.length ; j++) {
				
				if(number[i]==number[j] ) {
					count++;
					visited=true;
				}	
			}
						System.out.println(" Number : " + number[i] + " Frequency :"+ count);	
		}	
	}
	
	void usingMap(int number[]) {
		HashMap <Integer, Integer> map=new HashMap();
		for(int i=0; i< number.length ; i++) {
			int count=1;
			if(map.containsKey(number[i])) {
				map.put(number[i], map.get(number[i])+1);
			}else
				map.put(number[i],1);
		}
	System.out.println("Number and its frequency is : " +map);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P7_FindFreqOfNumber obj=new P7_FindFreqOfNumber();
		int number[]= {1,2,3,1,2,4,5,6,7,7,1,2,3,6,7,9};	
		obj.usingMap(number);
		
	}

}
