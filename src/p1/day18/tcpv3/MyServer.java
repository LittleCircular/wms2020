package p1.day18.tcpv3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		boolean flag = true;
		try {
			ServerSocket ss = new ServerSocket(2048);
			System.out.println("服务器已启动");
			int num = 0;
			while(flag) {
				Socket s = ss.accept();
				Thread th = new ServerThread(s);
				th.setName("： " + num + "  ：");
				th.start();
				num++;
			}
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
			flag = false;
		}
	}

}
