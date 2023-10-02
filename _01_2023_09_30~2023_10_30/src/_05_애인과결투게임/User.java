package _05_애인과결투게임;

import java.util.Scanner;

public class User extends Lover   {
	
	
	private int damage;
	
	
	
	
public void random_num() {//유저 스킬 셋 오버라이딩
	
	Scanner scan = new Scanner(System.in);
	while(true) {
		
		System.out.println("====================");
	System.out.println("0:화내기");
	System.out.println("1:삐지기");
	System.out.println("2:애교부리기");
	System.out.println("3:선물주기");
	System.out.print("스킬을 입력하세요:");
	int i = scan.nextInt();
	
	if (i>=0 && i<=3) {
		this.ran_num=i;
		
		break;
		
	}
	else {
		System.out.println("잘못입력하셨습니다.");
		
		
	}
	
	
	
	}
		
	}

public void now_state()throws InterruptedException {//state 오버라이딩
	System.out.println("====================");
	Thread.sleep(1000);
	System.out.println("[나]->"+this.name+"의"+"[현재상태]");
	Thread.sleep(1000);
	System.out.println("[HP:"+this.hp+"]");
	
}


	
	
	
	
	
	
	
}
