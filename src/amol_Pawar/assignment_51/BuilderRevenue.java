package amol_Pawar.assignment_51;

import java.util.Comparator;

public class BuilderRevenue implements Comparator<Builder> {
	
	@Override
	public int compare(Builder o1,Builder o2)
	{
		return o1.Revenue-o2.Revenue;
		
	}

	

}
