package cxlToolTest.cxl.tool;

public class NullTest {
		public static void main(String[] args) throws Exception {
			
		String aString  = null;
		String bString = aString+" "+"12";
		System.out.println(bString);
		System.out.println("----------------------------");
		
		System.out.println((aString==null?"":aString)+"12");
		
		String[] pic = "201,301,402,101,102".split(",");
		String pictureRecording="";
		for (int i = 0; i < pic.length; i++) {
			
			if(pic[i].substring(0, 1).equals("1")){
				pictureRecording += pic[i].toString()+",";
			}
			
		}
		System.out.println(pictureRecording);
	}
}
