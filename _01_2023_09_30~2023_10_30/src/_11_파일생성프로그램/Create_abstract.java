package _11_파일생성프로그램;

import java.util.Scanner;

abstract public class Create_abstract {

abstract public String  calculate_realN();
	
public String set_N() {
	Scanner scan =new Scanner(System.in);
	System.out.print("생성할 파일이름입력:");
	String str=scan.next();
	return "\\"+str;
	
}


	
}
