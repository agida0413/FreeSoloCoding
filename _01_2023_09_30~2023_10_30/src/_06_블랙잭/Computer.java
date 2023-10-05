package _06_블랙잭;

import java.util.Scanner;

public class Computer extends User {//유저상속
	Computer(){
		super();
		this.name="컴퓨터";
		
	}
	
	
	@Override//컴퓨터 드로우 오버라이딩
	public void first_draw() {//컴퓨터에서는 덱을 보여주지않는 오버라이딩
		this.drawDeck();
		this.drawDeck();
		if (this.total==21) {
			this.blackjack=true;
		}
		
	
		}
	
	
	@Override//컴퓨터에서는 히트or스탠드를 두장의 합이 17이상이면 스탠드 , 17미만이면 히트
	
	
	public void hit_or_stand() {
		
		while(total<17) {
			hit();
			
			
		}
		over=true;
		
		
	}
	
	
	
}
