package _05_애인과결투게임;

import java.util.Scanner;

public class User extends Lover   {
	
	
	private int damage;
	
	
	
	
public void random_num() {//유저 스킬 셋 오버라이딩
	
	Scanner scan = new Scanner(System.in);
	while(true) {
		
		System.out.println("====================");
	System.out.println("0:화내기"+"[남은횟수:"+attack_count+"]");
	System.out.println("1:삐지기"+"[남은횟수"+attack_count+"]");
	System.out.println("2:애교부리기"+"[남은횟수"+defence_count+"]");
	System.out.println("3:선물주기"+"[남은횟수"+defence_count+"]");
	System.out.print("스킬을 입력하세요:");
	int i = scan.nextInt();
	if (attack_count>0&&defence_count>0) {
		
	
	if (i>=0 && i<=3) {
		
		
		this.ran_num=i;
		
		break;
		
		}
	}
	
	else if (attack_count>0&&defence_count<=0) {//공격만 가능 입력값 제한 
		
		if (i>=0&&i<2) {//사용가능한 입력값 탈출
			
			this.ran_num=i;
			break;
		}
		if (i>=2&&i<=3) {
			System.out.println("=====================");//제한된 입력값 일시
			System.out.println("스킬사용 가능횟수가 부족합니다.");
			
		}
		
	}
	
	else if (attack_count<=0&& defence_count>0) {//방어만 사용가능,제한된입력값
		if (i>=2&&i<=3) {//사용가능 입력값 탈출
			
			this.ran_num=i;
			break;
		}
		if (i>=0&&i<2) {//제한된 입력값일시
			System.out.println("=====================");
			System.out.println("스킬사용 가능횟수가 부족합니다.");
			
		}
	
	
	
	
	
	
	}
	else {
		System.out.println("잘못입력하셨습니다.(입력값 :0~3)");
		
		
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
