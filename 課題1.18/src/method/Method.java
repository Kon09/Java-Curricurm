package method;

import java.util.Random;

public class Method {

	public static void main(String[] args) {
	// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
	hello();
	
	System.out.println(); //改行用
	// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
	sum(3);
	
	System.out.println(); //改行用
	// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	mul(2, 3);
	
	System.out.println(); //改行用
	// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
	//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
	mul(0.8, 0.3);
	
	System.out.println(); //改行用
	// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
	int[] d = randomPick(6);
	for(int b : d) {
		System.out.println(b);
	}
	
	System.out.println(); //改行用
	// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
	//     配列の要素の平均値を返すメソッド（関数）を作成してください。
	avg(5);

	}
	private static void hello() {
		System.out.println("Hello Java");
	}
	
	private static void sum(int i) {
		i += 1;
		System.out.println(i);
	}
	
	private static void mul(int i, int j) {
		System.out.println(i*j);
	}
	
	private static void mul(double i, double j) {
		System.out.println(i*j);
	}
	
	private static int[] randomPick(int i) {
		int[] a = new int[i];
		Random random = new Random();
		for(int b = 0; b < a.length; b++) {
			 a[b] = random.nextInt(100)+1;
		}
		return a;
	}
	
	private static void avg(int i) {
		int totalSum = 0;
		randomPick(i);
		for(int b = 0; b < randomPick(i).length; b++) {
			totalSum = totalSum + randomPick(i)[b];
		}
		System.out.println(totalSum / randomPick(i).length);
	}
	
}