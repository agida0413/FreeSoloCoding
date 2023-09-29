/*
 * 
 * 동기 : 클래스를 공부하다가 생성자 , 인스턴스 개념 등에 대해 공부할 좋은 예제가 없을까 생각하다가 계산기의 공통성을 이용해서 계산기 프로그램을 만들어 볼생각이 들었다.
 * 		
 * 	목표 : 인스턴스 , 생성자 개념을 중점으로 두고 코딩,  (상속,오버라이딩 등 신경쓰지않고)
 * 
 * 자체 평가 : 전반적으로 생성자와 인스턴스개념에 대해 이해를 했고, 추후에 상속 , 오버라이딩, 오버로딩을 사용하면 더 간결하게 짤수 있을 거 같다.
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Return r1 = new Return();
		
		while(r1.check) {
		
		System.out.println("얻고자하는 식 입력(1:사각형,2:삼각형,3:원): ");
		int i = scan.nextInt();
		
		if (i==1) {
			
			Rectangle rectangle=new Rectangle();
			r1.getCheck();
		continue;
		}
		
		else if (i==2) {
			Triangle triangle=new Triangle();
			r1.getCheck();
		continue;
		}
		else if (i==3) {
			Circle circle = new Circle();
			r1.getCheck();
			continue;
		}
		else {
			System.out.println("잘못입력하셨습니다.");
			continue;
		}
		
		

		
		}
		
	}

}
