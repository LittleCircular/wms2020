package p1.day05.exer.fapai;

import java.util.Random;

public class Pai {

	public int[] fun(){
		Random ran = new Random();
		int[] pai = new int[52];
		for (int i = 0; i < pai.length; i++) {
			pai[i] = ran.nextInt(52) + 1;
			for (int j = 0; j < i; j++) {
				if(pai[i] == pai[j]){
					i--;
					break;
				}
			}
		}
		return pai;
	}

}
