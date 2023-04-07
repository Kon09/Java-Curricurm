package bean;
import java.util.Random;

public class Bean {
	Random r = new Random();
	private int hp, mp, attack, speed, defense;
	
	public void setHp() {
		this.hp = r.nextInt(999)+1;
	}
	
	public void setMp() {
		this.mp = r.nextInt(999)+1;
	}
	
	public void setAttack() {
		this.attack = r.nextInt(999)+1;
	}
	
	public void setSpeed() {
		this.speed = r.nextInt(999)+1;
	}
	
	public void setDefense() {
		this.defense = r.nextInt(999)+1;
	}
	
	public int getHp() {
		return this.hp;
	}

	public int getMp() {
		return this.mp;
	}

	public int getAttack() {
		return this.attack;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getDefense() {
		return this.defense;
	}
}
