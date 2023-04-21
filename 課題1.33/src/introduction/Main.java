package introduction;

public class Main {

	public static void main(String[] args) {
//		Personをインスタンス化し、人物データの作成、出力
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();
		
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();
		
//		クラスメソッドにて人数をカウント(問6)
		Person.printCount();
		System.out.println("");
		
	}

}