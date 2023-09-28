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
 * 
 * 
 */
public class _03_연애고사총합출력 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k;
		int shape[]=new int[6];
		  // 각각의 합
		
		for(int i=1; i<=2;i++) {
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
	
		String change_type[]=new String[6];
		
		for(int i=0;i<change_type.length;i++) {
			
			change_type[i]=String.valueOf(shape[i]);
			
		}
		
	
		System.out.println(Arrays.toString(shape));//0~5번순 인덱스 순으로 출력 어떻게 유형까지 판단하지...?
		//2023.09.29...... 내일 다시
			
		
	}
}
