package _01_숫자야구게임;

import java.util.Arrays;
import java.util.Scanner;

public class _01_숫자야구게임 {
public static void main(String[] args) throws InterruptedException {
	/*
	 *   숫자야구게임 
	 *   ---------
	 *   1. 난수 (3자리)
	 *          ------ 중복이 없는 난수 
	 *      369 => new int[3]
	 *   2. 사용자 입력 => new int[3]
	 *      힌트
	 *      123 ==> 0S-1B
	 *      321 ==> 1S-0B
	 *      368 ==> 2S-0B
	 *      369 ==> 3S-0B
	 *              -----
	 *      s=>3이면 종료 
	 *      -----------
	 *      
	 *      목표: 반복문 안에 반복문 등 제어문을 최대한 활용해서 숙달해볼것
	 *      
	 *      자체평가: 나중에 많은 기술들을 배우면 다양한 기능을 추가하고싶다. 
	 *      현재 최고기록 저장.... 역대 최저기록..등 프로그램이 종료되면 날라가는 데이터를 활용해서는 구현불가할것같다.
	 *       
	 *      
	 *      
	 */
	
	int [] com= new int[3];
	int s=0;
	int b=0;
	int count=0;//게임 카운트 수
	char grade=' ';//카운트에 따른 등급
	
	for(int i=0; i<com.length;i++) {//컴퓨터 중복없는 난수발생
		
		//1~9
		com[i]=(int)(Math.random()*9)+1;
		
		for(int j=0;j<i;j++) {
			
			if (com[i]==com[j]) {
				i--;
				break;
			}
			
		}
		
	}
	Scanner scan = new Scanner(System.in);
	int real_user[]=new int[3];
	
	
	
	
	//힌트
	
	while(true) {

		while(true) {
			
			s=0;
			b=0;
			System.out.println("세자리정수를 입력하세요(1~9/세 수는 달라야함):");
			
			int user = scan.nextInt();
			
			real_user[0]=user/100;//백의자리
			real_user[1]=(user/10)%10;//십의자리
			real_user[2]=user%10;//일의자리
			
			
			if (user<=999 && user>0) {
				
					if ((real_user[0]!=real_user[1])&&(real_user[0]!=real_user[2])&&(real_user[1]!=real_user[2])&&real_user[0]!=0 &&real_user[1]!=0 &&real_user[2]!=0) {
						//유저 입력값 오류방지 
						break;
					}
					else {
						System.out.println();
						System.out.println("잘못입력하셨습니다.");
					}
				
			}
			else {
				System.out.println();
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
		
		
		for(int i=0;i<com.length;i++) {
			
			
			
			
			for(int j=0;j<com.length;j++) {
				
				
				
				if (real_user[i]==com[j]) {//숫자가 같은게 있는지 탐색
					
					
						if (i==j) {//자리까지 같으면 s++
							s++;
							
						}
						else {
							b++;//자리 다르면 b++
						}
					
				}
				
				
			}
			
			
			
		}
		System.out.println("====="+(count+1)+"번째 시도=====");
		System.out.println("S: "+s+" B: "+b);
		count++;
		
		
		
		if (s==3) {//스트라이크 3되면 while 탈출
			
			if (count>=0&&count<6) {
				grade='A';
				
			}
			else if (count>=6 && count<10) {
				grade='B';
			}
			else if (count>=10 && count<15) {
				grade='C';
			}
			else {
				grade='D';
			}
			
			
			Thread.sleep(300);
			System.out.println("게임오버!!");
			Thread.sleep(300);
			System.out.println("시도횟수: "+count);
			Thread.sleep(300);
			System.out.println("등급:"+grade
					);
			break;
			
		}
		
		
		
		
	}
	
	
	
	
	
	


}
}
