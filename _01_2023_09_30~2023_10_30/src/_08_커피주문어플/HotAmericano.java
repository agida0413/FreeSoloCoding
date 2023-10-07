package _08_커피주문어플;

public class HotAmericano extends IceAmericano {

	public HotAmericano(String name) {
		super(name);
		this.select_num=2;
		// TODO Auto-generated constructor stub
	}
	
	public int time() {
		
		return 1;
	}
	public void coffeCup() {
		System.out.println("머그컵을 사용합니다.");
	}
	public int price() {
		
		return 2000;
	}

}
