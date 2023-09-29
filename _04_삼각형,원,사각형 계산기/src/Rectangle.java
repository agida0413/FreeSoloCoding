
import java.util.Scanner;

public class Rectangle  { //사각형과 관련된 값을 계산하는 클래스
	public double garo;
	public double sero;
	Scanner scan = new Scanner(System.in);
	Rectangle(){
		System.out.print("가로 입력 : ");
		this. garo=scan.nextDouble();
		System.out.print("세로 입력 : ");
		this. sero=scan.nextDouble();
		
		System.out.println("사각형 넓이: "+width());
		System.out.println("사각형 둘레: "+doole());
	}
	
	
	
	public double width() {
		
		double width = this.garo * this.sero;
		return width;
	}
	
	
	public double doole() {
		double doole = (this.garo*2.0) +(this.sero*2.0); 
	return doole;
	}
}
