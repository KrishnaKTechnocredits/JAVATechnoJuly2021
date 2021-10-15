package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Example18 {
	public static void main(String[] args) {
		Integer[] arr = { 11, 12, 13, 44, 55 };
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		int num=11;
		boolean remove=new Example18().removeObject(al,num);
		if(remove)
			System.out.println(num +" removed");
		else
			System.out.println("not present");
	}
	
	private boolean removeObject(ArrayList<Integer> al,int i) {
		boolean flag=false;
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			if(itr.next()==i)
			{
				itr.remove();
				flag=true;
				break;
			}
			else
				flag=false;
		}
		return flag;	
	}
}
