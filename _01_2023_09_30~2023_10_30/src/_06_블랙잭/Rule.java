package _06_블랙잭;

import java.util.Scanner;

public class Rule {//규칙 및 실제게임 작동 클래스 
	
	public boolean user_win;
	public boolean computer_win;
	
	public Rule() {
		
		user_win=false;
		computer_win=false;
		
		System.out.println("");
		// TODO Auto-generated constructor stub
	}
//	유저와 컴퓨터 입력받기
User user= new User();
Computer computer =new Computer();


public void totoal_firstDraw() throws InterruptedException {//메인으로 보낼영역
	computer.first_draw();
	System.out.println("첫번째 턴 .. 카드 두장을 뽑습니다.");
	Thread.sleep(1500);
	user.first_draw();
	Thread.sleep(1500);
	

	
	
	
	
	
	
}

public void blackJackCheck() throws InterruptedException {//블랙잭을 뽑았을떄 
	if (user.blackjack==true && computer.blackjack==false) {
		user_win=true;
	}
	if (user.blackjack==false && computer.blackjack==true) {
		computer_win=true;
	}
	if (user.blackjack==true && computer.blackjack==true) {
		user_win=true;
		computer_win=true;
		
	}
	calculWin();
	
}

public void overCheck() {//over 변수가 true일때 승리자 계산 ,컴퓨터 덱오픈
	if (user.over==true && computer.over==true) {
		System.out.println("덱을 오픈합니다.");
		computer.show_my_deck();
		
	}
	
	
}

public void calculWhenOver() throws InterruptedException {
	if (user.over==true&&computer.over==true) {//둘다 21이 넘었을떄 (사ㅏ용자 21 , 컴퓨터 21)  ,둘다 안넘었을때
		
		System.out.println("덱을 오픈합니다.");
		Thread.sleep(1500);
		user.show_my_deck();
		Thread.sleep(1500);
		computer.show_my_deck();
		Thread.sleep(1500);
		if (user.total>21 &&computer.total<21) {
			computer_win=true;
		}
		else if (computer.total>21 && user.total<21) {
			user_win=true;
		}
		
		if (computer.total>21 && user.total>21) {
			if (21-computer.total<21-user.total) {
				user_win=true;
			}
			else {
				computer_win=true;
			}
			
		}
		if (computer.total<21 && user.total<21) {
			if (21-computer.total>21-user.total) {
				user_win=true;
			}
			else {
				computer_win=true;
			}
			
			
			
		}
		if (computer.total==21 &&user.total!=21) {
			computer_win=true;
		}
		if (computer.total!=21 &&user.total==21) {
			user_win=true;
		}
		if (computer.total==21 &&user.total==21) {
			computer_win=true;
			user_win=true;
		}
		if (computer.total==user.total) {
			computer_win=true;
			user_win=true;
		}
		
	}
	
	
}


public void calculWin() throws InterruptedException {
	if (user_win==true && computer_win==false) {
		System.out.println("사용자가 이겼습니다.");
		Thread.sleep(1500);
	}
	if (user_win==false && computer_win==true) {
		System.out.println("컴퓨터가 이겼습니다..");
		Thread.sleep(1500);
	}
	if (user_win==true && computer_win==true) {
		System.out.println("비겼습니다.");
		Thread.sleep(1500);
	}
	
	
	
}

public void total_hit_or_stande() {//컴퓨터와 유저의 히트 OR스탠드 조건 동시수행
	
	computer.hit_or_stand();
	user.hit_or_stand();
	
}







}
