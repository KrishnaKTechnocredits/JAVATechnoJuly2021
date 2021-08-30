/*  program 3: print unique characters from user defined string.
input : word -> aakanksha
output : n
         s
         h  */

package arti_K.Assignment_20;

public class UniqueChar {
	
	void findUniqueChar(String str) {
		System.out.println("Unique character in "+str+" are : ");
		String name = str.toLowerCase();
		
		for(int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			
			if(name.indexOf(ch) == index) {
				int count = 0;
				for(int innerindex = 0; innerindex < name.length(); innerindex++) {
					if(name.charAt(innerindex) ==  ch)
						count++;
				}
				if(count == 1)
					System.out.println(ch+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		UniqueChar unique = new UniqueChar();
		unique.findUniqueChar("aaknKshA");
	}
}
