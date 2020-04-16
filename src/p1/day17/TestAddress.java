package p1.day17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestAddress {

	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName("192.168.4.21");
			System.out.println(ia);
			byte[] data = ia.getAddress();//1100 000-> 0011 1111+1 = 0100 0000
			for (byte b : data) {//����127�� - 256 ��������127�ľ���ԭ����
				System.out.println(b);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
