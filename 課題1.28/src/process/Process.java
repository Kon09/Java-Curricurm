package process;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Process {
//	コンストラクタの作成
	public Process(){
		System.out.println("コンソールに文字を入力してください");
	}
	List<String[]> animal_list = new ArrayList<String[]> ();
	
//	コンソールに入力、入力した内容を出力するメソッドの作成
	public void disp() {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
//		入力した内容をカンマ区切り
		String[] animal = line.split(",");
//		カンマで区切ったものをコロン区切りしてリストに入れる
		for(String str: animal ) {
			animal_list.add(str.split(":"));
		}
		
//		リストの中身を出力
		for(int i = 0, size = animal_list.size(); i < size; i++ ) {
			String[] data = animal_list.get(i);
			System.out.println("動物名：" + data[0]);
			System.out.println("体長：" + data[1] + "m");
			System.out.println("速度：" + data[2] + "km/h");
			switch(data[0]) {
			case "ライオン":
				System.out.println("学名：バンテラ　レオ");
				break;
			case "ゾウ":
				System.out.println("学名：ロキソドンタ・サイクロティス");
				break;
			case "パンダ":
				System.out.println("学名：アイルロポダ・メラノレウカ");
				break;
			case "チンパンジー":
				System.out.println("学名：パン・トゥログロディテス");
				break;
			case "シマウマ":
				System.out.println("学名：チャップマンシマウマ");
				break;
			default:
				System.out.println("学名：不明");
				break;
			}
			System.out.println("");
			}
		}
		
	}
	
