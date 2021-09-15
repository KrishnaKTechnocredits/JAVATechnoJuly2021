package dattaraj;

public class Assignment_28P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_28P1 assignP1 = new Assignment_28P1();
		
		int[] array = {10,23,2,11,55,43,99};

		assignP1.secondMax(array);
		
	}

	void secondMax(int[] array) {
		// TODO Auto-generated method stub
		int max=0;
		int secondmax=0;
		if(array[0]>array[1]){
			max=array[0];
			secondmax=array[1];
		}else {
			max=array[1];
			secondmax=array[0];
		}
	    for(int i = 2; i<array.length; i++ ){
	       if(array[i]>max) {
	    	  secondmax=max;
	    	  max=array[i];
	       }else if(secondmax > array[i]){
	    	   secondmax=array[i];
	       }
	    }
	    System.out.println("second largest number is : "+secondmax);
	} 

}
