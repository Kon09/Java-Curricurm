package introduction;
import vehicle.Car;
import vehicle.Bicycle;

public class Main {

	public static void main(String[] args) {
//		Personをインスタンス化し、人物データの作成、出力
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		
//		クラスフィールドにて人数をカウント(問3)
		System.out.println("合計" + Person.count + "人です");
		System.out.println("");
//		クラスメソッドにて人数をカウント(問6)
		Person.printCount();
		System.out.println("");
		
//		↓↓↓↓↓↓課題1_31↓↓↓↓↓↓
//		クラスのインスタンス化
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
//		ownerの設定
		car.setOwner(person1.name);
		bicycle.setOwner(person2.name);
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		System.out.println("");
		
//		乗り物を購入
		person1.buy(car);
		person2.buy(bicycle);
		
	}

}