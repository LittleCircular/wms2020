package p1.day09;

public class Gold implements Jin,Money{

	@Override
	public void buy() {//�ӿ��еķ��� Ĭ�϶��� public abstract��
		System.out.println("��");
	}
	
	@Override
	public void shine() {
		System.out.println("��");
	}
	
	
	public static void main(String[] args) {
		System.out.println(Jin.X);
		Jin jin = new Gold();//�ѻƽ𵱳ɽ�����ʹ��
		jin.shine();
		Money money = new Gold();//������ʹ��
		money.buy();
	}

}
