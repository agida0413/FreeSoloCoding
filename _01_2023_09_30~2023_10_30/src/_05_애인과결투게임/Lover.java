package _05_애인과결투게임;

public class Lover  {
	protected int  hp;
	protected String name;
	private int damage;
	protected int ran_num;
	protected int attack_count=6;//공격횟수제한
	protected int defence_count=4;//방어횟수제한
	
	Lover(){//생성시 hp100
		this.hp=100;
		
		
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
	
	
	
	
	public int getRan_num() {
		return ran_num;
	}

	public void setRan_num(int ran_num) {
		this.ran_num = ran_num;
	}
	
	
	

	
	
	
	public int getDamage() {
		return damage;
	}

	public int  set_attak_Damage() {//상대방 공격 값 받기
			if (ran_num==0) {
				return 0;//화내기
				
			}
			if (ran_num==1) {
				return 1;//삐지기
				
			}
			if (ran_num==2) {
				return 2;//애교부리기
			}
			if (ran_num==3) {
				return 3;//선물주기		
				}
			return 4;//스킬사용횟수 다썻을시 값 반환
	}
	
	public void fight(int set_attack_damage ) throws InterruptedException {//상대방공격값 파라미터로 받기 //피해값 계산
		
			if (this.ran_num==0) {//내공격값 
				attack_count--;
				System.out.println("====================");
				System.out.println(this.name+"의 화내기!!!!");
				Thread.sleep(2000);
				if (set_attack_damage==0) {//상대방공격값
					
					
					minus_hp20();
					
					}
				if (set_attack_damage==1) {
					minus_hp30();
					}
				if (set_attack_damage==2) {
					
					}
				if (set_attack_damage==3) {
					
					}
			
				}	
		
			if (this.ran_num==1) {
				attack_count--;
				System.out.println("====================");
				System.out.println(this.name+"의 삐지기!!!!");
				Thread.sleep(2000);
				if (set_attack_damage==0) {
					minus_hp30();
					}
				if (set_attack_damage==1) {
					minus_hp20();
					}
				if (set_attack_damage==2) {
					
					}
				if (set_attack_damage==3) {
					
					}
			
				}	
		
			if (this.ran_num==2) {
				defence_count--;
				System.out.println("====================");
				System.out.println(this.name+"의 애교부리기!!!!");
				Thread.sleep(2000);
				if (set_attack_damage==0) {
					plus_hp_20();
					}
				if (set_attack_damage==1) {
					minus_hp10();
					}
				if (set_attack_damage==2) {
					
					}
				if (set_attack_damage==3) {
					
					}	
			
				}	
			if (this.ran_num==3) {
				defence_count--;
				System.out.println("====================");
				System.out.println(this.name+"의 선물주기!!!!");
				Thread.sleep(2000);
				if (set_attack_damage==0) {
					minus_hp10();
					}
				if (set_attack_damage==1) {
					plus_hp_20();
					}
				if (set_attack_damage==2) {
					
					}
				if (set_attack_damage==3) {
					
					}
			
				}
			
			
		
		
	}
	public void fight(int set_attack_damage ,String opposite_name) throws InterruptedException {//상대방공격값 파라미터로 받기, 러버 이름받기 //오버로딩 //상성별 텍스트 출력
		
		if (this.ran_num==0) {//내공격값 
			
			
			if (set_attack_damage==0) {//상대방공격값
				System.out.println("====================");
				System.out.println(opposite_name+"의 화내기은 "+this.name+"에게 20의 피해를 입혔다.");
				Thread.sleep(2000);
				
				}
			if (set_attack_damage==1) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 삐지기은 "+this.name+"에게 상당한 피해를 입혔다.");
				Thread.sleep(2000);
				}
			if (set_attack_damage==2) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 애교부리기은 "+this.name+"에게 아무런 피해를 입히지 못했다.");
				Thread.sleep(2000);
				}
			if (set_attack_damage==3) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 선물주기은 "+this.name+"에게 아무런 피해를 입히지 못했다.");
				Thread.sleep(2000);
				}
		
			}	
	
		if (this.ran_num==1) {
			
			if (set_attack_damage==0) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 화내기은 "+this.name+"에게 상당한 피해를 입혔다.");
				Thread.sleep(2000);
				}
			if (set_attack_damage==1) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 삐지기은 "+this.name+"에게 20의 피해를 입혔다.");
				Thread.sleep(2000);
				}
			if (set_attack_damage==2) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 애교부리기은 "+this.name+"에게 아무런 피해를 입히지 못했다.");
				Thread.sleep(2000);
				}
			if (set_attack_damage==3) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 선물주기은 "+this.name+"에게 아무런 피해를 입히지 못했다.");
				Thread.sleep(2000);
				}
		
			}	
	
		if (this.ran_num==2) {
			
			if (set_attack_damage==0) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 화내기은 "+this.name+"에게 상쇄당했다!!");
				Thread.sleep(2000);
				System.out.println(this.name+"은 상쇄를 통해 HP20을 회복하였다.");
				Thread.sleep(2000);
				
				}
			if (set_attack_damage==1) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 삐지기은 "+this.name+"에게 미미한 피해를 입혔다.");
				Thread.sleep(2000);
				
				}
			if (set_attack_damage==2) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 애교부리기은 "+this.name+"에게 아무런 피해를 입히지 못했다.");
				Thread.sleep(2000);
				
				
				}
			if (set_attack_damage==3) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 선물주기은 "+this.name+"에게 아무런 피해를 입히지 못했다.");
				Thread.sleep(2000);
				
				}	
		
			}	
		if (this.ran_num==3) {
			
			if (set_attack_damage==0) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 화내기은 "+this.name+"에게 미미한 피해를 입혔다.");
				Thread.sleep(2000);
				
				}
			if (set_attack_damage==1) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 삐지기은 "+this.name+"에게 상쇄당했다!!");
				Thread.sleep(2000);
				System.out.println(this.name+"은 상쇄를 통해 HP20을 회복하였다.");
				Thread.sleep(2000);
				}
			if (set_attack_damage==2) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 애교부리기은 "+this.name+"에게 아무런 피해를 입히지 못했다.");
				Thread.sleep(2000);
				
				}
			if (set_attack_damage==3) {
				System.out.println("====================");
				System.out.println(opposite_name+"의 선물주기은 "+this.name+"에게 아무런 피해를 입히지 못했다.");
				Thread.sleep(2000);
				}
		
			}
		
		if (set_attack_damage==4) {
			System.out.println(opposite_name+"은 스킬이 없어 아무것도 하지못하였습니다.");//4반환시 아무것도 못함
			
		}
		
	
	
}
	
	
	

	
	
	
	
	
	
	
 
	
	
	public void random_num() {//러버의 랜덤 기술난수발생
		
	if (attack_count>0&&defence_count>0) {
		this.ran_num = (int)(Math.random()*4);//모두가능 0,1,2,3생성
			}
	else if (attack_count>0&&defence_count<=0) {
			this.ran_num=(int)(Math.random()*2);//공격만 가능 0,1만 생성
		}
		
	else if (attack_count<=0&& defence_count>0) {//방어만 가능 2,3만생성
		this.ran_num=(int)(Math.random()*2)+2;
		}
	
	else {
		this.ran_num=5;//의미없는 값 부여
	}
	
	}
	
	// 데미지 값계산 메소드
	public void minus_hp20() {
		
		this.hp-=20;
	}
		
	public void minus_hp10() {
		
		this.hp-=10;
	}
	
	public void minus_hp30() {
		
		this.hp-=30;
	}
	public void plus_hp_20() {
		
		this.hp+=20;
		
	}
	public void plus_hp_50() {
		this.hp+=50;
	}
	
	public void set_firstdata() {
		this.hp=100;
		this.attack_count=6;
		this.defence_count=4;
		
	}
	
	public void now_state()throws InterruptedException {//러버의 현재상태
		System.out.println("====================");
		Thread.sleep(2000);
		System.out.println("[상대]->"+this.name+"의"+"[현재상태]");
		Thread.sleep(2000);
		System.out.println("[HP:"+this.hp+"]");
		
	}
	
	
	public void royal_plag(String name) throws InterruptedException {//궁국기발동 메소드
		
		int i=(int)(Math.random()*50)+1;
		
		if (i==15) {//30분의1확률 궁국기 발동
			Thread.sleep(2000);
			System.out.println(name+"이 궁국기(바람피우기)를 발동합니다!!!!!");
			Thread.sleep(2000);
			System.out.println(this.name+"의 HP-70");
			this.hp-=70;
			
		}
		
	}
	
}

