package p1.day05.exer;

import java.util.Random;

public class FaPai {
	

	public static void main(String[] args) {
		//做牌
		String[] s = new String[]{"红桃","方块","黑桃","梅花"};
		String[] s1 = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] pai = new String[52];
		//把花色和牌号装进牌数组里
		for (int i = 0; i <= 12; i++) {
			pai[i] = s[0] + s1[i];
		}

		for (int i = 13; i <= 25; i++) {
			pai[i] = s[1] + s1[i - 13];
		}

		for (int i = 26; i <= 38; i++) {
			pai[i] = s[2] + s1[i - 26];
		}

		for (int i = 39; i <= 51; i++) {
			pai[i] = s[3] + s1[i - 39];
		}
		
		//洗牌
		Random ran = new Random();
		int[] num = new int[52];
		for (int i = 0; i < num.length; i++) {
			num[i] = ran.nextInt(52);
			for (int j = 0; j < i; j++) {
				if(num[i] == num[j]){
					i--;
					break;
				}
			}
		}
		
		//发牌
//		System.out.print("玩家A:");
//		for (int i = 0; i <= 12; i++) {
//			System.out.print(pai[num[i]] + " ");
//		}
//		System.out.println();
//		System.out.print("玩家B:");
//		for (int i = 13; i <= 25; i++) {
//			System.out.print(pai[num[i]] + " ");
//		}
//		System.out.println();
//		System.out.print("玩家C:");
//		for (int i = 26; i <= 38; i++) {
//			System.out.print(pai[num[i]] + " ");
//		}
//		System.out.println();
//		System.out.print("玩家D:");
//		for (int i = 39; i <= 51; i++) {
//			System.out.print(pai[num[i]] + " ");
//		}
	}

}
