package process;
import bean.Bean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Process {
//	コンストラクタの作成
	public Process(){
		System.out.println("数字を入力してください");
	}
	
//	クラスのインスタンス化
	Bean b = new Bean();
	
//	コンソール入力内容から出力までのメソッド
	public void disp() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		複数行の入力をint型に変換し、リストに格納する処理
		while (scan.hasNextLine()) {
		    String str = scan.nextLine();
		    if (str == "") {
		    	break;
		    }
		    list.add(Integer.parseInt(str));
		}
		
//		ソートに関する入力内容を受け取り、リスト内の数値をソート順にする処理
		System.out.println("昇順or降順？");
		Scanner sortWord = new Scanner(System.in);
		String sort = sortWord.nextLine();
		
		switch(sort) {
		case "昇順":
			Collections.sort(list);
			break;
		case "降順":
			Collections.sort(list, Collections.reverseOrder());
			break;
		}
		scan.close();
		sortWord.close();
				
		for(int i = 0, size = list.size(); i < size; i++) {
			Integer intId = list.get(i);
//			getPreData内のデータをコロン区切りで配列に格納
			String[] str = b.getPreData(intId).split(":");
//			各項目の出力
			b.setPrefecture(str[0]);
			System.out.println("都道府県名：" + b.getPrefecture());
			
			b.setPreCapital(str[1]);
			System.out.println("県庁所在地：" + b.getCapital());
			Double sizeDouble = Double.parseDouble(str[2]);
			
			b.setPreSize(sizeDouble);
			System.out.println("面積：" + b.getPreSize() + "km2");
			
			System.out.println("");
		}
		

		
	}
	
}
