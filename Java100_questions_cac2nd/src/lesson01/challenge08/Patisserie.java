/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.IOException;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。");

		System.out.println("\nシトロン     \\250・・・残り25個");
		System.out.println("ショコラ     \\280・・・残り28個");
		System.out.println("ピスタージュ \\320・・・残り27個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計     \\2470");

		System.out.println("\n内訳");

		double cito = 1250;
		double choco = 420;
		double pis = 800;
		double total = 2470;

		double citop = cito / total * 100;
		double chocop = choco / total * 100;
		double pisp = pis / total * 100;

		int numcito = (int) (citop);
		int numchoco = (int) (chocop);
		int numpis = (int) (pisp);

		System.out.println("シトロン      \\1250・・・" + numcito + "％");
		System.out.println("ショコラ      \\ 420・・・" + numchoco + "％");
		System.out.println("ピスタージュ  \\ 800・・・" + numpis + "％");

	}
}
