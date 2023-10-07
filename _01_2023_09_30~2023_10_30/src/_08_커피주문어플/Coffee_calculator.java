package _08_커피주문어플;

import java.util.Scanner;

public class Coffee_calculator implements Calculable{
		
	public int totalPrice;//총합
	public int eachPrice;//각각의 합
	public int amount;//갯수
	

	
	public void monitor(IceAmericano coffees[]) throws InterruptedException {//출력
		Thread.sleep(1000);
		System.out.println("-------------------");
		for(IceAmericano coffee : coffees) {
			
			System.out.println(coffee.select_num+": "+coffee.name+"("+coffee.price()+"원)");
			
		}
		
		
	}
	
	public void total_calculate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------------------");
		outer:while(true) {//무한루프
			System.out.println("현재금액:"+totalPrice);
			System.out.print("메뉴를 선택하세요(1,2,3,4,5):");
			int answer = scan.nextInt();
			
			if (answer==1) {
				System.out.print("개수를 입력하세요");
				this.amount=scan.nextInt();
				this.eachPrice=3000*amount;
				totalPrice+=eachPrice;
				
			}
			if (answer==2) {
				System.out.print("개수를 입력하세요");
				this.amount=scan.nextInt();
				this.eachPrice=2000*amount;
				totalPrice+=eachPrice;
				
			}
			if (answer==3) {
				System.out.print("개수를 입력하세요");
				this.amount=scan.nextInt();
				this.eachPrice=6000*amount;
				totalPrice+=eachPrice;
				
			}
			if (answer==4) {
				System.out.print("개수를 입력하세요");
				this.amount=scan.nextInt();
				this.eachPrice=5000*amount;
				totalPrice+=eachPrice;
				
			}
			if (answer==5) {
				System.out.print("개수를 입력하세요");
				this.amount=scan.nextInt();
				this.eachPrice=4000*amount;
				totalPrice+=eachPrice;
				
			}
			else if (answer<0 || answer>5) {
				System.out.print("잘못입력하셨습니다.");
				continue;
			}
			
			
			while(true) {
			System.out.print("계속 담을까요?(Y/N):");
			String answer1=scan.next();
			if (answer1.equals("Y")) {
				continue outer;
			}
			else if (answer1.equals("N")) {
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			
			}
			
			while(true) {
			System.out.println("지금까지 결제예상금액:"+totalPrice);
			System.out.print("결제할까요?(Y/N)");
			String answer3= scan.next();
			if (answer3.equals("Y")) {
				break outer;
				}
			else if (answer3.equals("N")) {
				continue outer;
				}
			else {
				
				System.out.println("잘못입력하셨습니다.");
				continue;
				}
			}
			
			
		}
		
	}
}

