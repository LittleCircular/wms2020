package p1.day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();//ֻ�ܴ�����ǰʱ������ڶ���
		System.out.println(date);
		//��ȥ����δ����������Ҫʹ��Calendar��
		Calendar cal = Calendar.getInstance();
		cal.set(2008, 7,3); //�·���0-11����
		Date date2 = cal.getTime();
		System.out.println(date2);
		//��ʽ�ǹ̶���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		String birthdate = "2000/01/01";
		Date date3 = sdf2.parse(birthdate);
		System.out.println(date3);
	}

	
}
