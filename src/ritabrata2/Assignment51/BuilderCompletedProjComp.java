package ritabrata2.Assignment51;

import java.util.Comparator;

public class BuilderCompletedProjComp implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {
		return o2.totalCompletedProject - o1.totalCompletedProject;
	}
}


