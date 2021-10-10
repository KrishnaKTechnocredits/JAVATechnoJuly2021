package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example11 {

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('m'); //
		al.add('p'); //
		al.add('s'); // 2
		
		for(Character ch : al) {
			if(ch == 's') {
				al.remove(ch);
				break;
			}
		}
		
		/*for(int index=0;index<al.size();index++) {
			char ch = al.get(index);
			if(ch == 's') {
				al.remove(index);
				index--;
			}
		}*/
		System.out.println(al);
	}
}
