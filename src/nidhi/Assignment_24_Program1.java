package nidhi;


class Assignment_24_Program1{
	
	String findVowels(String str){
		String vowels = "";
		
		for(int i=0;i <str.length();i++){
			switch (str.charAt(i)){
				case 'a':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				case 'e':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				case 'i':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				case 'o':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				case 'u':
					if (vowels.indexOf(str.charAt(i)) >=0){
					}else{						
					vowels = vowels + (str.charAt(i));
					}
					break;
				}
		}
		
		return vowels;
		
	}
	
	public static void main(String[] ar){
		Assignment_24_Program1 assignment24 = new Assignment_24_Program1();
		System.out.println("Vowels are : " + assignment24.findVowels("Technocredits"));
		
		
	}

}