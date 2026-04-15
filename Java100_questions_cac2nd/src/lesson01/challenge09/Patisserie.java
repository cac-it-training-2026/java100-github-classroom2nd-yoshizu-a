/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.IOException;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計      \\2470");

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

		System.out.println("\n内訳");
		System.out.println("シトロン     \\1250・・・" + numcito + "% ");
		System.out.println("ショコラ      \\420・・・" + numchoco + "%");
		System.out.println("ピスタージュ  \\800・・・" + numpis + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました!");
		System.out.println("\nシトロンの味・・・" + numcito + "%");
		System.out.println("ショコラの味・・・" + numchoco + "%");
		System.out.println("ピスタージュの味・・・" + numpis + "%");

		System.out.println("\nが楽しめます!");

		double kosuu = 9;
		double dav = total / kosuu;
		int iav = (int) (dav);
		int nedan = (iav / 10) * 10;

		System.out.println("\n値段は\\" + nedan + "です。");

	}
}
