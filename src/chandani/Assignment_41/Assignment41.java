/*Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
***** */
package chandani.Assignment_41;

class Assignment41{

	void Pattern1(int n){
		for(int i = 1; i <= n; i++){
			for (int j = 1; j <= i; j++){
				if(i % 2 == 0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Assignment41 assignment41 = new Assignment41();
		assignment41.Pattern1(5);
	}
}