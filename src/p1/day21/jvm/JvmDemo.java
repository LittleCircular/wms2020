package p1.day21.jvm;

import java.util.ArrayList;
import java.util.List;

public class JvmDemo {

	public static final int $100MB = 1024 * 1024 * 100;
	
	public static void main(String[] args) {
//		new JvmDemo().callSelft(1);
		new JvmDemo().heapOutofM();
	}
	
	/**
	 * @Title: callSelft
	 * @Description: ջ���
	 * @param @param num ����
	 * @return void ��������
	 * @throws
	 */
	public void callSelft(int num){
		System.out.println(num++);
		callSelft(num);
	}
	
	/**
	 * @Title: heapOutofM
	 * @Description: �����
	 * @param  ����
	 * @return void ��������
	 * @throws
	 */
	public void heapOutofM(){
		List<String> list = new ArrayList<>();
		for(int i = 0; ;i++){
			list.add(new String(new byte[$100MB]));
		}
	}
}
