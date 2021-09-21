package technocredits1.code_Interview;

import java.util.Arrays;

public class Q1 {
	
	public static void main(String[] args) {
		int a[] = {5,0,3,6,9,5,0,6,0,3,6};
		int b[] = new int[a.length];
		int cnt = 0;
		for(int i =0;i<a.length;i++) {
			if(a[i]>0)
				b[cnt++] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
