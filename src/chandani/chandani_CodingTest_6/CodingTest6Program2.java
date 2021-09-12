package chandani.chandani_CodingTest_6;

public class CodingTest6Program2 {

void getNonRepeatingWord(String str) {
		

		String[] arr = str.split(" ");
		boolean flag = false;
		String temp = "";
		for(int index = 0; index < arr.length;index++) {
			temp = arr[index]; //Hi //this //is //techno
		  for (int otherindex = index + 1; otherindex < arr.length; otherindex ++) {
			if(temp.equalsIgnoreCase(arr[otherindex])) { 
				flag = false;
				break;
			}else
				 flag = true;
		  }			
		  if(flag == true) {
				System.out.println("Non repeating word in the given string " + str  + " : " + arr[index]);
				break;
		  }
		} 	
}

	public static void main(String[] args) {
		CodingTest6Program2 codingTest6 = new CodingTest6Program2();
		String input = "hi this is techno gm credits this hi is";
		codingTest6.getNonRepeatingWord(input);	
	}
}
