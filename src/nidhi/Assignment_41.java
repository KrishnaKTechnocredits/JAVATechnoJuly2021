package nidhi;

/**
Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
*****

**/

class Assignment_41{
	
	public static void main(String[] arg){
		for (int i=1;i<=5;i++){
			if(i%2 ==0){
				int k=1;
				while(k<=i){
				System.out.print("#");
				k++;}
			}else {
				int k=1;
				while(k<=i){
				System.out.print("*");
				k++;}
			}
			System.out.println();
		}
	}


}