package _12_토너먼트;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_ {
	public static void main(String[] args) throws IOException {
		
		//16개의 팀  
//		try(BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\yongj\\OneDrive\\문서\\팀.txt"))) {
//			while(true) {
//				String str =br.readLine();
//				
//				if (str.equals("첼시")) {
//					String str1 = br.readLine();
//					String str2 =br.readLine();
//					String str3 =br.readLine();
//					String str4=br.readLine();
//					System.out.println(str1);
//					System.out.println(str2);
//					System.out.println(str3);
//					System.out.println(str4);
//				}
//				
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
		
		List<Team> teams = new ArrayList<>();
		for(int i=0;i<1;i++) {
			Scanner scan =new Scanner(System.in);
			System.out.print("팀명입력:");
			String answer = scan.nextLine();
			System.out.print("팀 멤버수:");
			int answer2 = scan.nextInt();
			teams.add(new Team(answer,answer2));
		}
		System.out.println(teams.get(0).getTeam_Name());
		System.out.println(teams.get(0).getPlayer_amount());
		System.out.println(teams.get(0).getPlayer_inform().getName().get(0));
		System.out.println(teams.get(0).getPlayer_inform().getBirth().get(0));
		System.out.println(teams.get(0).getPlayer_inform().getName().get(1));
		System.out.println(teams.get(0).getPlayer_inform().getBirth().get(1));
		
		
	}
		
	
		

}


