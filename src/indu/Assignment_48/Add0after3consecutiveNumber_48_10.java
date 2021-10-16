/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/
package indu.Assignment_48;

import java.util.ArrayList;
import java.util.Arrays;

public class Add0after3consecutiveNumber_48_10 {

	static void append0After3consecutiveNum()
	{
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(1,2,3,5,4,5,7));
		ArrayList<Integer> output = new ArrayList<>();
		output.add(alist.get(0));
		output.add(alist.get(1));
		System.out.println("Input is  : "+alist);
		for(int index = 2;index<alist.size();index++)
		{
			output.add(alist.get(index));
			if(alist.get(index-1)==alist.get(index)-1 && alist.get(index-2)==alist.get(index)-2)
			{
				output.add(0);
			}
		}
		System.out.println("Output is : "+output);
	}
	public static void main(String[] args) {
		
		append0After3consecutiveNum();
	}
}
