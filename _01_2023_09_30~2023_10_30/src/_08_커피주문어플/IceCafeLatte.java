package _08_커피주문어플;

public class IceCafeLatte extends IceAmericano {
	public IceCafeLatte(String name) {
		super(name);
		this.select_num=3;
		// TODO Auto-generated constructor stub
	}

	public void reciepe() {
		System.out.println("에스프레소 +1");
		System.out.println("우유 200ml");
		
		}
	
public int  price() {
		
		return 6000;
	}
}
