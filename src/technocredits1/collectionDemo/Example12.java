package technocredits1.collectionDemo;

import java.util.Arrays;

public class Example12 {
	
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Techno"};
		for(String data : arr) {
			arr[0] = "Credits";
		}
		System.out.println(Arrays.toString(arr));
	}
}
