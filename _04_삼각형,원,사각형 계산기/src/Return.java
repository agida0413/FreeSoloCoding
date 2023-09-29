
import java.util.Scanner;

public class Return {
public static String yes_no;
public static boolean check;
//다시 시작하는지 종료하는지 물어보는 클래스
Scanner scan= new Scanner(System.in);

public Return(){
	
check=true; 
	
}

public void getCheck() {
	
	System.out.print("다시 돌아가시겠습니까(Y/N):");
	String answer = scan.next();
	Boolean check =true;
	while(check)
	if (answer.equals("Y")) {
		
		this.check=true;
		check=false;
	}
	else if (answer.equals("N")) {
		System.out.println("종료합니다.");
		this.check=false;
		check=false;
	}
	
	else {
	 System.out.println("잘못입력하셨습니다.");
	 check=false;
	 getCheck();
	 
	}
	
}


}

