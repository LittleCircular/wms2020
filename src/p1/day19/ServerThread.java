package p1.day19;

import java.io.BufferedReader;
import java.io.FileOutputStream;
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
			PrintStream score = new PrintStream(new FileOutputStream("E:/BJ_BaiLiBan/JavaSE/TeacherCodes/day19/score.txt",true));
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(s.getOutputStream());
			String name = br.readLine();
			int total = 0;
			Question q = new Question();
			q.updatalist();
			for(int i = 0; i < 10 ; i++){
				ps.println(q.getList().get(i).getMessage());
				String str = br.readLine();
				if("bye".equals(str)) break;
				if(str.equalsIgnoreCase(q.getList().get(i).getAnswer())) total = total + 10 ;
			}
			String ss = "ÓÃ»§£º" + name + "," + total + "·Ö";
			score.println(ss);
			ps.println(ss);
			System.out.println(ss);
			ps.close();
			br.close();
			s.close();
			score.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
