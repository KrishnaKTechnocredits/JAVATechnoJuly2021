package precilla;

public class ArrayProgram9 {
	void getArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			System.out.print(arr[index]+" ");
		}
	}
	void getMiddleChar(String[] array) {
		char output[]=new char[array.length];
		int middleCharacterIndex;
		for(int index=0;index<array.length;index++) {
			if(array[index].length()%2==0) {
				middleCharacterIndex=array[index].length()/2-1;
			}else {
				middleCharacterIndex=array[index].length()/2;
			}
			output[index]=array[index].charAt(middleCharacterIndex);
			System.out.print(output[index]+" ");
			}
	}
	public static void main(String[] args) {
		ArrayProgram9 arrayProgram9=new ArrayProgram9();
		String[] arr={"Precilla","Aranha","Stela","Baa"};
		System.out.println("Given array :");
		arrayProgram9.getArray(arr);
		System.out.println("\n\nMiddle Character of all elements of the String array :");
		arrayProgram9.getMiddleChar(arr);
	}
}
