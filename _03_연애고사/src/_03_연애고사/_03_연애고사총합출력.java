package _03_연애고사;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/*
 *  동기 : 여자친구와 카톡도중 연애고사를 풀어보라하였다. 하지만 텍스트형식도아니고 사진파일로 되어있고 실물시험지가 아니다보니 상당히
 *  풀기가 난감하였다. 코딩중독인지.. 갑자기 든생각이 이걸 프로그램화 해서 빨리 푸는게 더 시간이 절약 될거라 생각이들었다..
 *  
 *  목표: 사진 형식으로 되어있어서 텍스트를 하나하나 따오긴 힘들지만 문제번호를 적어서 안헷갈리게하고 (몇번째 푸는지 ) 내 연애 유형을 출력한다.
 *  1~7번문항이 가장 높으면 에로스유형
 *  8~14번문항이 가장 높으면 루더스유형
 *  15~21번문항이 가장 높으면 스트로게유형
 *  22~28번문항이 가장 높으면 프레그마유형
 *  29~35번문항이 가장 높으면 매니아유형
 *  36~42번문항이 가장 높으면 아가페유형
 *  
 *  자체 평가 : 총점수가 같았을때의 처리를 어떻게 해야할까...나머지는 생각한대로 구현을 하였다. 점수가 같을때의 구현방법을 고민해봐야겠다.
 * 
 */
public class _03_연애고사총합출력 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k;
		int shape[]=new int[6];//각각의 총합
		String yuhyeong [] = {"에로스 유형","루더스 유형","스트로게 유형","프레그마 유형","매니아 유형","아가페 유형"};//유형 배열
		int[] rank=new int[6];//총합 순위
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;//전부1값
			
		}
		 
		for(int i=1; i<=42;i++) {
			System.out.println("///전혀아니다 1 점/// 아니다 2점 //그저그렇다 3점 ///그렇다 4점///// 매우그렇다5점");
			System.out.print((i)+"번째 문제를 입력하세요:");
			k=scan.nextInt();
			
			if (i>=1 && i<8) {
				shape[0]+=k;
			}
			
			if (i>=8 &&i<15) {
				shape[1]+=k;
			}
			
			if (i>=15 &&i<22) {
				shape[2]+=k;
			}
			
			if (i>=22&&i<29) {
				shape[3]+=k;
			}
			if (i>=29 && i<36) {
				shape[4]+=k;
			}
			
			if (i>=36 && i<=42) {
				shape[5]+=k;
			}
		
			
		}
	
				
	
		//0~5번순 인덱스 순으로 출력 어떻게 유형까지 판단하지...?
		//2023.09.28...... 내일 다시
		
			
		for(int i=0;i<rank.length;i++) {
			
				for(int j=0;j<rank.length;j++) {
					
					if (shape[i]<shape[j]) {
						rank[i]++;
						
					}
				}
			
		}
		for(int i=0;i<shape.length;i++) {
			
			if (rank[i]==1) {//1랭크 해당하는 유형 배열 출력
				System.out.println("===========================================");
				System.out.println("당신의 유형은 "+yuhyeong[i]+" 유형입니다.");
				
			}
			if (rank[i]==2) {//2랭크에 해당하는 유형 배열 출력
				System.out.println("===========================================");
				System.out.println("당신이 추후에 될수있는 유형은 "+yuhyeong[i]+" 유형입니다.");
				
			}
			
		}
		
		
		System.out.println("=======================");
		System.out.println("아래는 순서대로 결과 값입니다.");
		System.out.println(Arrays.toString(shape));
		
	}
}
