package p1.day18.udp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpRecv {

	public static void main(String[] args) {
		byte[] data = new byte[1024*1024];
		try {
			DatagramPacket dp = new DatagramPacket(data, data.length);
			DatagramSocket ds = new DatagramSocket(1999);
			System.out.println("等待发送！");
			ds.receive(dp);
			ds.close();
			System.out.println("接收完毕！");
			String str = new String(data,0,dp.getLength());
			FileOutputStream ps = new FileOutputStream("e:/1.zip");
			ps.write(data,0,dp.getLength());
			System.out.println(dp.getLength());
			ps.close();
			System.out.println(str);
			System.out.println(str.length());
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
