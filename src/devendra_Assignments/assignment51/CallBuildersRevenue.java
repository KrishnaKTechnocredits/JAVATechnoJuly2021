package devendra_Assignments.assignment51;
/*Assignment - 51*/
import java.util.Comparator;

public class CallBuildersRevenue implements Comparator<CallBuilder> {

	@Override
	public int compare(CallBuilder cb1, CallBuilder cb2) {

		return cb1.revenue - cb2.revenue;
	}

}
