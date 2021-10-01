package aniket;

public class Assignment_43 {
	int findLength(String str) {
		int count = 0;
		//char ch = str.charAt(count);
		while(true) {
			try {
				str.charAt(count);
				count++;
				
			}catch (StringIndexOutOfBoundsException e) {
				// TODO: handle exception
				break;
			}
			
			
		}
		//char ch[] = str.toCharArray();
		
		
		/*
		 * for (int index = 0; index < ch.length; index++) {
		 * System.out.println(ch[index]); count++;
		 * 
		 * } return count;
		 */
		return count;
	}

	public static void main(String[] args) {

		String str = "Aniket";
		System.out.println("Length of the " + str + " is :" + new Assignment_43().findLength(str));
	}
}
