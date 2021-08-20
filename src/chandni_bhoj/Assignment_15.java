package chandni_bhoj;

public class Assignment_15 {


		int getDiffOfEvenAndOddLength (String [] arr) {
		int evenLength = 0;
		int oddLength = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0)
				evenLength += arr[index].length();
			else 
				oddLength += arr[index].length();

		}

		return evenLength - oddLength;
	}

		int processData () {
		String [] args = new String [4];
		args[0] = "Maulik";
		args[1] = "Techno";
		args[2] = "Nidhi";
		args[3] = "Ankit";
		return getDiffOfEvenAndOddLength(args);
	}
		
		
			
			
		char[] getMiddleOfElements (String [] arr) {
				int midIndex = 0;
				char [] input = new char [arr.length];
			for (int index = 0; index < arr.length; index ++) {
				if ( arr[index].length()  % 2 == 0)
				midIndex = ( arr[index].length()/2 - 1);
				else 
				midIndex =(arr[index].length()/2);
				 arr[index].charAt(midIndex);
				 input[index] = arr[index].charAt(midIndex);	
			}
			
			return input;
		}
		
		int getDifferenceOfEvenAndOdd (int [] arr) {
			int evenNum = 0;
			int oddNum = 0;
			int diff = 0;
			for (int index = 0; index < arr.length; index++ ) {
				if (arr[index] % 2 == 0)
					evenNum += arr[index];
				else 
					oddNum += arr[index];
			}
			if(evenNum > oddNum)
				diff = evenNum - oddNum;
			else
				diff = oddNum - evenNum;
			
			
			return diff;
		}
	


	public static void main(String[] args) {
		Assignment_15 assignment_15 = new Assignment_15 ();
		assignment_15.processData();
		System.out.println (assignment_15.processData());
		String [] arrs = new String [] {"hello","techno","credits"};
		assignment_15.getMiddleOfElements(arrs);
	System.out.println (assignment_15.getMiddleOfElements(arrs));
		int [] arr = new int [] {12,2,13,9};
		assignment_15.getDifferenceOfEvenAndOdd(arr);
		System.out.println (assignment_15.getDifferenceOfEvenAndOdd(arr));
		

	}

}
