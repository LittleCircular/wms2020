package p1.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class LineReadWrite {//逐行储存从键盘输入的数据

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = null;
		try {
			ps = new PrintStream("e:/ps.txt");
			for (; ; ) {
				String line = br.readLine();
//				if(line == null) break;//通常情况下，用 == null退
				if("bye".equalsIgnoreCase(line)) break;
				ps.println(line);
			}
			br.close();
			ps.close();
			System.out.println("成功存入了数据");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}