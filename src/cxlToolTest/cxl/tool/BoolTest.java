package cxlToolTest.cxl.tool;

/**
 * 两个bool 类型如何判断是否相同
 * @author xilincheng
 *
 */
public class BoolTest {
	public static void main(String[] args) throws Exception {
		
		boolean a = true;
		boolean b = true;
		//如果两个boolean不相同 
		if(!a != !b){
			System.out.println("两个不相同");
		}else{
			System.out.println("两个相同");
		}
		//如果两个boolean相同 
		if(!a == !b){
			System.out.println("两个相同");
		}else{
			System.out.println("两个不相同");
		}

	}
}
