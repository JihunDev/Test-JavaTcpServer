import java.text.SimpleDateFormat;
import java.util.Date;

public class timeChk {
	public static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
