package pritiProgrammesOnNumbers;

public class Assingment_31_3 {
	 int getcountTriplets(int [] input) {
		 int count=0;
		 for(int index=0;index<input.length-2;index++) {
			int num = input[index];
			 if (input[index+1]==num+1)
				 if (input[index+2]==num+2)
				count++;	 
		}
		 return count;
	 }
		
	public static void main(String[] a) {
		Assingment_31_3 assingment_31_3 = new Assingment_31_3();
		int [] arr = {10,23,24,25,26,61,62,64,65,66};
		System.out.println("No of triples formed out of given number Array is : "+assingment_31_3.getcountTriplets(arr));
	}
	

}
/*Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66*/
