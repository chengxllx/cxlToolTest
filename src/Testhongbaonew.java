import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Testhongbaonew {
	
	 public static void main(String[] args) {
		 
		 
	        for (int i = 0; i < 10; i++) {
	            List<BigDecimal> moneys = math(BigDecimal.valueOf(24000), 10000);
	            
	            if (moneys != null) {
	                BigDecimal b = new BigDecimal(0);
	                for (BigDecimal bigDecimal : moneys) {
	                    //System.out.print(bigDecimal + "元    ");
	                    b = b.add(bigDecimal);
	                }
	                System.out.print("   总额：" + b+"元 ");
	                System.out.println();
	            }
	        }
	    }

	 /**
	  * 最少0.01元，按照1元500积分，就是5积分
	  * @param mmm
	  * @param number
	  * @return    
	  * @author Xilincheng 
	  * @date 2017年12月26日  
	  */
	
	public static List<BigDecimal> math(BigDecimal mmm, int number) {
        if (mmm.doubleValue() < number * 0.6) {
            return null;
        }
        Random random = new Random();
        // 金钱，按分计算 10块等于 1000分
        int money = mmm.multiply(BigDecimal.valueOf(100)).intValue();
        // 随机数总额
        double count = 0;
        // 每人获得随机点数
        double[] arrRandom = new double[number];
        // 每人获得钱数
        List<BigDecimal> arrMoney = new ArrayList<BigDecimal>(number);
        // 循环人数 随机点
        for (int i = 0; i < arrRandom.length; i++) {
            int r = random.nextInt((number) * 99) + 1;
            count += r;
            arrRandom[i] = r;
        }
        // 计算每人拆红包获得金额
        int c = 0;
        for (int i = 0; i < arrRandom.length; i++) {
            // 每人获得随机数相加 计算每人占百分比
            Double x = new Double(arrRandom[i] / count);
            // 每人通过百分比获得金额
            int m = (int) Math.floor(x * money);
            // 如果获得 0 金额，则设置最小值 1分钱
            if (m == 0) {
                m = 1;
            }
            // 计算获得总额
            c += m;
            // 如果不是最后一个人则正常计算
            if (i < arrRandom.length - 1) {
                arrMoney.add(new BigDecimal(m).divide(new BigDecimal(100)));
            } else {
                // 如果是最后一个人，则把剩余的钱数给最后一个人
                arrMoney.add(new BigDecimal(money - c + m).divide(new BigDecimal(100)));
            }
        }
        // 随机打乱每人获得金额
        System.out.println(Collections.max(arrMoney));
        System.out.println(Collections.min(arrMoney));
        Collections.shuffle(arrMoney);
        return arrMoney;
    }


}
