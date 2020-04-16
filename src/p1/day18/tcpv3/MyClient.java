package p1.day18.tcpv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient{

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1" , 2048);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader keys = new BufferedReader(
					new InputStreamReader(System.in));
			while(true) {
				System.out.print("请输入：");
				String word = keys.readLine();
				ps.println(word);
				if("bye".equalsIgnoreCase(word)){
					System.out.println("您已经离开了聊天室！");
					break;
				}
				String str = br.readLine();
				System.out.println(str);
			}
			ps.close();
			br.close();
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
