package rasika;

/*reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
*/
public class Assignment26 {
	
	String[] revarray(String[] arr) {
		String[] op = new String[arr.length];
		int count =0;
		for(int index = arr.length-1; index >= 0; index--) {
			op[count] = arr[index];
			count++;
		}
		return op;
	}
	
	public static void main(String[] args) {
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		Assignment26 assignment26 = new Assignment26();
		String[] temp = assignment26.revarray(input);
		
		System.out.println("Reverse Array : ");
		for(int index = 0; index < temp.length; index++) {
			System.out.print(temp[index]+" ");
		}
	}
}
