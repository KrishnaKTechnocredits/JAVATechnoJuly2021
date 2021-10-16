package manaswi;
import java.util.ArrayList;

public class Assignment_45_1
 {
	ArrayList<String> removeDuplicate(ArrayList<String> listnames)
	{
		for (int index = 0; index < listnames.size(); index++) 
		{
			if (listnames.indexOf(listnames.get(index)) != listnames.lastIndexOf(listnames.get(index))) 
			{
				// listnames.remove(index);
				listnames.remove(listnames.lastIndexOf(listnames.get(index)));
			}

		}
		return listnames;
	}
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Mayur");
		al.add("Chandni");
		al.add("Amruta");
		al.add("Chandni");
		al.add("Parthav");
		al.add("Mayur");
		al.add("Amruta");
		al.add("Credits");
		al.add("Amruta");

		System.out.println(new Assignment_45_1().removeDuplicate(al));

	}
}