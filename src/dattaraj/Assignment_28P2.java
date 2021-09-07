package dattaraj;

public class Assignment_28P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_28P2 assignP2 = new Assignment_28P2();
		
		int[] array = {10,23,2,11,55,43,99};
		int n = 3;
		assignP2.nthMax(array,n);
	}

	void nthMax(int[] array, int n) {
		// TODO Auto-generated method stub
		int temp;
	    for(int i = 0; i<array.length; i++ ){
	       for(int j = i+1; j<array.length; j++){
	          if(array[i]>array[j]){
	             temp = array[i];
	             array[i] = array[j];
	             array[j] = temp;
	          }
	       }
	    }
	    System.out.println(n +" largest number is: "+array[array.length-n]);
	}

}
