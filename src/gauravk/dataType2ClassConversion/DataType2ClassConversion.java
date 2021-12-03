package gauravk.dataType2ClassConversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataType2ClassConversion {

	public static void main(String[] args) {
		int[] input = {10,0,0,1,0,3,0,2,6};
		// -------Converting data type to its class--------------
		Integer[] x = new Integer[input.length];
		for(int i=0; i<input.length; i++) {
			x[i]=input[i];
		}

		List<Integer> ls = new ArrayList<Integer>(Arrays.asList(x));
		
		System.out.println(Arrays.toString(input));
		System.out.println(ls);
		
		// --------Converting class type to its data type----------
		int[] output = new int[x.length];
		for(int i=0; i<x.length; i++) {
			output[i]=x[i];
		}
		
		System.out.println(Arrays.toString(output));
		//---------------------------------------------------
		int a = 10;
		Integer b = new Integer(a);
		int c = b.intValue();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}