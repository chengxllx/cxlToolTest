package cxlToolTest.cxl.tool;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Filetrantest {
		public static void main(String[] args) throws Exception {
			File file =new File("D:/fileImport");
			if(!file.exists()){
				System.out.println("file is not exits");
			}
			
			/*List<String> dateList = new ArrayList<>();
			File fa[] = file.listFiles();
			for (int i = 0; i < fa.length; i++) {
				 File fs = fa[i];				
				System.out.println(fs.getParentFile());
				String filename="";
				filename=fs.getName().substring(0,fs.getName().lastIndexOf(".")); 
				System.out.println("filename------------"+filename);
				String date = "";
				date=filename.substring(filename.lastIndexOf("_")+1); 
				System.out.println("date-----"+date);
				String piname = filename.substring(0,filename.lastIndexOf("_"));
				System.out.println("piname-------"+piname);		
				
				if(piname.equals("draw")){
					System.out.println("fs.---------"+fs.getName());
					dateList.add(date);
				}
				 
			}
			String minDate="20170101";			
			if(dateList.size()>0){
				minDate = dateList.get(0);
				for (int i = 0; i < dateList.size(); i++) {					
					if(dateList.get(i).compareTo(minDate) <= 0){
						minDate = dateList.get(i);
					}
				}
			}*/
			//System.out.println("mindate-----"+minDate);
			
			renameTo("D:/MIMSLending/fileimport/2017-11-13/customer_20171027.dat");
		}
		
		
		public static void renameTo(String filePath){
			//读入之后修改文件的名称为：filename_ok.dat		
			File file = new File(filePath);
			File newfile=new File(file.getParentFile()+"\\"+file.getName().substring(0,file.getName().lastIndexOf("."))+"_ok"+".dat" ); 

			if(!file.exists()){
	            file.mkdirs();
	        }	
			
			if(newfile.exists()){
				newfile.delete();
			}
	        file.renameTo(newfile); 
		}
		 
}

