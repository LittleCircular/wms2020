package p1.day18.tcpv3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread extends Thread{

	private Socket s;
	
	public ServerThread(Socket s){
		this.s = s;
	}
	
	@Override
	public void run() {
		try{
			String name = s.getInetAddress().toString() + Thread.currentThread().getName();
			System.out.println(name + "已上线！");
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(s.getOutputStream());
			String str  = "1";
			while(true){
				
				str = br.readLine();
				if(str == null) break;
				if("bye".equalsIgnoreCase(str)){
					System.out.println(name + "已下线！");
					break;
				}
				System.out.println(name + "\n" + str);
				ps.println(name + "for" + str);
			}
			ps.close();
			br.close();
			s.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
