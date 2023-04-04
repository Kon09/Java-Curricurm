package execution;
import process.Process;

public class Execution {

	public static void main(String[] args) {
		//実行用プログラムを記載
		Process pro = new Process();
		pro.hello("日本", "寿司", "和食");
	}
}