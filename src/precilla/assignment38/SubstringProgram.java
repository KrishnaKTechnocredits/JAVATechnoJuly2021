package precilla.assignment38;

public class SubstringProgram {
	public static void main(String[] args) {
		System.out.println("Program :Find the substring starting from last hi to first Globant.");
		String str = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		System.out.println("\nString str : "+str);
		String firstIndex="Globant";
		String str1=str.substring(str.lastIndexOf("Hi"), str.indexOf(firstIndex)+firstIndex.length());
		System.out.println("Output :"+str1);
	}

}
