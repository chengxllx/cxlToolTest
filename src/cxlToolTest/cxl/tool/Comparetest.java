package cxlToolTest.cxl.tool;

import java.math.BigDecimal;


public class Comparetest {
	public static void main(String[] args) {
		
			BigDecimal suggestAmount ;
			suggestAmount = new BigDecimal("1.23");
			if (suggestAmount.compareTo(BigDecimal.ZERO) <= 0) {
				suggestAmount = BigDecimal.ZERO;
				System.out.println(suggestAmount+"xiaoyu0");
			}
			
			if ((BigDecimal.ZERO).compareTo(suggestAmount) <= 0) {
				suggestAmount = BigDecimal.ZERO;
				System.out.println(suggestAmount+"xiaoyu0---------");
			}
			
			if (BigDecimal.ZERO.compareTo(suggestAmount) <= 0) {
				suggestAmount = BigDecimal.ZERO;
				System.out.println(suggestAmount+"xiaoyu0---=====------");
			}
			System.out.println(suggestAmount+"dayu0");
	}
}
