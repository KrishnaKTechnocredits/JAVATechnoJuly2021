/*Assignment 15 : 16th Aug'2021

program 1*:  write a program that will return difference of even length name and odd length name.
arr[0] = "Maulik";		
arr[1] = "Techno";		
arr[2] = "Nidhi";		
arr[3] = "Ankit";
output : 2
*/

package ritabrata;

public class OddLength {
	
	int findOddLength(String[] name) {
		int evenSum=0, oddSum=0;
		for(int index=0;index< name.length ;index++){
			if(name[index].length()%2==0)
				evenSum+= name[index].length();
			else
				oddSum+= name[index].length();
		}
		
		return evenSum- oddSum;
		
	}
	void difference(int evenSum, int oddSum) {}
	
	public static void main(String[] args) {
		OddLength array= new OddLength();
		String[] arr= {"Maulik", "Techno","Nidhi", "Ankit"};
		array.findOddLength(arr);
		System.out.println("Array of names is as displayed: ");
		for (int index = 0; index < arr.length; index++)
			System.out.println(arr[index]);

		int diff = array.findOddLength(arr);
		System.out.println("Difference between even and odd length names of the array is: " + diff);

	}

}
