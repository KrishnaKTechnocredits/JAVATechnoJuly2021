package precilla.assignment46;
import java.util.ArrayList;
import java.util.List;

//Example 3 :
//Write a program to remove duplicate from ArrayList (without using set).
public class Prorgram3 {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		List<Integer> removeDduplicate=new ArrayList<>();
		al.add(20);
		al.add(40);
		al.add(44);
		al.add(15);
		al.add(78);
		al.add(44);
		al.add(15);
		al.add(78);
		al.add(45);
		System.out.println("input : "+al);
		for(int data:al) {
			if(!removeDduplicate.contains(data))
				removeDduplicate.add(data);
		}
		System.out.println("After removing duplicates : "+removeDduplicate);
		
	}
}
