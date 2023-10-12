package _09_통합팩;
/*
 * 동기:패키지 공부를 하면서 다른 패키지를 임포트하는 연습
 * 
 * 목표: 지금까지 만든 게임들을 하나의 통합팩으로 만든다.
 * 
 * 
 */
import java.util.Scanner;

import _01_숫자야구게임._01_숫자야구게임;
import _05_애인과결투게임.Main_fight;
import _06_블랙잭.Main_BlackJack;

public class Main {
public static void main(String[] args) throws InterruptedException {
	Main_BlackJack blackJack =new Main_BlackJack();
	_01_숫자야구게임 baseball =new _01_숫자야구게임();
	Main_fight fight = new Main_fight();
	Scanner scan =new Scanner(System.in);
	while(true) {
		System.out.println("================");
		System.out.println("1.블랙잭게임");
		System.out.println("2.숫자야구게임");
		System.out.println("3.애인과 결투게임");
		System.out.println("================");
		System.out.println("게임을 선택");
		int answer = scan.nextInt();
		if (answer==1) {
			blackJack.main(args);
			continue;
		}
		else if (answer==2) {
			baseball.main(args);
			continue;
		}
		else if (answer==3) {
			fight.main(args);
			continue;
		}
		else {
			System.out.println("잘못입력하셨습니다.");
			continue;
		}
		
	}
	
}
}
