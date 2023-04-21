package introduction;

public class Person {
//	インスタンスフィールドを定義
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;
	
//	コンストラクタを定義しインスタンスフィールドに値をセット
Person(String firstName, int age, double height, double weight){
	this.firstName = firstName;
	this.age = age;
	this.height = height;
	this.weight = weight;
	Person.count++;
}

//	コンストラクタを追加定義(オーバーロード)
Person(String firstName, String lastName, int age, double height, double weight){
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.height = height;
	this.weight = weight;
	Person.count++;
}

//	BMI計算メソッド
public double bmi() {
	 double BMI;
	 BMI = this.weight/Math.pow(this.height, 2);
	 return BMI;
}

//	fullName()メソッドの定義
public String fullName() {
	return this.firstName + this.lastName;
}

//	オブジェクト表示メソッド
public void print() {
	System.out.println("私の名前は" + this.fullName() + "です");
	System.out.println("年は" + this.age + "才です");
	//	小数点以下の切り捨て処理
	System.out.println("BMIは" + Math.floor(this.bmi()) + "です" );
	System.out.println("");
}

//人数出力クラスメソッド
public static void printCount() {
System.out.println("合計" + Person.count + "人です");
}


}
