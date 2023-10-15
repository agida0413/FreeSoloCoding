package _10_수강신청어플_메인;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.xml.transform.Source;

import org.w3c.dom.ls.LSOutput;

import _10_1_수강신청화면.After_Loggin;
import _10_1_수강신청화면.Computer_Major;

public class Main {
	
	static boolean loggin_check;
	
public static void main(String[] args) throws InterruptedException {
	
	Set<UserInform>userList =new HashSet();
	Iterator<UserInform>it =userList.iterator();
	After_Loggin after_Loggin =new After_Loggin();
	
	
	UserInform user1=new UserInform();//데이터 임의저장1
	user1.setAge("21");
	user1.setName("김용준");
	user1.setId("agida");
	user1.setPw("1234");
	user1.setNickname("곰");
	user1.setMajor("컴퓨터공학과");
	user1.setIdenty("980413-1235221");
	
	UserInform user2=new UserInform();//데이터 임의저장1
	user2.setAge("24");
	user2.setName("김병호");
	user2.setId("agida0413");
	user2.setPw("12345678");
	user2.setNickname("강아지");
	user2.setMajor("간호학과");
	user2.setIdenty("970113-1235221");
	
	UserInform user3=new UserInform();//데이터 임의저장1
	user3.setAge("23");
	user3.setName("김용준");
	user3.setId("agida1234");
	user3.setPw("1234");
	user3.setNickname("호랑이");
	user3.setMajor("경영학과");
	user3.setIdenty("920413-1235221");
	Scanner scan = new Scanner( System.in);
	
	
	userList.add(user1);//데이터 임의저장
	userList.add(user2);
	userList.add(user3);
	Join join =new Join();
	Login  login =new Login();	
	
	
	
	
	
	
	
	
	
	
	
	
	
	while(true) {
		UserInform user = new UserInform();
		System.out.println("1-회원가입");
		System.out.println("2-로그인");
		System.out.println("입력:");
		int answer=scan.nextInt();
		if (answer==1) {
			join.join_inform(userList);
			answer=2;
		}
		if (answer==2) {
			user =login.loggin(userList);
			
			if (loggin_check==false) {
				System.out.println("로그인에 실패하셨습니다.");
				Thread.sleep(1000);
				continue;
			}
			
			
			}
		else {
			System.out.println("잘못입력하셨습니다.");
			Thread.sleep(1000);
			continue;
		}
		
		
		
		Thread.sleep(1000);
		System.out.println("로그인에 성공하셨습니다.");
		Thread.sleep(1000);
		Computer_Major major = after_Loggin.major_inform(user);
		major.apply_class();
		break;
	
		//내일 구현 : 수강신청 창 , 수강조회 창 , ai(시뮬레이션) , 정보변경, 정보 삭제 창
	}
	
	
	
	
	



	
	
	
	
		
		
	
	
}
}
