package bean;

public class Bean {
//	県名、県庁所在地、面積を格納するフィールドを作成
	private String prefecture;
	private String preCapital;
	private double preSize;
	
//	各県のデータを格納した配列を作成。
	private String[] preData = {
			"北海道:札幌市:83424",
			"青森県:青森市:9646",
			"岩手県:盛岡市:15275",
			"宮城県:仙台市:7282",
			"秋田県:秋田市:11638",
			"山形県:山形市:9323",
			"福島県:福島市:13784",
			"茨城県:水戸市:6097",
			"栃木県:宇都宮市:6408",
			"群馬県:前橋市:6362",
			"埼玉県:さいたま市:3798"
	};
	
//	privateな配列から値を取得するgetterメソッド
	public String getPreData(int id) {
		return this.preData[id];
	}
	
//	privateな変数に値を格納、取得するメソッド
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	public String getPrefecture() {
		return this.prefecture;
	}
	
	public void setPreCapital(String preCapital) {
		this.preCapital = preCapital;
	}
	public String getCapital() {
		return this.preCapital;
	}
	
	public void setPreSize(double preSize) {
		this.preSize = preSize;
	}
	public double getPreSize() {
		return this.preSize;
	}
}
