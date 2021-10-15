/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/

package elizabeth_Assignment_46;
import java.util.ArrayList;

class Assignment46_7{
	
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
	
	ArrayList<Integer> printPrimeNumber(Integer start, Integer end){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int count=1;
		int num=start;
		while(count<=10 && num<=end){
			if(isPrimeNum(num)){
				list.add(num);
				count++;
			}
			num++;
		}
		return list;
	}
	
	public static void main(String[] args){
		Assignment46_7 assignment46_7=new Assignment46_7();
		System.out.println("------------Example 7----------");
		System.out.println(assignment46_7.printPrimeNumber(100,500));
	}
}