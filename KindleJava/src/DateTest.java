import java.util.Date;
import java.util.Calendar;

public class DateTest {
	
	// Dateクラス用
	public static void printDt(Date dt) {
		Date dt2 = (Date)dt.clone();
		System.out.println("origin : " + dt.toString());
		System.out.println("clone : " + dt2.toString());
	}
	
	public static void compareDt(Date dt) {
		Date dt2 = (Date)dt.clone();
		System.out.println("Is dt2 after dt? => " +  dt2.after(dt));
		System.out.println("Is dt2 before dt? => " +  dt2.before(dt));
		System.out.println("Is dt2 equal to dt? => " +  dt2.equals(dt));
		System.out.println("Comparison between clone and dt : " +  dt2.compareTo(dt));
	}
	
	
	
	
}
