/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package chandani.Assignment_37;

class Assignment37{

	void getLargestWord(String str){
		
		String[] arr = str.split(" ");
		String largest = arr[0];
		String secondlargest = arr[1];
		
		for (int index = 2; index < arr.length; index++){
				if (arr[index].length() > largest.length()) {
					secondlargest = largest;
					largest = arr[index];
				} else if (arr[index].length() > secondlargest.length())
					secondlargest = arr[index];
			}
		System.out.println("Second max word in the given String " + str + " is : " + secondlargest);
	}
	
	public static void main(String[] args){
		Assignment37 obj = new Assignment37();
		String str = "Welcome to the family";
		obj.getLargestWord(str);
	}

}