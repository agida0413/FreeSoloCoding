package _12_토너먼트;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Team_player_inform {
	
private List<String>name = new ArrayList<String>();
private List<String>birth= new ArrayList<String>();

Team_player_inform(String team_Name, int num) throws IOException {
	try (BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\yongj\\OneDrive\\문서\\팀.txt"))){
		
		while(true) {
			String tN= br.readLine();
			
			
			if (tN.equals(team_Name)) {
				for(int i=0;i<num;i++) {
				String name1 = br.readLine();
				String birth1 =br.readLine();
			name.add(name1);
			birth.add(birth1);
			
				}
				break;
			}
			
			
			
			
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
