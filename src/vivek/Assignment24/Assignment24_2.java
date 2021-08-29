package vivek.Assignment24;

import java.util.Arrays;

public class Assignment24_2 {
	
	void getWordFrequency(String[] inputArray) {
		int cnt =0;
		int maxCount=0;
		String maxStr="";
		
		for (int index=0; index < inputArray.length; index++) {
			String str = inputArray[index];
			for (int innerindex=0; innerindex < inputArray.length; innerindex++) {
				if (str.equals(inputArray[innerindex]))
					cnt++;
			}
			if (cnt>=maxCount) {
				maxCount=cnt;
				maxStr=str;	
			}
			cnt=0;
		}
		System.out.println(maxStr + "->" + maxCount);
	}
	
	public static void main(String[] args) {
		Assignment24_2 assignment24_2 = new Assignment24_2();
		String str = " Hi Hello Hi Techno Hello Hi";
		String[] arr = str.split(" ");
		assignment24_2.getWordFrequency(arr);
	}
}
