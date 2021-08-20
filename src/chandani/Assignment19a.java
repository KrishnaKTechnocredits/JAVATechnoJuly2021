class Assignment19a{

	int getCountOfWordsinString(String str){
		int count = 0;
		String[] arr = str.split(" ");
		for (int index = 0;index < arr.length; index++){
			 count++;
		}
		return count;
	}
	
	public static void main (String[] args){
		Assignment19a assignment19a = new Assignment19a();	
		String input = "Hi Techno Credits Hello";
		System.out.println("Count of words in the given String is : " + assignment19a.getCountOfWordsinString(input));
	}	
}