package _04_삼각형_원_사각형계산기;

import java.util.Scanner;
public class Triangle { // 삼각형과 관련된값계산
	
public double mitbyun;
public double left_daegak;
public double right_daegak;
public double height;

Scanner scan=new Scanner(System.in);
public Triangle() {
	
	
	System.out.print("밑변을 입력하세요.");
	this.mitbyun=scan.nextDouble();
	System.out.print("높이를 입력하세요.");
	this.height=scan.nextDouble();
	System.out.print("왼쪽 대각선을 입력하세요.");
	this.left_daegak=scan.nextDouble();
	System.out.print("오른쪽 대각선을 입력하세요.");
	this.right_daegak=scan.nextDouble();
	
	System.out.println("삼각형 넓이: "+width());
	System.out.println("삼각형 둘레: "+doole());
}



public double width() {
	double width=(mitbyun*height)/2.0;
	return width;
}

public double doole() {
	
	double doole = left_daegak+right_daegak+mitbyun;
	return doole;
	
}

}
