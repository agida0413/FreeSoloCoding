package _07_텍스트야구게임;
/*
 * 동기 : 나는 원래 야구를 좋아한다. 모바일로 야구게임도 많이 해봤고 , 언젠가는 만들어 보고싶단 생각을 하곤했다. 현재로는 텍스트로 구현 가능한 야구게임을 
 * 		만들수 있을거 같다는 생각이 들었다 . 
 * 
 * 목표 : 야구의 모든 규칙을 적용하긴 어렵겠지만, 최대한 기능을 많이 넣는 것을 목표로 한다. 인터페이스 , 추상클래스를 활용한다.
 * 		틀: 
 * 			추상 클래스 : 유저와 컴퓨터 공통된 부분 
 * 					
 * 			유저 클래스:추상클래스 상속   attack 메소드(스윙,참기,번트) , defence 메소드 (스트라이크던지기, 볼던지기,견제등등등),abstract 값을받는 메소드
 * 			컴퓨터 클래스: 추상클래스 상속
 * 			규칙 클래스 : 유저,컴퓨터 클래스 할당 후 규칙 정의 
 * 			이닝변수(static),이닝변수(boolean static) 스트라이크 변수 ,볼 변수 , 아웃변수(if strike ==3 out++) ,if 플라이볼,땅볼 ,병살 등등등....
 * 			|
 * 			if out==3 
 * 			score 변수(static)    ,주자 변수 int 배열 [3]	
 * 
 * 
 * 
 */
public class Main_Stadium {

	
	
	public static void main(String[] args) {
		User user = new User();
		Computer computer = new Computer();
		user.attack();
		
		System.out.println(user.real_num);
		user.defence();
		System.out.println(user.real_num);
		computer.attack();
		System.out.println(computer.real_num);
		computer.defence();
		System.out.println(computer.real_num);
	}
}
