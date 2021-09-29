package priti_String_programmes;

public class Assingment_29_3 {
	/*program 2: String Pallindrome by without writing reverse method logic.
	 String input = "aabttbaa";
	*/
	boolean isPallindrome(String input) {
		System.out.println("For even length string");
		boolean flag=true;
		int index=0;
		int cnt=0;
		if (input.length()%2==0) {
			
			for (int innerIndex=input.length()-1;innerIndex>=0;innerIndex--) {
				if (input.charAt(innerIndex)==input.charAt(index)) {
						cnt++;	
				}else
						cnt=0;
				index++;
				}
				if (cnt>=input.length()/2) {
			 		flag=true;
			 	}else {
			 		flag=false;
			 	}
		}
		return flag;
	}

	void display(String input) {
		if (isPallindrome(input)) 
			System.out.println(input+" is Pallindrome");
		else
			System.out.println(input+" is not Pallindrome");
	}
	
	public static void main(String[] a) {
		String input = "aabttbaa";
		Assingment_29_3 assingment_29_3 = new Assingment_29_3();
		assingment_29_3.display(input);
		String input1= "mamdam";
		assingment_29_3.display(input1);
	}
}

	

