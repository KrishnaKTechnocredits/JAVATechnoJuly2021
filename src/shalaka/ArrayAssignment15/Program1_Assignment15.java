package shalaka.ArrayAssignment15;

public class Program1_Assignment15 {
	
	int getDiffEvenAndOddNameLength(String arr[]) {
		int evenLengthSum=0, oddLengthSum=0;
		for(int index=0; index<arr.length;index++) {
			String str=arr[index];
			if(str.length()%2==0)
				evenLengthSum+= str.length();
			else
				oddLengthSum+=str.length();
		}
		return evenLengthSum - oddLengthSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[4];
		arr[0] = "Maulik";
		arr[1] = "Techno";
		arr[2] = "Nidhi";
		arr[3] = "Ankit";
		Program1_Assignment15 program_Assignment15 = new Program1_Assignment15();
		int difference=program_Assignment15.getDiffEvenAndOddNameLength(arr);
		System.out.println("Differnce of even length and odd length is: "+difference);
		

	}

}
