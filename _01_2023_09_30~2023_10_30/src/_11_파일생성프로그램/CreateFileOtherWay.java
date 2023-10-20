package _11_파일생성프로그램;import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class CreateFileOtherWay extends Create_abstract {

	
	public String calculate_realN() {
		Scanner scan = new Scanner(System.in);
		
		String name = set_N();
		System.out.print("C드라이브에서 생성할 경로 입력(구분자: ,):");
		String answer=scan.next();
		
		String path = "C:\\Users\\yongj\\"+answer.replace(",", "\\");;
		
		String total= path+name;
		return total;
		
	}
	
	

	
	}
	
	
	

	


