/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("本日のおすすめ商品です。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3 = reader.readLine();

		System.out.println("");
		System.out.println("シトロン" + str1 + "個");
		System.out.println("ショコラ" + str2 + "個");
		System.out.println("ピスタージュ" + str3 + "個");

		int num4 = Integer.parseInt(str1);
		int num5 = Integer.parseInt(str2);
		int num6 = Integer.parseInt(str3);

		System.out.println("");
		System.out.println("シトロン    \\250・・・残り" + (30 - num4) + "個");
		System.out.println("ショコラ    \\280・・・残り" + (30 - num5) + "個");
		System.out.println("ピスタージュ\\320・・・残り " + (30 - num6) + "個");

	}
}
