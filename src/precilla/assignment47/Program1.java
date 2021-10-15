package precilla.assignment47;
import java.util.HashMap;
import java.util.LinkedHashMap;

/*//find frequency of each char from string
i/p : "varsha"
o/p : v = 1
	  a = 2
	  r = 1
	  s = 1
	  h = 1*/
	  
public class Program1 {
	public static void main(String[] args) {
		String str="varsha";
		System.out.println("Input : "+str);
		HashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		for(int index=0;index<str.length();index++) {
			if(map.containsKey(str.charAt(index))) {
				int count=map.get(str.charAt(index));
				map.put(str.charAt(index), count+1);
			}else
				map.put(str.charAt(index), 1);		
		}
		System.out.println("Output : "+map);
	}
}
