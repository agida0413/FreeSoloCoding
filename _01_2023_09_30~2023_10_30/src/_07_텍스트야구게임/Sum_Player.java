package _07_텍스트야구게임;

public abstract class Sum_Player {
	public int real_num;

public abstract int getInput();

public int attack() {
	int i=getInput();
	if (i==1) {
		real_num=1;
	}
	if (i==2) {
		real_num=2;
	}
	if (i==3) {
		real_num=3;
	}
	return real_num;
	
}

public int defence() {
	int i=getInput();
	
	if (i==1) {
		real_num=1;
	}
	if (i==2) {
		real_num=2;
	}
	if (i==3) {
		real_num=3;
	}
	return real_num;
	
}
	
}


	

