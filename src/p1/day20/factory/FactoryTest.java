package p1.day20.factory;

public class FactoryTest {
	
	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
	
}
