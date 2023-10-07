package _08_커피주문어플;

public class IceAmericano extends Coffee_inform {
	
	public IceAmericano(String name) {	
		super(name);
		this.select_num=1;
	}
	
	public void reciepe() {
	System.out.println("에스프레소 +1");
	System.out.println("물 s200ml");
	
	}
	public  int time() {
		
		return 3;
	}
	public void coffeCup() {
		System.out.println("플라스틱컵을 사용합니다.");
	}
	public int  price() {
		
		return 3000;
	}

}
