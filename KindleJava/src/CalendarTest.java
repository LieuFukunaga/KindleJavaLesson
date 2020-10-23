import java.util.Calendar;

public class CalendarTest {
	
	public static void printCal(Calendar cal, String[] months, String[] days) {
		System.out.println("What is the date today? => It's " + months[cal.get(Calendar.MONTH)] + " " + cal.get(Calendar.DATE) + ", " + cal.get(Calendar.YEAR) + "." );
//		System.out.println("Calendar.MONTH => " + cal.get(Calendar.MONTH) + 1);        // 1月：０
		switch (cal.get(Calendar.ERA)) {
		case 0:
			System.out.println("Before Centrury");
			break;
		case 1:
		    System.out.println("After Centrury");
			break;
		default:
			System.out.println("Invalid Value");
			break;
		}
		ansCal(cal, days);
		setCal(cal, 2021);
		setCal(cal, 3333, 11, 22);
		Calendar cal2 = Calendar.getInstance();
		System.out.println("cal2 => " + getCalString(cal2));
		compareCal(cal, cal2);
		cal.add(Calendar.MONTH, 1);
		setInvalidCal(cal, 2020, 1, 100, true);
//		setInvalidCal(cal, -1, 1, 1, true);         // => 2/2/1
//		setInvalidCal(cal, 2020, -1, 1, true);
		setInvalidCal(cal, 2020, 1, 100, false);
		cal.clear();
		System.out.println("Clear a Calendar and set a default date=> " + getCalString(cal));
	}
	
	
	// 目的：出力の切り出し
	public static void ansCal(Calendar cal, String[] days) {
		System.out.println("What day of year is it today? => " + cal.get(Calendar.DAY_OF_YEAR) + ".");
		System.out.println("What day of month is it today? => " + cal.get(Calendar.DAY_OF_MONTH) + ".");
		System.out.println("What day is it today? => " + days[cal.get(Calendar.DAY_OF_WEEK) - 1]  + ".");
		System.out.println("What day of week in month is it today? => " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) + ".");
		System.out.println("What week of year is it today? => " + cal.get(Calendar.WEEK_OF_YEAR) + ".");
		System.out.println("What week of month is it today? => " + cal.get(Calendar.WEEK_OF_MONTH) + ".");
		System.out.println("Print YEAR without constance => " + cal.get(1) );
		
	}

	
	// 目的：書式設定
	public static String getCalString(Calendar tmpCal) {
		// getメソッドの返り値：int型
		return String.valueOf(tmpCal.get(Calendar.YEAR) + "/" + String.valueOf(tmpCal.get(Calendar.MONTH) + 1) + "/" + String.valueOf(tmpCal.get(Calendar.DATE)));
	}
	
	
	// 目的：日付設定（年のみ）
	public static void setCal(Calendar cal, int year) {
		cal.set(Calendar.YEAR, year);
		System.out.println("set YEAR => " + getCalString(cal));
	}
	
	
	// 目的：日付設定（年、月、日） 
	public static void setCal(Calendar cal, int year, int month, int date) {
		cal.set(year, month, date);;
		System.out.println("set YEAR, MONTH, DATE => " + getCalString(cal));
	}
	
	
	// 目的：日付を比較し結果を出力
	public static void compareCal(Calendar cal, Calendar cal2) {
		boolean compCal;
		compCal = cal.equals(cal2);
		System.out.println("Is cal equal to cal2? => " + compCal);
		compCal = cal.before(cal2);
		System.out.println("Is cal before cal2? => " + compCal);
		compCal = cal.after(cal2);
		System.out.println("Is cal after cal2? => " + compCal);
	}
	
	
	// 目的：無効な日付の設定、出力
	public static void setInvalidCal(Calendar cal, int year, int month, int date,  boolean lenient) {
//		if (lenient = true) {
		if (lenient) {
			cal.setLenient(lenient);
			cal.set(year, month, date);
			System.out.println("setLenient / true => " + getCalString(cal));			
		} else {
			cal.setLenient(lenient);
			cal.set(year, month, date);
			try {
				System.out.println("setLenient / false => " + getCalString(cal));
			} catch (Exception e) {
				System.out.println("An error occurred because an invalid date is set without rigorous interpretation.");
			}
			
		}
	}

}
