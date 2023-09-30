package _05_애인과결투게임;
/*
 * 
 * 
 * 동기: 여자친구와 싸움이 일어났다.. 포켓몬게임 처럼 기술을 가지고 애인과 싸움을 하는 게임을 작성해보면 재미있을거같다는생각이 들었다.
 * 
 * 구현 목표: 애인은 컴퓨터 난수를 발생하여 기술선택 . 방어기술2가지 공격기술2가지가있고 서로 방어기술을 사용했을시 아무일도 일어나지않고 , 공격1 기술 - > 공격 2기술은 서로 상성 관계를 가지고있다.(상당한피해 , 미약한 피해)
 * 		   공격1->공격1 처럼 같은공격을 하면 일반 대미지를 준다. hp가 0이되면 게임이 종료된다.
 * 			클래스의 객체지향개념을 최대한 활용해보고싶다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Main_fight {
public static void main(String[] args) throws InterruptedException {
	
	start_interface();
	
	
	}







public static void  start_interface() throws InterruptedException {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("========Welcome to fight with lover!!!=========");
	Thread.sleep(1000);//게임 소개
	
	
	while(true) {
	System.out.print("게임을 시작할까요?(Y/N):"); //게임 시작여부 질문 Y면 게임진행 N면 게임종료 그외엔 무한루프
	String answer = scan.next();
		if (answer.equals("Y")) {//루프탈출
			
			break;
			}
		else if (answer.equals("N")) {
			System.out.println("게임을 종료합니다.");
			Thread.sleep(1000);
			System.exit(0);
			}
		else {
			System.out.println("잘못입력하셨습니다.");
			Thread.sleep(1000);//무한루프
			}
	
		
		}
	
		System.out.print("당신의 이름을 입력하세요:");
		User.name=scan.next();//유저입력
		System.out.print("당신의 애인의 이름을 입력하세요:");
		Lover.name=scan.next();//상대방입력
		Thread.sleep(1000);
		System.out.println("잠시후 "+Lover.name+"과의 혈투가 펼쳐집니다.......");
		Thread.sleep(500);
		for(int i =5;i>0;i--) {
			
			System.out.println(i+"!!!!!!!!!");
			Thread.sleep(1000);
		}
		System.out.println("Start!!!!!!");
	}
}



	
	
	

	
	
	
	



