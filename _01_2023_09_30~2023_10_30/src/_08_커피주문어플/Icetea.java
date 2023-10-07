package _08_커피주문어플;

public class Icetea extends IceAmericano {

	
	
	
	public Icetea(String name) {
		super(name);
		this.select_num=5;
		// TODO Auto-generated constructor stub
	}
	public void reciepe() {
		System.out.println("아이스티 가루 5스푼");
		System.out.println("물 200ml");
		
		}
	public int time() {
		return 1;
	}
	
	public int price() {
		
		return 4000;
	}

}
