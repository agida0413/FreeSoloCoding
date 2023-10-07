package _08_커피주문어플;

public class HotCafeLatte extends HotAmericano {

	public HotCafeLatte(String name) {
		super(name);
		this.select_num =4;
	}

	
public int time() {
		
		return 5;
	}

public int price() {
	
	return 5000;
}

}
