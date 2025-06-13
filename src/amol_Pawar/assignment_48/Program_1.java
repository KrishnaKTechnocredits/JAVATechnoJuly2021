/*Program 1: Create a system to generate AadharNumber with rules discussed in class.*/
package amol_Pawar.assignment_48;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Program_1 {

	String pancard="HS";
	HashMap<String, String> m=new HashMap();
	
	void setAddharNum(String pancard)
	{
		this.pancard=pancard;
		getAddharCard();
	}
	void getAddharCard()
	{
		Date d=new Date();
		DateFormat dt=new SimpleDateFormat("_ddmmyyyymmss");
		String dateformate= dt.format(d);
		
		if(!m.containsKey(pancard))
		{
			m.put(pancard, pancard+dateformate);
		}
		System.out.println(m.get(pancard));
	}
	public static void main(String[] args) {
		Program_1 program_1=new Program_1();
		program_1.setAddharNum("CLZPP023G");
		program_1.setAddharNum("CLZPP023G");
		program_1.setAddharNum("CLZPP023G1");

	}
	
}
