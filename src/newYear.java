import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class newYear {
	
	public static void main(String[] args) throws java.text.ParseException {  
	    try {  
	        dayOfYear("2002-01-01");  
	    } catch (ParseException e) {  
	        e.printStackTrace();  
	    }  
	}  

	private static void dayOfYear(String dateStart) throws ParseException, java.text.ParseException{  
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH-dd");  
	    Date date = sdf.parse(dateStart);  
	    Calendar calendar = Calendar.getInstance();   
	    calendar.setTime(date);   
	    int y = calendar.get(Calendar.DAY_OF_YEAR);  
	    System.out.println("Day of year:" + y + " of " + date);  

	}  

}

