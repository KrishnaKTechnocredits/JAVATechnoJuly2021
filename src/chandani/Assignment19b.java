class Assignment19b{

	String getMaxlengthWordinString(String str){
		int maxlength = 0;
		String maxword = "";
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxlength) {
				maxlength = arr[index].length();
				maxword = arr[index];
			}
		}
		return maxword;
	}
	
	public static void main (String[] args){
		Assignment19b assignment19b = new Assignment19b();	
		String max = "good morning technocredits hi hello";
		System.out.println("max length of words in the given String is : " + assignment19b.getMaxlengthWordinString(max));
	}	
}