package indu.Assignment_46;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToList_15 {

	public static void main(String[] args) {
		ArrayList<Object> alist = new ArrayList<>();
		alist.add("Indu");
		alist.add("Birthday");
		alist.add('o');
		alist.add('n');
		alist.add(11);
		alist.add("Nov");
		alist.add(true);
		
		List<Object> list = new ArrayList<>(alist);
		System.out.println("List is :"+list);
	}
}
