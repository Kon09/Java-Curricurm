package introduction;

public class Person {
//	インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	private static int count = 0;
	
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
	//	小数点以下の切り捨て処理を追加
	System.out.println("BMIは" + Math.floor(this.bmi()) + "です" );
	System.out.println("");
}

//人数計算メソッド
public static int getCount() {
	return count;
}


}
