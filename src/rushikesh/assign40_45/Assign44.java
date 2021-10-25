package rushikesh.assign40_45;
import java.util.ArrayList;
//Assignment - 44 : 1st  Oct'2021 
//Find out the max number from an ArrayList.
//input: [10,7,99,53,74]
//output: 99

public class Assign44 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		
		Assign44 assign44=new Assign44();
		System.out.println("The maximum number from arraylist"+ al+" is "+ assign44.findMaxNum(al));
	}
	int findMaxNum(ArrayList <Integer> al) {
		int max=0;
		for(int index=0; index<al.size(); index++) {
			if(max<al.get(index)) {
				max = al.get(index);
			}
		}
		return max;
	}

}
