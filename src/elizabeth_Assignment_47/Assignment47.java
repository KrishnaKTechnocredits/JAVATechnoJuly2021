/*Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1

Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1*/

package elizabeth_Assignment_47;
import java.util.LinkedHashMap;  

class Assignment47{
	
	void getFrequencyOfChar(String str){
		LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<>();
		for(int index=0;index<str.length();index++){
			char ch=str.charAt(index);
			if(lhm.containsKey(ch)){
				int count=lhm.get(ch);
				lhm.put(ch,count+1);
			}else{
				lhm.put(ch,1);
			}
		}
		System.out.println(lhm);
	}
	
	void getFrequencyOfWord(String str){
		String[] arr=new String[str.length()];
		arr=str.split(" ");
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
		for(int index=0;index<arr.length;index++){
			String temp=arr[index];
			if(lhm.containsKey(temp)){
				int count=lhm.get(temp);
				lhm.put(temp,count+1);
			}else{
				lhm.put(temp,1);
			}
		}
		System.out.println(lhm);
	}
	
	
	
	public static void main(String[] args){
		Assignment47 assignment47=new Assignment47();
		System.out.println("-------Program1-----------");
		assignment47.getFrequencyOfChar("varsha");
		System.out.println("-------Program2-----------");
		assignment47.getFrequencyOfWord("hi good morning hello good morning");
	}
}