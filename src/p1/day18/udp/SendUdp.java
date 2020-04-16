package p1.day18.udp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.*;

public class SendUdp {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			FileInputStream fis = new FileInputStream("e:/day.png");
			byte[] bytes = new byte[1024 * 60];
			while (true) {
				int res = fis.read(bytes);
				if (res == -1) break;
				DatagramPacket dp = new DatagramPacket(bytes, bytes.length, 
						InetAddress.getByName("192.168.4.1"), 1999);
				ds = new DatagramSocket();
				ds.send(dp);
			}
			fis.close();
			ds.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}