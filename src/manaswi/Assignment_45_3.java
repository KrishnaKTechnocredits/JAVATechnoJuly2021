package manaswi;
import java.util.ArrayList;
import java.util.Arrays;

/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/
public class Assignment_45_3 
{
	void getIndex(String[] str) 
	{
		ArrayList<String> listname = new ArrayList<>(Arrays.asList(str));
		for(int index=0;index<listname.size();index++) 
		{
			if(listname.get(index).contains("Akanksha"))
			{
				System.out.println(index);	
			}

		}
	}
	public static void main(String[] args) 
	{
			String[] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
			Assignment_45_3 assignment_45_3 = new Assignment_45_3();
			assignment_45_3.getIndex(input);

	}
}