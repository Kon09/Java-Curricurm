package bean;

public class Bean {
//	動物名と学名のフィールドを作成
	private String animal_name, sName;
//	体長と速度のフィールドを作成
	private double animal_size;
	private int animal_speed;
	
//	動物名を編集、取得するメソッド
	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}
	
	public String getAnimal_name() {
		return this.animal_name;
	}
	
//	体長を編集、取得するメソッド
	public void setAnimal_size(double animal_size) {
		this.animal_size = animal_size;
	}
	
	public double getAnimal_size() {
		return this.animal_size;
	}
	
//	速度を編集、取得するメソッド
	public void setAnimal_speed(int animal_speed) {
		this.animal_speed = animal_speed;
	}
	
	public int getAnimal_speed() {
		return this.animal_speed;
	}
	
//	学名を編集、取得するメソッド
	public void setSName(String sName) {
		this.sName = sName;
	}
	public String getSName() {
		return this.sName;
	}

}
