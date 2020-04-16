package p1.day20.factory;

public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
