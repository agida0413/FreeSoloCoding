
import java.util.Scanner;

public class Circle {//원의 관련된 값 계산
	public static final double PI=3.141592;
	public double r;
	Scanner scan = new Scanner(System.in);

	
	public  Circle(){
		System.out.println("반지름을 입력하세요: ");
		this.r=scan.nextDouble();
		System.out.println("원의 넓이 : "+width());
		System.out.println("원의 둘레 : "+doole());
		
	}
	public double width() {
		
		double width = this.r*this.r*this.PI;
		return width;
	}
	
	public double doole() {
		
		double doole = 2.0*this.PI *this.r;
		return doole;
	}
	
}
