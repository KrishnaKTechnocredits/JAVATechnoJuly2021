package swati;
class CountZeros{

	int returnCountOfZeros(int[] number){
		int count=0;
		for(int index=0;index<number.length;index++){
			if(number[index]==0){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] a){
		CountZeros countzeros=new CountZeros();
		int[] input = {1,-11,0,0,55,0,-23,0};
		System.out.println("Total number of zero's in given array: "+countzeros.returnCountOfZeros(input));
	}
		
	
}