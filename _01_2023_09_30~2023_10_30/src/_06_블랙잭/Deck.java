package _06_블랙잭;

public class Deck {
	
	String shap_num[]=new String[13];//모양과 숫자의 문자열합
	String num[]=new String[13];//문자열 
	
	
	
	 int calNum_count[]=new int[13];
	
	
	
	
	
Deck(){
	//생성자 숫자부여
	num[0]="A";
	
	num[10]="J";
	num[11]="Q";
	num[12]="K";
	for(int i =1;i<=9;i++) {
		num[i]=Integer.toString(i+1);
		
	}
	
	
}
Deck(String shape){//생성자 카드 결정
	this();
	for(int i=0;i<num.length;i++) {
		shap_num[i]=shape+num[i];
		
		
	}
	
	
}


	

}

