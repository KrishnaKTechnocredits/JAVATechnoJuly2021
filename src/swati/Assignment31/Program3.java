package swati.Assignment31;

/*
 * Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66

 */

public class Program3 {
	int count=0;
	
	void findTriple(int[] input) {
		for(int index=0;index<input.length-2;index++) {
			int number=input[index];
			if(number+1==input[index+1]) {
				if(number+2==input[index+2]) {
					count++;
					System.out.println(input[index]+","+input[index+1]+","+input[index+2]);
				}
				
			}
		}
			
	}
			 
	public static void main(String[] a) {
		Program3 p3=new Program3();
		int[] input = {10,23,24,25,26,61,62,64,65,66};
		p3.findTriple(input);
	}

}
