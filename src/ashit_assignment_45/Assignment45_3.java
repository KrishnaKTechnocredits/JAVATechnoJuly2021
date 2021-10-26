/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1 4 */

package ashit_assignment_45;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment45_3 {

void printStringOccurances(String[] str, String word)
{
List<String> list = Arrays.asList(str);
ArrayList<String> input = new ArrayList<String>(list);
System.out.println("Index of element "+word +" is :-");
for(int index=0;index<input.size();index++)
{
	if(input.get(index).contains(word))
	{	
		System.out.print(index+ " ");
	}	
}
}

public static void main(String[] args) {
Assignment45_3  ass3 = new Assignment45_3();
String[] str = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
System.out.println("output is :" );
ass3.printStringOccurances(str, "Akanksha");
}
}
