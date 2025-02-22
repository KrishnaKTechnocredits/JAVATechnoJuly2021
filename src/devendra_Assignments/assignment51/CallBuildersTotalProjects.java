package devendra_Assignments.assignment51;

import java.util.Comparator;

public class CallBuildersTotalProjects implements Comparator<CallBuilder> {

	@Override
	public int compare(CallBuilder cb1, CallBuilder cb2) {

		return cb1.totalCompleteProject - cb2.totalCompleteProject;
	}
}
