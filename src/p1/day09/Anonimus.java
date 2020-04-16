package p1.day09;

public class Anonimus {

	public static void main(String[] args) {
		Jin jin = new Jin() {
			
			@Override
			public void shine() {
				System.out.println("·¢¹â");
			}
		};
		jin.shine();
	}

}
