/*
 * 
 * 동기: 메소드와 클래스 공부를 하다가  블랙잭 게임을 만들어보면 좋겠다는 생각이 듬.
 * 
 * 목표: 물론 여러 코딩테스트나 알고리즘에서 블랙잭 게임을 구현하는 코드들이 있는 것을 알고 있다 .하지만 절대로 보지않고 나만의 알고리즘으로 모든 동작을 구현하겠다.
 * 		클래스 상속과 오버라이딩 객체화를 최대한 이용한다.
 * 자체평가: 최초에 사용자와 컴퓨터가 같은 덱에서 카드를 뽑아야하는데 독립적으로 뽑게 코딩을 해서 난감했다. 하지만 고민 끝에 static 을 사용해서 같은 덱에서 뽑게 설정하였다.
 * 
 */

package _06_블랙잭;

import java.util.Arrays;
import java.util.Scanner;

public class Main_BlackJack {
public static void main(String[] args) throws InterruptedException {
	
	outer :while(true) {
		Scanner scan= new Scanner(System.in);
		
		while(true) {
		System.out.print("게임을 시작할까요?(Y/N):");
		String answer = scan.next();
		if (answer.equals("Y")) {
			Thread.sleep(1500);
			System.out.println("게임을 시작합니다.");
			Thread.sleep(1500);
			break;
		}
		else if (answer.equals("N")) {
			System.out.println("게임을 종료합니다.");
			Thread.sleep(1500);
			System.exit(0);
		}
		else {
			System.out.println("잘못입력하셨습니다.");
			continue;
		}
		}
		Rule rule= new Rule();
		

rule.totoal_firstDraw();//첫번쨰 턴에 컴퓨터 ,사용자 둘다 카드 두장씩 뽑는 메소드
rule.blackJackCheck();//첫턴에 21을 달성하는 블랙잭 조건을 확인하는 메소드

rule.total_hit_or_stande();//컴퓨터는 17이상이 될때까지 카드를 뽑고, 사용자는 입력값을 받아 카드를 뽑는 메소드
rule.calculWhenOver();//OVER가 둘다 TRUE일때 누가 이겼는지 확인하는 메소드
rule.calculWin();//불리안값을 받아 이긴사람 출력


System.out.print("게임을 다시 시작할까요?(Y/N):");
String answer = scan.next();
while(true) {
if (answer.equals("Y")) {
	continue outer;
}
else if (answer.equals("N")) {
	System.out.println("게임을 종료합니다.");
	Thread.sleep(1500);
	System.exit(0);
}
else {
	System.out.println("잘못입력하셨습니다.");
	continue;
	}
}

	}

	

	

	
	
}



}

