package _05_애인과결투게임;

public class UserAndLover {
	private int  hp;
	private String name;
	private int damage;
	private int ran_num;
	public int getRan_num() {
		return ran_num;
	}

	public void setRan_num(int ran_num) {
		this.ran_num = ran_num;
	}

	enum skill_name{
		공격1,공격2,방어1,방어2
	}
	
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	UserAndLover(){
		
		random_num();
		set_skill_name();
		
	}
	
	
	
 
	
	
	public void random_num() {
		
		this.ran_num = (int)(Math.random()*4);
		
	}
	
	public skill_name set_skill_name() {
		
		if (this.ran_num==0) {
			return skill_name.공격1;
		}
		else if (this.ran_num==1) {
			return skill_name.공격2;
			
		}
		else if (this.ran_num==2) {
			return skill_name.방어1;
			
		}
		else if (this.ran_num==3) {
			return skill_name.방어2;
			
		}
		else {
			return skill_name.공격1;//무의미
		}
		
		}
		
	
	
}
