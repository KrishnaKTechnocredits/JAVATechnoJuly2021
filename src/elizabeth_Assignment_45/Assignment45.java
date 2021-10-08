/*Program 1: remove duplicates from arraylist, it should have only single occurance
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Techno","Mayur","Chandni","Amruta","Parthav", "Credits"]

Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]

program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4

program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/
package elizabeth_Assignment_45;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Assignment45{
	
	void getUniqueList(String[] arr){
		List<String> list= new ArrayList<String>(Arrays.asList(arr));
		List<String> output=new ArrayList<String>();
		for(String names:list){
			if(!output.contains(names)){
				output.add(names);
			}
		}
		System.out.println(output);
	}
	
	void getDuplicateList(String[] input){
		List<String> al=new ArrayList<String>(Arrays.asList(input));
		List<String> output= new ArrayList<String>();
		for(int index=0;index<al.size();index++){
			String names=al.get(index);
				if(al.indexOf(names)!=al.lastIndexOf(names)){
					if(!output.contains(names)){
						output.add(names);
					}
				}
			}
		System.out.println(output);
	}
	
	void getIndex(String[] arr,String str){
		List<String> list=new ArrayList<String>(Arrays.asList(arr));
		for(int index=0;index<list.size();index++){
			if(str.equals(list.get(index))){
				System.out.println(index);
			}
		}
	}
	
	ArrayList<String> getArrayList(String[] input){
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> output= new ArrayList<>();
		for(String element:al){
			if(element.startsWith("A")&& element.length()>6){
				if(!output.contains(element)){
					output.add(element);
				}
			}
		}
		return output;
	}
	
	
	public static void main(String[] args){
		Assignment45 assignment45=new Assignment45();
		String[] arr1={"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		String[] arr2={"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		String[] arr3={"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		String[] arr4={"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		
		assignment45.getUniqueList(arr1);
		assignment45.getDuplicateList(arr2);
		assignment45.getIndex(arr3,"Akanksha");
		System.out.println(assignment45.getArrayList(arr4));
		
		
	}
}