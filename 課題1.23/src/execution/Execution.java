package execution;
import data.Data;

public class Execution {

	public static void main(String[] args) {
		/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
		
		Data d = new Data();
		d.setAnimal("ライオン");
		d.setSize(2.1);
		d.setSpeed(80);
		System.out.println("動物名：" + d.getAnimal());
		System.out.println("体長：" + d.getSize() + "m");
		System.out.println("速度：" + d.getSpeed() + "km/h");
	}

}
