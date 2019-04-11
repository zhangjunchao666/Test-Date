import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author lenovo
 *
 */
public class TestDate {

	public static void main(String[] args) {

		// java1.8之前的时间方法
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = dateFormat.format(new Date());
		// 输出：2019-04-11 10:00:36
		System.out.println(format);

		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		String format2 = dateFormat2.format(new Date());
		// 2019-04-11
		System.out.println(format2);

		// java1.8时间方法
		String datetime = "20140212111012";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime ldt = LocalDateTime.parse(datetime, dtf);
		// 2014-02-12T11:10:12
		System.out.println(ldt);

		// DateTimeFormatter fb = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		// String now =
		// LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd
		// HH:mm:ss"));
		// 2019-04-11 11:35:35
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

		String format3 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(format3);
	}

}
