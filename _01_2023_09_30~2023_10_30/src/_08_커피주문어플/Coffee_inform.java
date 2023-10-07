package _08_커피주문어플;

public abstract class Coffee_inform {

	public String name;
	public int select_num;//키오스크에서 선택할 번호
	
	public Coffee_inform(String name) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.select_num=0;
	}
	public void getName() {
		this.name = " ";
	}
	
	public  void startMake() {
		System.out.println(this.name+"의 제작을 시작합니다.");
	}
	public void strow() {
		System.out.println("빨대를 꽃아주세요.");
	}
	public abstract void reciepe();//
	public abstract int time();
	public abstract void coffeCup();
	public abstract int  price();
	
	
	
}
