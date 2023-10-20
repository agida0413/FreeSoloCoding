package _11_파일생성프로그램;

import java.util.Scanner;

public class CreateThisWay extends Create_abstract{

	@Override
	public String calculate_realN() {
		
		
		String name = set_N();
		
		String total= "."+name;
		return total;
	}

	

}
