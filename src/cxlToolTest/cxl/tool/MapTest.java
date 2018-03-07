package cxlToolTest.cxl.tool;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
		public static void main(String[] args) throws Exception {
			
			Map<Long, BigDecimal> monthMap = new HashMap<Long, BigDecimal>();	
			monthMap.put(101L, new BigDecimal(10));
			System.out.println("---------1-:"+monthMap.get(101L));
			monthMap.put(101L, new BigDecimal(10).add(new BigDecimal(20)));
			System.out.println("---------1-:"+monthMap.get(101L));
			
	}
}
