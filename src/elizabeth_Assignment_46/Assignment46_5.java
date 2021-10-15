/*Example 5:  
Remove the longest string from given Set.*/

package elizabeth_Assignment_46;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;

class Assignment46_5{
	
	void getMaxLengthString(String[] arr){
		LinkedHashSet<String> hashSet= new LinkedHashSet<String>(Arrays.asList(arr));
		int maxLength=0;
		String maxLengthWord=" ";
		for(String temp:hashSet){
			if(temp.length()>maxLength){
				maxLength=temp.length();
				maxLengthWord=temp;
			}
		}
		System.out.println(maxLengthWord);
	}
	
	public static void main(String[] args){
		Assignment46_5 assignment46_5=new Assignment46_5();
		String[] input={"Techno", "Credits","Technocredits","Bengalure"};
		System.out.println("------------Example 5-----------");
		assignment46_5.getMaxLengthString(input);
	}
}