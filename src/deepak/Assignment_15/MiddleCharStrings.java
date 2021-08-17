//Assignment 15 [Program 2] [return middle char of all elements of the String array] DATE: 08/16
package deepak.Assignment_15;

public class MiddleCharStrings {
	
	void getMiddleChars(String[] array) {
		char j;
		char k;
		for(int i = 0; i < array.length ; i++) {
			if(array[i].length() % 2 == 0) {
				j=array[i].charAt((array[i].length()/2)-1);
				System.out.println("Middle Character of "+array[i]+ " is: "+j);
				
			}
			if(array[i].length() % 2 != 0) {
				k=array[i].charAt((array[i].length()/2));
				System.out.println("Middle Character of "+array[i]+ " is: "+k);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleCharStrings obj=new MiddleCharStrings();
		String[] str = {"hello","techno","credits"};
		obj.getMiddleChars(str);
	}
}
