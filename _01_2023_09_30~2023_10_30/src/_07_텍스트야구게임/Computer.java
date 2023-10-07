package _07_텍스트야구게임;

import java.util.Scanner;

public class Computer extends Sum_Player {

	
public int getInput() {
		
		return (int)(Math.random()*3)+1;
	}
}
