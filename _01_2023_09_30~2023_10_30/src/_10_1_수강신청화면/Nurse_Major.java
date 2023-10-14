package _10_1_수강신청화면;

public class Nurse_Major extends Computer_Major{
	
	Nurse_Major(){
		
		majorClasses.clear();
		MajorClass first= new MajorClass("김지수", "09:00~12:00", "성인간호학", 40);
		MajorClass second= new MajorClass("박홍수", "09:00~12:00", "모성간호학", 50);
		MajorClass third= new MajorClass("이홍기", "14:00~17:00", "아동간호학", 40);
		MajorClass four= new MajorClass("홍창수", "09:00~11:00", "보건법규", 70);
		MajorClass fifth= new MajorClass("안성호", "14:00~19:00", "정신간호학", 50);
		MajorClass six= new MajorClass("김필준", "09:00~13:00", "간호관리학", 80);
		MajorClass seven= new MajorClass("이병학", "09:00~12:00", "지역사회간호학", 30);

		majorClasses.add(first);
		majorClasses.add(second);
		majorClasses.add(third);
		majorClasses.add(four);
		majorClasses.add(fifth);
		majorClasses.add(six);
		majorClasses.add(seven);
		
	}
	
}
