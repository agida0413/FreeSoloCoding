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
			
			
			System.out.println("지금까지 결제예상금액:"+totalPrice);
			System.out.println("쿠폰 및 포인트 적립내용으로 이동합니다.");
			break outer;
			
			
		}
		
	}
	
	public void contain_discount(int coupon,int point) {//메인에서 유저 쿠폰,포인트값 받아옴
		Scanner scan = new Scanner(System.in);
		if (coupon>0) {
			
		
		outer :while(true) {
			
				System.out.print("쿠폰을 사용하시겠습니까?(Y/N)");
				String answer = scan.next();
				if (answer.equals("Y")) {
					System.out.print("몇개 사용하시겠습니까?");
					int amount  = scan.nextInt();
					if (amount<=coupon) {
						this.totalPrice-=(amount*1000);
						System.out.println("적용 되었습니다.");
						System.out.println("현재 결재 예정금액:"+totalPrice);
					}
					else {
						System.out.print("쿠폰이 부족합니다.");
						continue;
					}
				}
				else if(answer.equals("N")) {
					break;
			
						}
				else {
					System.out.println("잘못입력하셨습니다.");
					continue;
						}
				while(true) {
				System.out.print("포인트를 사용하시겠습니까?(Y/N)");
				String answer2 = scan.next();
				if (answer.equals("Y")) {
					System.out.print("몇포인트 사용하시겠습니까?");
					int amount  = scan.nextInt();
					if (amount<=point) {
						this.totalPrice-=amount;
						System.out.println("적용 되었습니다.");
						System.out.println("현재 결재 예정금액:"+totalPrice);
						System.out.print("결제하시겠습니까?(Y/N):");
						String answer3=scan.next();
						if (answer.equals("Y")) {
							break outer;	
						}
						else if (answer.equals("N")) {
							break outer;
						}
						
					}
					else {
						System.out.print("포인트가 부족합니다.");
						continue;
					}
				}
				else if(answer.equals("N")) {
					break outer;
			
						}
				else {
					System.out.println("잘못입력하셨습니다.");
					continue;
						}
				
				}
				
				
					}
			}
		}
	}


