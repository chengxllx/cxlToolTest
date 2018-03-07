package cxlToolTest.cxl.tool;

import java.util.Calendar;
import java.util.Date;


public class TimeTest {

	public static void main(String[] args) {
		 Calendar localCalendar = Calendar.getInstance();
		    localCalendar.setTime(new Date());
		    localCalendar.add(5, -2);
		   System.out.println(localCalendar.getTimeInMillis());
		    
	}
}
