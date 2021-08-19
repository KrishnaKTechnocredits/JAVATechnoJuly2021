package shreya;

public class EvenOddDiffrenceInArray {

    int getMaxEvenNumber(int[] num)	{
    	int maxodd=0;
    	int maxeven=0;
    	for(int index=0;index<num.length;index++) {
    		if(num[index]%2==0) {
    			if(num[index]>maxeven) 
    				maxeven=num[index];
    			}else if(num[index]>maxodd) 
    				maxodd=num[index];
    		}
    		
    	
    		if(maxeven-maxodd>0) 
    			return maxeven-maxodd;
    		else 
    		
    			return maxodd-maxeven;
    	
    
    }
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23,22};
		EvenOddDiffrenceInArray evenOddDiffrenceInArray=new EvenOddDiffrenceInArray();
		int difference=evenOddDiffrenceInArray.getMaxEvenNumber(input);
	System.out.println("Difference between maximum even and maximum odd number from given array "+difference);
	}
	

}
