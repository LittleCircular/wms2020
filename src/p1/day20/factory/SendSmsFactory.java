package p1.day20.factory;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
