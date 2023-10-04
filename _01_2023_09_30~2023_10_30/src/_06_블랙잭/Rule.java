package _06_블랙잭;

import java.util.Scanner;

public class Rule {//규칙 및 실제게임 작동 클래스 
//	유저와 컴퓨터 입력받기
User user=new User(setName());



public static String setName() {
Scanner scan =new Scanner(System.in);
	System.out.print("이름을 입력하세요:");
	return scan.next();
	
}



public void stand_or_hit() {
	
	
	
}
}
