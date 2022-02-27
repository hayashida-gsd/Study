package Sample;

import java.util.ArrayList;
import java.util.Random;

public class PackageSample {
	public static void main(String[] args) {

		// 乱数の表示
		Random random = new Random();
		System.out.println("乱数の表示");
		System.out.println(random.nextInt());

		// 乱数の格納
		// 10個の乱数を格納する配列（リスト）
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(random.nextInt());
		}

		System.out.println("配列に格納した乱数の表示");
		for(int i : list) {
			System.out.println(i);
		}
	}
}