/* Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/

package harshada.Assignment_44;

import java.util.ArrayList;

public class Program_1 {
	
	void getMaxNumber() {
		
		ArrayList<Integer> numbers =new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(7);
		numbers.add(99);
		numbers.add(53);
		numbers.add(74);
		int num1=0;
		int num2=0;
		int max=0;
		for(int index=0; index< numbers.size(); index++) {
			num1=numbers.get(index);
			num2=numbers.get(index++);
			
			if(num1>max) {
				max=num1;
			}
		}
		System.out.println("Maximum number in arrayList is = "+ max);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_1 program1=new Program_1();
		program1.getMaxNumber();
	}

}
