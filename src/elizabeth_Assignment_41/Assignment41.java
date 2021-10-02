/*Write a code to print below pattern.

*
##
***
####
*****

*/
package elizabeth_Assignment_41;

class Assignment41{
	
	void getPattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i%2!=0){
					System.out.print("*");
				}else if(i%2==0){
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Assignment41 assignment41=new Assignment41();
		assignment41.getPattern(5);
		System.out.println();
		assignment41.getPattern(8);
	}
}