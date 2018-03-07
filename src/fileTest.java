import java.io.File;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;




public class fileTest {

	public static void main(String[] args) throws Exception {
		BigDecimal a = new BigDecimal(1111116);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		System.out.println(a == null?"":df.format(Double.parseDouble(a.toString())));

	}
}
