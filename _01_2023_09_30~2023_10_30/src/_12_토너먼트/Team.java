package _12_토너먼트;

import java.io.IOException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {
	private Team_player_inform player_inform;
	private String team_Name;
	private int player_amount;
	
	
Team(String team_Name,int player_amount){
	this. team_Name =team_Name;
	
	this. player_amount=player_amount;
	try {
		player_inform = new Team_player_inform(this.team_Name,this.player_amount);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
}
}
