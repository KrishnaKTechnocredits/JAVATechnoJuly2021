/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/
package ashit_assignment_45;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_2 {
void getDuplicates(String[] str)
{
List<String> list = Arrays.asList(str);
ArrayList<String> name = new ArrayList<String>(list);
System.out.println("Input string :" + name);
ArrayList<String> output = new ArrayList<String>();
for(int index=0;index<name.size();index++)
{
	if(!(name.indexOf(name.get(index))==name.lastIndexOf(name.get(index))))
	{
		if(index==name.indexOf(name.get(index)))
		output.add(name.get(index));
	}

}
System.out.println("\nOutput String : "+output);
}

public static void main(String[] args) {
Assignment45_2 ass2 = new Assignment45_2();
String[] str = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
ass2.getDuplicates(str);
}
}
