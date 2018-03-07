package cxlToolTest.cxl.tool;

import java.util.ArrayList;
import java.util.List;


public class SubListTest {

	private static final int BATCH_SIZE = 2;
	
	public static void main(String[] args) throws Exception {
			
			List<String> parentList = new ArrayList<String>();
			
			for(int i = 0; i < 2; i++){
	            parentList.add(String.valueOf(i));
	        }
	        System.out.println(parentList.toString()); 
	        System.out.println();//output: 1, 2
	        
	       /* List<String> subList = parentList.subList(1, 1);
	        for(String s : subList){
	            System.out.println(s);//output: 1, 2
	            System.out.println();//output: 1, 2
	        }*/
	        
	        int index = 0;
			while ((index + 1) * BATCH_SIZE < parentList.size()) {
			System.out.println(	parentList.subList(index * BATCH_SIZE, (index + 1) * BATCH_SIZE ).toString());
				index ++;
			}
			
			System.out.println(parentList.subList(index * BATCH_SIZE, parentList.size() ).toString());
			

	}
}
