package _10_1_수강신청화면;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Computer_Major {


List<MajorClass>majorClasses = new ArrayList<MajorClass>();

Computer_Major(){
	
	majorClasses.clear();
	MajorClass first= new MajorClass("김영한", "09:00~12:00", "CS기본", 40);
	MajorClass second= new MajorClass("김용한", "09:00~12:00", "객체지향프로그래밍", 30);
	MajorClass third= new MajorClass("박정필", "14:00~17:00", "데이터베이스", 20);
	MajorClass four= new MajorClass("김영한", "09:00~11:00", "공학수학", 50);

	majorClasses.add(first);
	majorClasses.add(second);
	majorClasses.add(third);
	majorClasses.add(four);
	
}



public void apply_class() {
	
	Scanner scan =new Scanner(System.in);
	
	majorClasses.stream().forEach((x)->  System.out.println("- "+x.getClassName()+":\t "+x.getProfessor()+
			"\n "+x.getTime()+"| 정원 : "+x.getClass_setNum())  );
	
for (MajorClass majorClass : majorClasses) {
	while(true) {
	System.out.println(majorClass.getClassName()+"을 신청하시겠습니까?(Y/N)");
	String answer = scan.next();
	try {
		if (answer.equals("Y")) {
			majorClass.setClass_setNum(majorClass.getClass_setNum()-1);
			System.out.println(majorClass.getClassName()+" 신청완료");
		}
		else if (answer.equals("N")) {
			
		}
		else {
			throw new Exception("잘못입력하셨습니다.");
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
		continue;
	}
	break;
	}
	
	majorClasses.stream().forEach((x)->  System.out.println("- "+x.getClassName()+":\t "+x.getProfessor()+
			"\n "+x.getTime()+"| 정원 : "+x.getClass_setNum())  );
	
}
}



}
