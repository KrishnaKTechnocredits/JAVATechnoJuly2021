package technocredits1.collectionDemo;

public class StringComparision {

	public static void main(String[] args) {
		String str1 = "baa";
		String str2 = "apz";
		
		if(str1.compareTo(str2) == 0) 
			System.out.println("Same");
		else if(str1.compareTo(str2) > 0)
			System.out.println("str1 bigger");
		else if(str1.compareTo(str2) <0)
			System.out.println("str1 smaller");
			
	}
}
