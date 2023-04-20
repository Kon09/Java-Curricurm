package introduction;

public class Main {

	public static void main(String[] args) {
//		Personをインスタンス化し、人物データの作成、出力
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		
//		クラスメソッドにて人数をカウント
		System.out.println("合計" + Person.getCount() + "人です");
		
	}

}