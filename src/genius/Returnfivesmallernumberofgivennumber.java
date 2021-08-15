package genius;

public class Returnfivesmallernumberofgivennumber {
	
	void get5SmallerNumberOfGivenNumber(int num) {
		int[] output = new int[5];
	    for(int index=0;index<output.length;index++) {
	    	if(output[index] == num);{
	    	   num--;
	    	   System.out.println(num);
	    	}   
	    }
	
	      
	}
    
	public static void main(String[] args) {
		Returnfivesmallernumberofgivennumber returnfivesmallernumberofgivennumber = new Returnfivesmallernumberofgivennumber();
	    returnfivesmallernumberofgivennumber.get5SmallerNumberOfGivenNumber(50);
        
	}

}
