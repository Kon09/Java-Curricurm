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
		
//		リストの中身を出力
		for(int i = 0, size = animal_list.size(); i < size; i++ ) {
			String[] data = animal_list.get(i);
			System.out.println("動物名：" + data[0]);
			System.out.println("体長：" + data[1] + "m");
			System.out.println("速度：" + data[2] + "km/h");
			switch(data[0]) {
			case "ライオン":
				b.setsName("バンテラ レオ");
				System.out.println("学名：" + b.getsName());
				break;
			case "ゾウ":
				b.setsName("ロキソドンタ・サイクロティス");
				System.out.println("学名：" + b.getsName());
				break;
			case "パンダ":
				b.setsName("アイルロポダ・メラノレウカ");
				System.out.println("学名：" + b.getsName());
				break;
			case "チンパンジー":
				b.setsName("パン・トゥログロディテス");
				System.out.println("学名：" + b.getsName());
				break;
			case "シマウマ":
				b.setsName("チャップマンシマウマ");
				System.out.println("学名：" + b.getsName());
				break;
			default:
				b.setsName("不明");
				System.out.println("学名：" + b.getsName());
				break;
			}
			System.out.println("");
			}
		}
		
	}
	
