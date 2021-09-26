package dattaraj;

public class Assignment36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "good morning";
		String input2 = "amol";
		String input3 = "haorseuih";
		Assignment36 obj = new Assignment36();
		obj.vowelSwap(input1);
		obj.vowelSwap(input2);
		obj.vowelSwap(input3);
	}

	 void vowelSwap(String str) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				cnt++;
			}
		}
		int[] arr = new int[cnt];
		int temp = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				arr[temp]=i;
				temp++;
			}
		}
		
		//System.out.println(Arrays.toString(arr));
		char[] ch = str.toCharArray();
		//System.out.println(Arrays.toString(ch));
		char swapVowel='\0';
		for(int index=0; index<arr.length/2; index++) {
			swapVowel = ch[arr[index]];
			ch[arr[index]] = ch[arr[arr.length-1-index]];
			ch[arr[arr.length-1-index]] = swapVowel;
		}
		System.out.println("input- " + str + "\noutput- " + new String(ch));
	}

}
