package elizabeth_Assignment_37;

public class Assignment37 {

	String getMaxWord(String str){
		String maxLengthWord=" ";
		String secondMaxLengthWord=" ";
		String[] arr= new String[str.length()];
		arr=str.split(" ");
		for(int index=0;index<arr.length;index++){
			if(maxLengthWord.length()<arr[index].length()){
				secondMaxLengthWord=maxLengthWord;
				maxLengthWord=arr[index];
			}
			else if(secondMaxLengthWord.length()<arr[index].length() && secondMaxLengthWord!=maxLengthWord){
				secondMaxLengthWord=arr[index];
			}
		}
		return secondMaxLengthWord;
	}
	
	public static void main(String[] args){
		Assignment37 assignment37=new Assignment37();
		System.out.println(assignment37.getMaxWord("Welcome to the family"));
		System.out.println(assignment37.getMaxWord("Welcome to Bengaluru"));
	}

}
