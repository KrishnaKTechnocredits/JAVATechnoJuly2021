package precilla;

public class Assignment37 {
	public static void main(String[] args) {
		String str="welcome to the family";
		System.out.println("Input : "+str);
		String largest="";
		String secondLargest="";
		String array[]=str.split(" ");
	
		
		for(int index=0;index<array.length;index++) {
			if(array[index].length()>largest.length()) {
				secondLargest=largest;
				largest=array[index];
			}else if(array[index].length()>secondLargest.length()&&array[index].length()<largest.length()) {
				secondLargest=array[index];
			}
		}
		
		System.out.print("Output :"+secondLargest);
	}
}

