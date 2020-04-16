package p1.day05.exer.fapai;

//import java.util.Random;

public class FaPai1 {
	static Pai[] pai;
	public static void main(String[] args) {
		//Random ran = new Random();
		pai = new Pai[6];
		
		System.out.print("玩家A:");
		for (int i = 0; i <= 12; i++) {
			System.out.print(pai[i] + " ");
		}
		System.out.println();
		System.out.print("玩家B:");
		for (int i = 13; i <= 25; i++) {
			System.out.print(pai[i] + " ");
		}
		System.out.println();
		System.out.print("玩家C:");
		for (int i = 26; i <= 38; i++) {
			System.out.print(pai[i] + " ");
		}
		System.out.println();
		System.out.print("玩家D:");
		for (int i = 39; i <= 51; i++) {
			System.out.print(pai[i] + " ");
		}
	}

}
