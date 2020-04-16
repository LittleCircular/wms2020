package p1.day18.tcpv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(2048);
			System.out.println("start Server");
			Socket s = ss.accept();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(s.getOutputStream());
			while(true){
				String str = br.readLine();
				if("bye".equalsIgnoreCase(str)){
					System.out.println("服务器断开连接！");
					break;
				}
				System.out.println("for Client:" + str);
				ps.println("form Server:" + str);
			}
			ps.close();
			br.close();
			s.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
