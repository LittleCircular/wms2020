package p1.day19;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public static void main(String[] args) {
		boolean flag = true;
		try {
			ServerSocket ss = new ServerSocket(2048);
			System.out.println("µÈ´ý¿¼ÊÔ...");
			while(flag) {
				Socket s = ss.accept();
				Thread th = new ServerThread(s);
				th.start();
			}
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
			flag = false;
		}
	}
	
}
