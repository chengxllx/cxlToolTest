import java.math.BigDecimal;
import java.util.List;

public class subtest {
	public static void main(String[] args) {
		String one = "0200301210000000039594";
		String two = "1819101102100002629600";
		if(one.startsWith("02")) {
			one =one.substring(7);
		}
		
		if(two.startsWith("18191")) {
			two =two.substring(7);
		}
		System.out.println(one+"   "+two);
    }
}
