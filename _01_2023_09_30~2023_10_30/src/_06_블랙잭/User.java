package _06_블랙잭;

import java.util.Scanner;

public class User {
	public String name;
	Deck dia_deck = new Deck("◆");
	Deck clover_deck=new Deck("♣");
	Deck spade_deck=new Deck("♠");
	Deck heart_deck=new Deck("♥");
	
	int calNum[]= {1,2,3,4,5,6,7,8,9,10,10,10,10};//계산할값
	
	
	int my_draw_num []= new int[10];//내가 뽑은 값 문자열 과 실제 계산값 저장
	String my_draw_shape[]=new String[10];//내가 뽑은 값 문자열 과 실제 계산값 저장
	
	
	
	public int count;//뽑을때 마다 카운트++ 
	public int sum;

	
	public int total;//총합
	
	public boolean blackjack;//합이21일때 값
	public boolean over;
	
	
	////////////////////////////////////////////////////////////////////
	
	


	
	
	
	
	
	


	
	
	
	
	public User(){
		
		
	}
	
	
	public User(String name){
		this();
		this.name = name;
		this.count=0;
		this.sum=0;
		this.total=0;
		this.calNum[0]=1;
		blackjack=false;
		over=false;
	}
	
	
	
	
	public void drawDeck() {
		set_if_under11();
		int i = (int)(Math.random()*4);//모양선택 변수
			
			//숫자선택 for문
			while(true) {
					int k=(int)(Math.random()*13);//인덱스 랜덤발생
				if (i==0) {//숫자선택
					if (dia_deck.calNum_count[k]==1) {//만약 카운트값이 1이면 continue // 모양이 다이아
						
						continue;
					}
					else {//카운트값이 0이면 뽑은 카드값에 계산할 카드값과, 모양값 저장후 카운트++
						my_draw_num[this.count]=calNum[k];
						my_draw_shape[this.count]=dia_deck.shap_num[k];
						total+=calNum[k];
						dia_deck.calNum_count[k]++;
					
						break;
					}
					
				}
				else if (i==1) {//모양이 클로버
					
					if (clover_deck.calNum_count[k]==1) {//만약 카운트값이 1이면 continue 
						
						continue;
					}
					else {//카운트값이 0이면 뽑은 카드값에 계산할 카드값과, 모양값 저장후 카운트++
						my_draw_num[this.count]=calNum[k];
						my_draw_shape[this.count]=clover_deck.shap_num[k];
						total+=calNum[k];
						clover_deck.calNum_count[k]++;
						
						break;
					}
					
				}
				else if (i==2) {
					
					if (spade_deck.calNum_count[k]==1) {//만약 카운트값이 1이면 continue // 모양이 클로버
						
						continue;
					}
					else {//카운트값이 0이면 뽑은 카드값에 계산할 카드값과, 모양값 저장후 카운트++
						my_draw_num[this.count]=calNum[k];
						my_draw_shape[this.count]=spade_deck.shap_num[k];
						total+=calNum[k];
						spade_deck.calNum_count[k]++;
						
						break;
					}
					
				}
				else if (i==3) {
					if (heart_deck.calNum_count[k]==1) {//만약 카운트값이 1이면 continue // 모양이 하트
						
						continue;
					}
					else {//카운트값이 0이면 뽑은 카드값에 계산할 카드값과, 모양값 저장후 카운트++
						my_draw_num[this.count]=calNum[k];
						my_draw_shape[this.count]=heart_deck.shap_num[k];
						total+=calNum[k];
						heart_deck.calNum_count[k]++;
						
						break;
					}
				}
				
			
		
			
		
			}
			this.count++;
	}
	
	public void first_draw() {
		this.drawDeck();
		this.drawDeck();
	
		}
	
	public void hit_or_stand() {
		Scanner scan =new Scanner(System.in);
		if (total<=21) {
			while(true) {
			System.out.print("Hit(Y) or Stand(N) :");
			String answer=scan.next();
			if (answer.equals("Y")) {
				hit();
				break;
			}
			else if (answer.equals("N")) {
				over=true;
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
				continue;
				}
			}
		}
		if (total==21) {
			blackjack=true;
		}
		if (total>21) {
			over=true;
		}
		
	}
	public void hit() {
		drawDeck();
		
	}
	public void stand() {
		
		
	}
	
	
	


	public void show_my_deck() {//null값제외 출력
	
		for(String str:this.my_draw_shape) {
			if (str!=null) {
				System.out.print("["+str+"]");
			}
			
			
		}
		System.out.println();
		
		
	}
	
	public void set_if_under11() {//만약 총합이 11이하이면 A를 11값으로 바꿈
		
		if (total<=10) {
			calNum[0]=11;
		}
		
	}


	
		
			
		
	
	
}
