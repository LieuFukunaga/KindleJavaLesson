import java.util.Date;

public class DateTimeTest {

	public static void printDt() {
		Date dt = new Date();
		Date dt2 = (Date)dt.clone();
		System.out.println("origin : " + dt.toString());
		System.out.println("clone : " + dt2.toString());
	}
	
	public static void compareDt() {
		Date dt = new Date();
		Date dt2 = (Date)dt.clone();
		System.out.println("Clone is after dt? => " +  dt2.after(dt));
		System.out.println("Clone is before dt? => " +  dt2.before(dt));
		System.out.println("Clone is equal to dt? => " +  dt2.equals(dt));
		System.out.println("Comparison between clone and dt : " +  dt2.compareTo(dt));
	}
	
	
}
