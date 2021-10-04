/*Assignment 43:
  WAP to get string length without using length() method
  Example: 
  input: "technocredits"
  output:13
  */


package ritabrata2;

public class Assignment43 {
	void getLength(String input) {
		int count=0;
		while(true) {
			try {
				input.charAt(count);
				count++;
			}
			catch(StringIndexOutOfBoundsException e) {
				break;
			}
		}
		System.out.println("The length of the string: "+input+ " is: "+count);
		
		
	}
	

	public static void main(String[] args) {
		Assignment43 findLenght= new Assignment43();
		findLenght.getLength("technocredits");
		

	}

}
