package _10_1_수강신청화면;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MajorClass {
	

private String professor;
private String time;
private String className;
 private int class_setNum;
	
MajorClass( String professor, String time,String className,int class_setNum){
	
	this.professor=professor;
	this.time= time;
	this.className=className;
	this.class_setNum=class_setNum;
	
	
}
	



}
