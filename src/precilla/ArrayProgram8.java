package precilla;

public class ArrayProgram8 {
	public static void main(String[] args) {
		ArrayProgram8 arrayProgram8=new ArrayProgram8();
		System.out.print("Given Array: ");
		String[] array= {"Precilla","Aranha","Stela","Baa"};
		System.out.println("\nDifference of even Length and odd Length Name : "+arrayProgram8.getEvenLenghtandOddLength(array));
	}

	int  getEvenLenghtandOddLength(String[] array) {
		int evenLength=0;
		int oddLength=0;
		int difference=0;
		for(int index=0;index<array.length;index++) {
			System.out.print(array[index]+" ");
			if(array[index].length()%2==0)
				evenLength=evenLength+array[index].length();
			else
				oddLength=oddLength+array[index].length();
			}
			difference=evenLength-oddLength;
			return difference;
		}
	}
