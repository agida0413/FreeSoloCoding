package _10_수강신청어플_메인;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Login {

	
	public void loggin(Set<UserInform>userlist) {//해야할일 : 유저인폼 클래스 반환하여 정보출력 필요
		

	
		
		Iterator<UserInform> it= userlist.iterator();
		
		
		String id = loggin_id();
		String pw= loggin_pw();
		
		while(it.hasNext()) {
			UserInform user = it.next();//이터레이터 값 임시적인 유저 객체에 저장
				String id_value = user.getId(); //저장된 값 저장
				String pw_value= user.getPw();
			
			if (id_value.equals(id)&&pw_value.equals(pw)) {// 입력받은값과 값비교
				
				Main.loggin_check=true;
				
			}
			
		}	
		
		
	}
	
	public String loggin_id() {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디입력:");
		return scan.next();
		
	}
	public String loggin_pw() {
		Scanner scan = new Scanner(System.in);
		System.out.print("패스워드입력:");
		return scan.next();
		
	}
}
