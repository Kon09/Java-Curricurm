package process;

import java.util.Scanner;
import bean.Bean;
/*

名前を入力したら下記がコンソールに出力されるように作ってください


	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 ︎packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/

class SubProcess {
	public void disp() {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
		System.out.println("こんにちは 「" + line + "」 さん");
		System.out.println("ステータス");
	}
}

public class Process extends SubProcess {
	Bean b = new Bean();
	public Process(){
		System.out.println("名前を入力してください");	
	}
	
	public void disp() {
		super.disp();
		b.setHp();
		b.setMp();
		b.setAttack();
		b.setSpeed();
		b.setDefense();
		System.out.println("HP:" + b.getHp());
		System.out.println("MP:" + b.getMp());
		System.out.println("攻撃力:" + b.getAttack());
		System.out.println("素早さ:" + b.getSpeed());
		System.out.println("防御力:" + b.getDefense());
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
	}
		
	
}

	

