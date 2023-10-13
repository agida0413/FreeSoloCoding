package _10_수강신청어플_메인;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInform {
private String name;
private String identy;
private String age;

private String id;
private String pw;
private String major;


private String nickname;

UserInform(){
	
	
	
	
	}

public void setName() {
	Scanner scan =new Scanner(System.in);
	System.out.print("이름입력:");
	setName(scan.next());
}

public void setMajor() {
	Scanner scan =new Scanner(System.in);
	
	while(true) {
	System.out.println("1.컴퓨터 공학과");
	System.out.println("2.간호학과");
	System.out.println("3.경영학과");
	System.out.print("전공을 선택하세요:");
	int answer =scan.nextInt();
	if (answer==1) {
		this.major="컴퓨터 공학과";
	}
	else if (answer==2) {
		this.major="간호학과";
	}
	else if (answer==3) {
		this.major="경영학과";
	}
	else {
		System.out.println("잘못선택하셨습니다.");
		continue;
	}
	break;
}
}

public void setIdenty() {
	Scanner scan =new Scanner(System.in);
	System.out.print("주민번호입력(-포함):");
	setIdenty(scan.next());
	
}

public void setId() {
	Scanner scan =new Scanner(System.in);
	System.out.print("Id입력:");
	setId(scan.next());
}

public void setPw() {
	Scanner scan =new Scanner(System.in);
	

	System.out.print("pw입력");
	setPw(scan.next());
	
}

public void setNickname() {
	Scanner scan =new Scanner(System.in);
	System.out.print("닉네임입력:");
	setNickname(scan.next());
}
public void setAge() {
	Scanner scan =new Scanner(System.in);
	System.out.print("나이 입력:");//스트링 오류발생
	setAge(scan.next());
}






}
