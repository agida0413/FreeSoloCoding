package _10_수강신청어플_메인;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Join  {
	
	boolean reJoin;
	
	
	
	public Set<UserInform> join_inform(Set<UserInform> userlist) {
		while(true) {
				reJoin=false;
				UserInform user = new UserInform();
				user.setName();
				user.setMajor();
				user.setAge();
				try {
					//나이가 숫자가 아닐때 예외처리
				int i = Integer.parseInt(user.getAge());
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("나이는 숫자입니다.다시입력하세요.");
					continue;
				}
				
				user.setId();
				
				
				joonbokCheck_id(userlist, user);
				if (reJoin==true) {
					System.out.println("중복된 아이디입니다.");
					continue;
				}
				
				
				user.setPw();
				
				
				user.setNickname();
				
				
				joonbokCheck_nickname(userlist, user);
				if (reJoin==true) {
					System.out.println("중복된 닉네임입니다.");
					continue;
				}
				
				//980431-1235221
				
				user.setIdenty();
				try {//주민등록번호이 숫자가 아닐때 예외처리
					int i1= Integer.parseInt(user.getIdenty().substring(0,6));
					int i2 = Integer.parseInt(user.getIdenty().substring(7,14));
				} catch (Exception e) {
					System.out.println("주민등록번호를 다시 확인하세요.");
					continue;
				}
				checkIdenty(user.getIdenty());
				if (reJoin==true) {
					System.out.println("-를 포함하지 않았거나,13자리를 입력하지않았습니다.");
					continue;
				}
				
				joonbokCheck_inform(userlist, user);
				if (reJoin==true) {
					System.out.println("이미 가입된 정보 입니다.");
					continue;
				}
				System.out.println("회원가입을 축하합니다.");
				userlist.add(user);
				break;
				
				
			}	
		return userlist;
		}
		
		
	public void joonbokCheck_id(Set<UserInform> userlist,UserInform user) {
		Iterator<UserInform>it=userlist.iterator();
		
		while(it.hasNext()) {
			if (it.next().getId().equals(user.getId())) {
				reJoin=true;
			}
			
		}
		
		
	}
	
	public void joonbokCheck_nickname(Set<UserInform> userlist,UserInform user) {
		Iterator<UserInform>it=userlist.iterator();
		
		while(it.hasNext()) {
			if (it.next().getNickname().equals(user.getNickname())) {
				reJoin=true;
			}
			
		}
		
		
	}
	public void joonbokCheck_inform(Set<UserInform> userlist,UserInform user) {
		Iterator<UserInform>it=userlist.iterator();
		
		while(it.hasNext()) {
			if (it.next().getIdenty().equals(user.getIdenty())) {
				reJoin=true;
			}
			
		}
		
		
	}
	
	
	public void checkIdenty(String identy) {
		if (identy.length()!=14) {
			
				reJoin=true;
		}
		if (identy.contains("-")==false) {
			
			reJoin=true;
		}
	}
	
	

	
	
	


}
