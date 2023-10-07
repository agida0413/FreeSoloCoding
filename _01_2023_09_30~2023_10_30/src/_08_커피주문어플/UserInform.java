package _08_커피주문어플;

import java.util.Scanner;

public class UserInform {
	
	public String nickname[]= {"뭐요","안녕","곰탱이","아기다","똥"};
	private String id []= {"agida","admin","yong","YJ","ABC"};
	private String pw []={"1234", "1234","rla104","4321","543"};
	private int coupon[]= {1,4,3,1,6};
	private int have_point[]= {3000,0,1000,5000,13000};
	public String stack_nickname;
	private int stack_coupon;
	private int stack_have_point;
	public boolean login_check=false;
	public int attempt;//로그인 시도횟수
	public int failNum;//실패 횟수
			
	public void login() {
		
		
		this.failNum=0;
		this.attempt=5;//시도횟수 5로 초기화
		
		while(attempt>0) {//시도횟수가 5회이상일때 while 아니면 종료
			System.out.println("남은 시도가능한 로그인 횟수["+attempt+"]");
		String id = userInput_Id();//아이디 받아 저장
		String pw= userInput_Pw();//비밀번호 받아 저장
			
			
		for(int i=0;i<this.id.length;i++) {
			
		
			
			if (id.equals(this.id[i])&&pw.equals(this.pw[i])) {// 배열에 값이 같으면 성공 아니면 루프돔
				
				this.stack_nickname = nickname[i];//i번째 정보들을 변수에 저장
				this.stack_coupon=coupon[i];
				this.stack_have_point=have_point[i];
				login_check=true;
				break;
			}
			
			
			
			
			
			}
		
		if (login_check==true) {
			
			System.out.println("로그인에 성공했습니다.");
			break;
		}
		else {
			System.out.println("로그인 실패");
			attempt--;
			failNum++;
			if (failNum==5) {
				System.out.println("시스템종료");
				System.exit(0);//실패횟수가 5번이면 시스템 종료
			}
		}
		
		}
	}
		
	
	
	
	public String userInput_Id() {
		Scanner scan= new Scanner(System.in);
		System.out.print("ID를 입력하세요:");
		return scan.next();
		
	}
	public String userInput_Pw() {
		Scanner scan= new Scanner(System.in);
		System.out.print("Pw를 입력하세요:");
		return scan.next();
	}
	
	public void shot_user_infotm() throws InterruptedException {//정보출력
		Thread.sleep(1000);
		System.out.println("-------------------");
		System.out.println("닉네임: "+this.stack_nickname);
		System.out.println("보유 쿠폰: "+this.stack_coupon);
		System.out.println("보유 포인트: "+this.stack_have_point);
		Thread.sleep(1000);
	}
}

