/*Assignment15
 program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}

Hint : charAt method of String class helps to retrieve character on given index

 */

package ritabrata;

public class MiddleCharector {
	
	char[] getMiddleNumber(String[] name) {
		int middleChar=0;
		char[] output= new char[name.length];
		for(int index=0; index<name.length; index++) {
			if(name[index].length()%2==0)
				middleChar= name[index].length()/2 -1;
			else
				middleChar= name[index].length()/2;
			output[index] = name[index].charAt(middleChar);
		}
		return output;
	}

	public static void main(String[] args) {
		MiddleCharector array= new MiddleCharector();
		String[] str = {"hello","techno","credits"};
		char[] output= array.getMiddleNumber(str);
		System.out.println("Middle characters of words given in the array are: ");
		for (int index = 0; index < output.length; index++)
			System.out.println(output[index]);

	}

}
