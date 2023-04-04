package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Process {
	//処理用のプログラム
	LocalDateTime ldt = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
	String country, food, genre;
	String now = ldt.format(dtf);
	
	public void hello(String country, String food, String genre) {
		this.country = country;
		this.food = food;
		this.genre = genre;
		System.out.println("こんにちは！ここは" + country + "です!");
		System.out.println("この" + food + "はうまい");
		System.out.println(food + "は" + genre + "です");
		System.out.println("今の現在日時は" + now + "です");
	}

}
