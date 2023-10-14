package _10_1_수강신청화면;

public class Business_Major extends Computer_Major{

	Business_Major(){
		majorClasses.clear();
		MajorClass first= new MajorClass("홍준기", "09:00~12:00", "경영학", 30);
		MajorClass second= new MajorClass("김구라", "09:00~12:00", "시스템공학연계", 10);
		MajorClass third= new MajorClass("레이첼", "14:00~17:00", "스크래치프로그래밍", 20);
		

		majorClasses.add(first);
		majorClasses.add(second);
		majorClasses.add(third);
		
		
		
	}
	
}
