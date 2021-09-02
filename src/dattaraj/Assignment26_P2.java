package dattaraj;

import java.util.Arrays;

public class Assignment26_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"Credits", "Techno","From","Chaturthi","Ganesh","Happy"};
		Assignment26_P2 p2 = new Assignment26_P2();
		p2.reverseArray(strArray);
	}

	private void reverseArray(String[] strArray) {
		// TODO Auto-generated method stub
		String[] newStrArray =new String[strArray.length]; 
		for(int i=strArray.length-1;i>=0;i--) {
	         //System.out.print(strArray[i] + "  ");
			newStrArray[i]=strArray[(strArray.length -1) - i];   
	        //System.out.println(newStrArray[i]);
		}
		System.out.println(Arrays.toString(newStrArray));
	}

}
