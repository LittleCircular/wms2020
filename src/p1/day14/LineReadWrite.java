package p1.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class LineReadWrite {//���д���Ӽ������������

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = null;
		try {
			ps = new PrintStream("e:/ps.txt");
			for (; ; ) {
				String line = br.readLine();
//				if(line == null) break;//ͨ������£��� == null��
				if("bye".equalsIgnoreCase(line)) break;
				ps.println(line);
			}
			br.close();
			ps.close();
			System.out.println("�ɹ�����������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}