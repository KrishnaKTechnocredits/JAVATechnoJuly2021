package swati;
class PositiveNumbers{

	int returnCountOfPositiveNo(int[] number){
		int count=0;
		for(int index=0;index<number.length;index++){
			if(number[index]>0){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] a){
		PositiveNumbers positiveNumbers=new PositiveNumbers();
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("Count of positive numbers from given array:"+positiveNumbers.returnCountOfPositiveNo(input));
	}
		
	
}