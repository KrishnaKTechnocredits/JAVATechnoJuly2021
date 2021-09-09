/*
 * Test 4 : 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};


Test 5 :
Find first 5 perfect numbers.

 */
package tanmoy_Roy.CodingTest_4;
import java.util.*;


public class Program {
	
		int[] rearrangeZero(int[] input) {
			int n=input.length,x=0,y=n-1;
			int[] arr=new int[n];
			for(int i=0;i<n;i++) 
				if(input[i]!=0)
					arr[x++]=input[i];
				else
					arr[y--]=input[i];
			return arr;
		}
	
		double[] firstNPerfectNumbers (int n) {    //the thing boils down to find first 5 prime
			
			double[] perfectnumbers= new double[5];
			int count=0,i=2,number=2;
				while(count<n) {
					boolean flag=true;
					for(i=2;i<=(number/2);i++) 
						if(number%i==0) {
							flag=false;
							break;
						}
					if(flag==true)
						perfectnumbers[count++]=Math.pow(2, number+1)*(Math.pow(2, number)-1);
					
					number++;
				}
				
			return perfectnumbers;
		}
					
			public static void main(String[] args) {
				Program prg = new Program();
				Scanner scan =new Scanner(System.in);
				char entermore='Y';
				while(entermore=='Y' || entermore=='y') {
					
					System.out.println("Enter the array for 0 rearrange: ");
					String[] input = scan.nextLine().split(",");
					int[] arr1= new int[input.length];
					for(int i=0 ;i<input.length;i++)
						arr1[i]=Integer.parseInt(input[i]);
					System.out.println("The Rearranged array  :"+ Arrays.toString(prg.rearrangeZero(arr1)));
					
					System.out.println("The First five Perfect number are : ");
					System.out.println(Arrays.toString(prg.firstNPerfectNumbers(5)));
					
					System.out.println("Want to Enter more (Y/N): ");
					entermore = scan.nextLine().charAt(0);
				}
				scan.close();
			}
	
		


}
