package nidhi;


class Assignment_24_Program2{
	
	void countString(String str){
		String[] input = str.split(" ");
		
		String maxStr = "";
		int maxcnt = 0;
		for (int index=0; index < input.length; index++){
			int freqcnt = 1;
			
			for (int innerindex = index+1; innerindex < input.length; innerindex++){
				if ( input[index].equals(input[innerindex]))
					freqcnt++;
				
				if (freqcnt > maxcnt){
					maxcnt = freqcnt;
					maxStr = input[index];
				}
							
			}
		}
		System.out.println(maxStr + " -->" + maxcnt);
	}
	
	public static void main(String[] ar){
		Assignment_24_Program2 assignment24 = new Assignment_24_Program2();
		String str = "Hi Hello Hi Techno Hello Hi Hello he Hello";
		assignment24.countString(str);
		
	}

}