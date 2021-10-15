/*Example 12:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]*/

package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.ArrayList;

class Assignment46_12{
	
	
	boolean isPrimeNum(int num){
		boolean flag=true;
		for(int index=2;index<num;index++){
			if(num%index==0){
				flag=false;
				break;
			}
		}
		if(flag)
			return true;
		else 
			return false;
	}
	
	ArrayList<Integer> getNonPrimeNumbers(Integer[] input){
		ArrayList<Integer> al= new ArrayList<Integer>(Arrays.asList(input));
		for(int index=0;index<al.size();index++){
			if(!isPrimeNum(al.get(index))){
				al.remove(al.get(index));
				index--;
			}
		}
		return al;
	}
	
	public static void main(String[] args){
		Assignment46_12 assignment46_12=new Assignment46_12();
		Integer[] input={19,12,18,17,23,22};
		System.out.println("------------Example 12-----------");
		System.out.println(assignment46_12.getNonPrimeNumbers(input));
	}
}

