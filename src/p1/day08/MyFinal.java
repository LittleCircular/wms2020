package p1.day08;

public class MyFinal {

	final int x = 1; //ֱ�Ӹ�ֵ
	final int y;     //�����еĹ��췽���и�ֵ
	private final int z;
	static final int K = 1;//static final ���εĲ��ǳ�����ֻ����������ͬʱ��ֵ(static����)
	
	{
		z = 10;//�������и�ֵ
	}
	
	public MyFinal(){
		y = 1;
	}
	public MyFinal(int y){
		this.y = y;
	}
	
	public int getZ(){
		return z;
	}
//	public void setZ(){//final�����������װ��ֻ��get������û��set����
//		this.z = z;
//	}
	public final void test(){
		System.out.println("test");
	}
	
	
	
	public static void main(String[] args) {
		MyFinal mf1 = new MyFinal(2);
		MyFinal mf2 = new MyFinal(5);
		System.out.println(mf1.y);//final���ε����Բ��ǳ���
		System.out.println(mf2.y);
//		MyFinal.K = 10;
	}

}
