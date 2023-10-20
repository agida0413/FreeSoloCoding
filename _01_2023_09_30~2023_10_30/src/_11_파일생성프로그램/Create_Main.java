package _11_파일생성프로그램;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Create_Main {
	public static void main(String[] args)  {
		
		File file ;
		String name="";
		Create_abstract c;
		Scanner scan = new Scanner(System.in);
		 
		while (true) {
			file =null;
			c=null;
			
			System.out.println("1.다른경로에 파일생성");
			System.out.println("2.다른경로에 폴더생성");
			System.out.println("3.현재경로에 파일생성");
			System.out.println("4.현재경로 폴더생성");
			System.out.println("파일 및 폴더 확인");
			System.out.println("할 수행 입력:");
			int answer = scan.nextInt();
			
			if (answer==1) {//다른 경로에 파일 생성

				c= new CreateFileOtherWay();
				name=c.calculate_realN();
				
				
				file = new File(name);
				try {
					file.createNewFile();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			}
				
				
			
			
			
				if (answer==2) {//다른경로에 폴더 생성
					c = new CreateFolderOtherWay();
					name =c.calculate_realN();
					file = new File(name);
					file.mkdirs();
					continue;
				}
				
				if (answer==3) {//현재경로에 파일 생성
					c= new CreateThisWay();
					name=c.calculate_realN();
					
					
					file = new File(name);
					try {
						file.createNewFile();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					continue;
				}
				
				if (answer==4) {//현재경로에 폴더 생성
					c = new CreateThisWay();
					name =c.calculate_realN();
					file = new File(name);
					file.mkdirs();
					continue;
				}
			
		
			
			
		
		
			
		}
			
		
		
	}
}
