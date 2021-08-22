package tanmoy_Roy;

import tanmoy_Roy.Assignment13_1;

public class Assignment13_2 {
	
	int countZeros(int[] array,int N) {				//Same code as countPositiveIntegers() comparison to b made ==0
		int count=0;								//Can we re use the code from countPositiveIntegers()?? 
		int mid=N/2;								
		for(int i=0;i<mid;i++) {
			if(array[mid-i-1]==0)
				count++;
			if(array[mid+i]==0)
				count++;
		}											
		
		if(N%2==1 && array[N-1]==0)					
			count++;
		return count;
	}
	public static void main(String[] args) {
		Assignment13_1 assignment13_1=new Assignment13_1();
		Assignment13_2 assignment13_2=new Assignment13_2();
		int[] zero= {1,-11,0,0,55,0,-23,0};
		System.out.println(assignment13_1.arryToSinglelineString(zero,8)+" array has " +assignment13_2.countZeros(zero,8)+
				" Zero elements");
	}
}
