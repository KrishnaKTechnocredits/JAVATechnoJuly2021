package amol_Pawar.assignment_51;

import java.util.Comparator;

public class BuilderTotalProjects implements Comparator<Builder>{
	@Override
	public int compare(Builder o1,Builder o2)
	{
		return o2.totalCompletedProject-o1.totalCompletedProject;
	}
	}
