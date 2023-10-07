package _07_텍스트야구게임;

import java.util.Scanner;

public class User extends Sum_Player {

	
	public int getInput() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력하세요:");
		return scan.nextInt();
	}
	
	
	public void show_attackSelect() {
		
		System.out.println("1.스윙");
		System.out.println("2.참기");
		System.out.println("3.도루");
		
		
	}
	
public void show_defenceSelect() {
		
		System.out.println("1.스트라이크 던지기");
		System.out.println("2.볼 던지기");
		System.out.println("3.견제");
		
		
	}

public int attack() {
	show_attackSelect();
	return super.attack();
	
	
}

public int defence() {
	show_defenceSelect();
return	super.attack();
	
	
}
}
