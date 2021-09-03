package pritiSwitch_programmes;



public class Assingment_24_2 {
	void findMaxRepeatingWordsInString(String [] str) {
		//String output = "";
		int maxWordCnt=0;
		String MaxrepeatingWord= "";
		
		for (int index=0; index<str.length;index++) {
			 //output = str[index];
			 int cnt=0;
			for(int innerIndex=0; innerIndex<str.length;innerIndex++) {
				if (str[index].equals(str[innerIndex])){
					cnt++;
					if (maxWordCnt<cnt){
					MaxrepeatingWord= str[index];
					maxWordCnt++;
					}
				}
				
			}
			
		}System.out.println(MaxrepeatingWord+ " is Maxrepeating word on the given string");
		System.out.println(MaxrepeatingWord +" appeard in the string " + maxWordCnt + " times");
	}
		public static void main(String[] a){
		Assingment_24_2 assingment_24_2 = new Assingment_24_2();
		String input="Hi Hello Hi Techno Hi Hello";
		String[] arr= input.split(" ");
		assingment_24_2.findMaxRepeatingWordsInString(arr);
	}
		
}
/*Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/