class Assignment19c{

	String getMinlengthWordinString(String str){
		
		String minword = "";
		String[] arr = str.split(" ");
		int minlength = arr[0].length();
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() < minlength) {
				minlength = arr[index].length();
				minword = arr[index];
			}
		}
		return minword;
	}
	
	public static void main (String[] args){
		Assignment19c assignment19c = new Assignment19c();	
		String min = "good morning technocredits hi hello";
		System.out.println("min length of words in the given String is : " + assignment19c.getMinlengthWordinString(min));
	}	
}