package cxlToolTest.cxl.tool;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MonthTest {

	
	public static void main(String[] args) throws Exception {
		
		Calendar bizCal = Calendar.getInstance();  
		
		int month = bizCal.get(Calendar.MONTH);
		//System.out.println(month);
		
		List<String> parentList = new ArrayList<String>();

		
		for(int i = 0; i < 5; i++){
            parentList.add(String.valueOf(i));
        }
        System.out.println(parentList.toString()); 
        System.out.println();//output: 1, 2
        
        List<String> subList = parentList.subList(0, 2);
        for(String s : subList){
            System.out.println(s);//output: 1, 2
            System.out.println();//output: 1, 2
        }

}
}
