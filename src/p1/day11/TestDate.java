package p1.day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();//只能创建当前时间的日期对象
		System.out.println(date);
		//过去或者未来的日期需要使用Calendar类
		Calendar cal = Calendar.getInstance();
		cal.set(2008, 7,3); //月份是0-11代表
		Date date2 = cal.getTime();
		System.out.println(date2);
		//格式是固定的
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		String birthdate = "2000/01/01";
		Date date3 = sdf2.parse(birthdate);
		System.out.println(date3);
	}

	
}
