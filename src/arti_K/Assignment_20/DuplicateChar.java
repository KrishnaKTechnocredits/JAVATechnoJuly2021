/* program 4 : print duplicate characters with their frequency from user defined string.
input : word -> aakanksha
output : a -> 4
         k -> 2
		 n -> 1
		 s -> 1
		 h -> 1
 */

package arti_K.Assignment_20;

public class DuplicateChar {
	
		
	void getString(String strname) {
		System.out.println("Duplicate character in "+strname+" are : ");
		String str = strname.toLowerCase();
		
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			
				if(str.indexOf(ch) == index) {
					int count = 0;
					for(int innerindex = 0; innerindex < str.length(); innerindex++) {
						if(str.charAt(innerindex) ==  ch)
							count++;
					}
					if(count > 1)
						System.out.println(ch+" ");
				}
			
			
		}
	}
	
	public static void main(String[] args) {
		DuplicateChar duplicate = new DuplicateChar();
		duplicate.getString("teCchnOptPTH");
	}
}
