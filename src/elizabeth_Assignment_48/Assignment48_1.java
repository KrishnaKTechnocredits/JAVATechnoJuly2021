//Program 1: Create a system to generate AadharNumber with rules discussed in class.

package elizabeth_Assignment_48;
import java.util.HashMap;  
import java.util.Map;

class Assignment48_1{
	
	static Map<String,String> map=new HashMap<String,String>();
	String panCard;
	
	Assignment48_1(String panCard){
		this.panCard=panCard;
	}
	
	String getAdhaarNumber(){
		if(!map.containsKey(panCard))
			map.put(panCard,panCard+1);
		return map.get(panCard);
	}
	
	public static void main(String[] args){
		Assignment48_1 assignment48_1_1=new Assignment48_1("GTS78956TQ");
		Assignment48_1 assignment48_1_2=new Assignment48_1("GTS78956WR");
		Assignment48_1 assignment48_1_3=new Assignment48_1("GTS78956IS");
		System.out.println("------Program1-------");
		System.out.println(assignment48_1_1.getAdhaarNumber());
		System.out.println(assignment48_1_2.getAdhaarNumber());
		System.out.println(assignment48_1_3.getAdhaarNumber());
	}
}