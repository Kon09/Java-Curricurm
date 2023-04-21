package introduction;
import vehicle.Car;
import vehicle.Bicycle;

public class Person {
//	インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;
	
//	コンストラクタを定義しインスタンスフィールドに値をセット
Person(String name, int age, double height, double weight){
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
	count++;
}

//	BMI計算メソッド
public double bmi() {
	 double BMI;
	 BMI = this.weight/Math.pow(this.height, 2);
	 return BMI;
}

//	オブジェクト表示メソッド
public void print() {
	System.out.println("私の名前は" + this.name + "です");
	System.out.println("年は" + this.age + "才です");
	System.out.println("BMIは" + Math.floor(this.bmi()) + "です" );
	System.out.println("");
}

//	人数出力クラスメソッド
public static void printCount() {
	System.out.println("合計" + Person.count + "人です");
}

//	↓↓↓↓↓↓課題1_31↓↓↓↓↓↓
//　クラスのインスタンス化
Car car = new Car();
Bicycle bicycle = new Bicycle();

//	インスタンスメソッド「buy」の作成
public void buy(Car car) {
	car.setOwner(this.name);
	System.out.println(car.getOwner() + "が購入しました");
}

public void buy(Bicycle bicycle) {
	bicycle.setOwner(this.name);
	System.out.println(bicycle.getOwner() + "が購入しました");
}

}
