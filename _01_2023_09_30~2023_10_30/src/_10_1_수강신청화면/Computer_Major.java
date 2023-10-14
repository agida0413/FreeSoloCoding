package _10_1_수강신청화면;

import java.util.ArrayList;
import java.util.List;

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



public void show() {
	
	
	
	majorClasses.stream().forEach((x)->  System.out.println("- "+x.getClassName()+":\t "+x.getProfessor()+
			"\n "+x.getTime()+"| 정원 : "+x.getClass_setNum())  );
	
	
}

}
