package _10_1_수강신청화면;

import java.util.Iterator;
import java.util.Set;

import _10_수강신청어플_메인.UserInform;

public class After_Loggin {

	
	public void show_inform(UserInform user) {
			
		
		
		
		System.out.println("------------정보------------");
		System.out.println("이름:"+user.getName());
		System.out.println("나이:"+user.getAge());
		System.out.println("전공:"+user.getMajor());
		System.out.println("닉네임:"+user.getNickname());
		
		
	}
}
