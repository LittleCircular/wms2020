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
	 * @Description: 栈溢出
	 * @param @param num 参数
	 * @return void 返回类型
	 * @throws
	 */
	public void callSelft(int num){
		System.out.println(num++);
		callSelft(num);
	}
	
	/**
	 * @Title: heapOutofM
	 * @Description: 堆溢出
	 * @param  参数
	 * @return void 返回类型
	 * @throws
	 */
	public void heapOutofM(){
		List<String> list = new ArrayList<>();
		for(int i = 0; ;i++){
			list.add(new String(new byte[$100MB]));
		}
	}
}
