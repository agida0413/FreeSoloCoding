/*
 * 
 * 동기: 메소드와 클래스 공부를 하다가  블랙잭 게임을 만들어보면 좋겠다는 생각이 듬.
 * 
 * 목표: 물론 여러 코딩테스트나 알고리즘에서 블랙잭 게임을 구현하는 코드들이 있는 것을 알고 있다 .하지만 절대로 보지않고 나만의 알고리즘으로 모든 동작을 구현하겠다.
 * 		클래스 상속과 오버라이딩 객체화를 최대한 이용한다.
 * 
 * 
 */

package _06_블랙잭;

import java.util.Arrays;
import java.util.Scanner;

public class Main_BlackJack {
public static void main(String[] args) {
	Rule rule=new Rule();
	
	rule.user.first_draw();
	rule.user.show_my_deck();
	rule.user.hit_or_stand();
	rule.user.show_my_deck();
	System.out.println(rule.user.total);
	
	

	
	
}



}

