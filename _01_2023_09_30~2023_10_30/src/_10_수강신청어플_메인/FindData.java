package _10_수강신청어플_메인;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class FindData {

	
	public String find_id(Set<UserInform>list) {
		String id="";
		Scanner scan =new Scanner(System.in);
		System.out.println("이름을 입력하세요:");
		String name =scan.next();
		Iterator<UserInform> it = list.iterator();
		String identy="";
		
		while(true) {
		System.out.println("주민번호를 입력하세요:");
		identy=scan.next();
		try {//주민등록번호이 숫자가 아닐때 예외처리
			int i1= Integer.parseInt(identy.substring(0,6));
			int i2 = Integer.parseInt(identy.substring(7,14));
		} catch (Exception e) {
			System.out.println("주민등록번호를 다시 확인하세요.");
			continue;
			}
		break;
		}
		
		
		while(it.hasNext()) {
			
			UserInform user=it.next();
			if (user.getName().equals(name)&&user.getIdenty().equals(identy)) {
				id=user.getId();
				break;
				
			}
		
		}
		if (id.equals("")) {
			return "가입된 정보가 없습니다.";
		}
		return id;
		
		
		
		
		
	}
	
	public String find_pw(Set<UserInform>list) {
		Iterator<UserInform> it = list.iterator();
		String pw="";
		
		
		Scanner scan =new Scanner(System.in);
		
		
		System.out.println("아이디를 입력하세요:");
		String id =scan.next();
		
		System.out.println("이름을 입력하세요:");
		String name =scan.next();
		
		
		
		
		while(it.hasNext()) {
			
			UserInform user=it.next();
			if (user.getId().equals(id)&&user.getName().equals(name)) {
				pw=user.getPw();
				break;
				
			}
		
		}
		
		if (pw.equals("")) {
			return "가입된 정보가 없습니다.";
		}
		return pw;
		
		
		
		
		
	}
}
