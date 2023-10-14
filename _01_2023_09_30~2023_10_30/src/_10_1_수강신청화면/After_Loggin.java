package _10_1_수강신청화면;

import java.util.Iterator;

import java.util.Set;

import _10_수강신청어플_메인.UserInform;

public class After_Loggin {


	
	public void show_inform(UserInform user) {
	
		System.out.println("-----로그인 정보-----");
		System.out.println(user.getName());
		System.out.println(user.getAge());
		System.out.println(user.getNickname());
		System.out.println(user.getMajor());
		
		
		
		}
	
	
	public Computer_Major major_inform(UserInform user) {
		if (user.getMajor().equals("컴퓨터 공학과")) {
			return new Computer_Major();
			
		}
		if (user.getMajor().equals("간호학과")) {
		 return	new Nurse_Major();
		}
		if (user.getMajor().equals("경영학과")) {
			return new Business_Major();
		}
		else {
			return new Computer_Major();
		}
	}
	
}
