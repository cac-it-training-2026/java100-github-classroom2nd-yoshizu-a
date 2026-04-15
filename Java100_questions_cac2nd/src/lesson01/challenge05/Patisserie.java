/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3 = reader.readLine();

		System.out.println("\nシトロン" + str1 + "個");
		System.out.println("ショコラ" + str2 + "個");
		System.out.println("ピスタージュ" + str3 + "個");

		int num4 = Integer.parseInt(str1);
		int num5 = Integer.parseInt(str2);
		int num6 = Integer.parseInt(str3);

		System.out.println("\n合計個数" + (num4 + num5 + num6) + "個");

		int num1 = 250;
		int num2 = 280;
		int num3 = 320;

		System.out.println("合計金額" + (num1 * num4 + num2 * num5 + num3 * num6) + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");
	}
}
