package process;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import bean.Bean;

public class Process {
//	コンストラクタの作成
	public Process(){
		System.out.println("コンソールに文字を入力してください");
	}
	
//	インスタンス化
	List<String[]> animal_list = new ArrayList<String[]> ();
	Bean b = new Bean();
	
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
		
//		出力処理メソッド
		for(int i = 0, size = animal_list.size(); i < size; i++ ) {
//			リストの中身を配列に格納
			String[] data = animal_list.get(i);
			
//			体長と速度を各数値型に変換
			double sizeDouble = Double.parseDouble(data[1]);
			int speedInt = Integer.parseInt(data[2]);
			
//			動物名、体長、速度をsetterとgetterで管理して出力
			b.setAnimal_name(data[0]);
			System.out.println("動物名：" + b.getAnimal_name());
			b.setAnimal_size(sizeDouble);
			System.out.println("体長：" + b.getAnimal_size() + "m");
			b.setAnimal_speed(speedInt);
			System.out.println("速度：" + b.getAnimal_speed() + "km/h");
			
//			学名を条件分岐にて出力
			switch(data[0]) {
			case "ライオン":
				b.setSName("バンテラ レオ");
				System.out.println("学名：" + b.getSName());
				break;
			case "ゾウ":
				b.setSName("ロキソドンタ・サイクロティス");
				System.out.println("学名：" + b.getSName());
				break;
			case "パンダ":
				b.setSName("アイルロポダ・メラノレウカ");
				System.out.println("学名：" + b.getSName());
				break;
			case "チンパンジー":
				b.setSName("パン・トゥログロディテス");
				System.out.println("学名：" + b.getSName());
				break;
			case "シマウマ":
				b.setSName("チャップマンシマウマ");
				System.out.println("学名：" + b.getSName());
				break;
			default:
				b.setSName("不明");
				System.out.println("学名：" + b.getSName());
				break;
			}
			System.out.println("");
			}
		}
		
	}
	
