package p1.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient extends Thread{
	
	public void fun() {
		try {
			Socket s = new Socket("127.0.0.1" , 2048);//连接服务器
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(s.getOutputStream());
			BufferedReader keys = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入用户名");
			String name = keys.readLine();
			ps.println(name);
			new Thread(new TestClient(){
				@Override
				public void run() {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ps.println("bye");
					System.out.println("考试结束");
					try {
					} catch (Exception e) {
						e.printStackTrace();
					}finally{
						try {
							ps.close();
							br.close();
							keys.close();
							s.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.exit(-1);
					}
				}
			}).start();
			for(int i = 0; i < 10 ; i++) {
				for(int j = 0; j < 5 ; j++) {
					String str = br.readLine();
					System.out.println(str);
				}
				String word = keys.readLine();
				ps.println(word);
			}
			System.out.println("考试结束");
			ps.close();
			br.close();
			keys.close();
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TestClient t = new TestClient();
		t.fun();
	}
}
