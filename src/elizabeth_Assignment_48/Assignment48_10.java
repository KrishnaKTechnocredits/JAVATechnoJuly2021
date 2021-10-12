/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/

package elizabeth_Assignment_48;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Assignment48_10{
	
	void appendZeroAfterThreeConsecutiveNumbers(Integer[] arr){
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		for(int index=0;index<list.size()-2;index++){
			if(list.get(index+2)-list.get(index+1)==1 && list.get(index+2)-list.get(index)==2){
				list.add((index+3),0);
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args){
		Assignment48_10 assignment48_10=new Assignment48_10();
		Integer[] input={1,2,3,5,4,7};
		System.out.println("------Program10-------");
		assignment48_10.appendZeroAfterThreeConsecutiveNumbers(input);
	}
}

