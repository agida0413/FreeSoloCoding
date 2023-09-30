package _02_카드정렬하기;

/*
 *  동기 : 선택정렬 , 버블정렬 을 공부중 물론 메소드를 통해 쉽게 처리할수 있지만 
 *  	 정확한 알고리즘을 이해하고 싶었음. 
 *  
 *  목표: 선택정렬과, 버블정렬을 사용하여 정렬에 한하여 메소드,클래스,구글링 없이 제어문과 배열만으로 
 *  	포커카드 52장을 오름차순, 내림차순으로 정렬한다. 최적화 목표x 최대한 복잡하고, 알고리즘방식으로
 *  
 *  
 * 자체평가:   물론 알고리즘과 기본기를 위해서 일부로 긴 코딩을 하였지만 , 실무나 추후에는 쓸데없는 코딩을 줄이려는 노력이 필요하다는 것을
 * 			느꼈고 가능은 했지만 , 일부로 길게 진행하였다. 또한 정렬후 문자열로 바꾸는 것이 아니라 실제로 이 코드를 사용하려면 문자열로 바꾸어놓고 정렬하는방법을 사용해야할 것 같다.
 * 
 * 
 * 
 * 
 * 
 * 
 */


import java.util.Arrays;
import java.util.Iterator;

public class _02_카드정렬하기 {

	public static void main(String[] args) {
		//모양과 숫자를 분리? - > 처음엔 숫자  추후에 모양
		//처음엔 정수형, 마지막에 1=A 	T,J,Q,K =10,11,12,13 으로 치환
		//그러면 문자열? Arrays.toString
		
		char shape[]= {'♠','♥','♣','◈'};
		int num[]=new int [13];	//숫자
		
		
	
		for(int i=0;i<num.length;i++) {//숫자값받기
			num[i]=(int)(Math.random()*13)+1;//1~13난수발생
				for(int j=0; j<i;j++) {
						if (num[i]==num[j]) {
							i--;
							break;//중복없는 난수발생
						}
					
					
				}
		
		}
		
		
			
			
		
		
		
//		for(int i=0;i<num.length;i++) {//선택정렬
//			for(int j=i+1;j<num.length;j++) {
//					
//				if (num[i]>num[j]) {
//					int temp=num[i];
//					num[i]=num[j];
//					num[j]=temp;
//				}
//				
//				
//			}
//		
//		
//		
//	}
		
		
		for(int i = 0; i<num.length;i++) {//버블정렬
			
					for(int j=0;j<num.length-i-1;j++) {
						
						if (num[j+1]<num[j]) {
							
							int temp=num[j];
							num[j]=num[j+1];
							num[j+1]=temp;
						}
						
						
					}
			
			
		}
		
		
		
		
		
		String change_num[]=new String[13];
		
		for(int i=0;i<change_num.length;i++) {//문자열로 정수형 배열 받음
			
			change_num[i]=String.valueOf(num[i]);
			
			
		}
		
		change_num[0]="A";
		change_num[9]="T";
		change_num[10]="J";
		change_num[11]="Q";
		change_num[12]="K";
		
		String conc [][]= new String[4][13];
		for(int i=0; i<shape.length;i++) {
					for(int j=0;j<change_num.length;j++) {
						
						conc[i][j]=shape[i]+"["+change_num[j]+"]";
						
						System.out.print(conc[i][j]+" ");
					}
					System.out.println();
			System.out.println("====================================================================================");
			
		}
		
		
		
		
	}
}
