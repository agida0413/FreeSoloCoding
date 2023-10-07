package _08_커피주문어플;
/*
 * 	동기 : 추상클래스 ,인터페이스를 배우고 나서 적용을 시킬만한 예제가 필요했는데 , 객체를 여러가지로 나눌수있는 카페가 
 * 		 적당할 것 같다는생각을 했다.
 * 	목표: 추상클래스 ,인터페이스를 공부한다는 생각으로 최대한 활용한다.
 * 		
 * 	기능 :  각 커피별 레시피 이름, 가격 , 소요시간 ,커피잔 ,빨대를 꽃아주세요(공통) -> 커피 클래스를 추상클래스로 정의하고 커피별 상속 
 * 			 이 부분은 사실상 어플에 필요 없지만 공부를 해야하니 추가하는 기능.		 
 *  	
 * 		  계산기 클래스 - > 고객 정보를 받아서 계산 키오크스 로직 작성 
 * 		구현완료// 유저 정보 클래스-> 데이터베이스를 이용안하므로 배열로 여러개의 회원 아이디와 비밀번호 닉네임 ,쿠폰,보유포인트 저장 하는 클래스
 * 		 //구현완료//로그인 창 클래스 -> 회원 데이터를 입력받아 로그인 하는 클래스 
 * 
 * 사후평가: 데이터베이스를 저장할수 있다면 실제로도 정말 써먹을 만한 프로그램인거 같다. 얼른 데이터베이스를 익혀서 적용시켜보고싶다.
 *   
 * 
 */
public class Main_Cafe  {
public static void main(String[] args) throws InterruptedException {
IceAmericano coffees[]=new IceAmericano[5];
Coffee_calculator calculator = new Coffee_calculator();
UserInform userInform =new UserInform();
coffees[0]=new IceAmericano("아이스 아메리카노");
coffees[1]=new HotAmericano("핫 아메리카노");
coffees[2]=new IceCafeLatte("아이스 카페라떼");
coffees[3]=new HotCafeLatte("핫 카페라떼");
coffees[4]=new Icetea("아이스 티"); 

userInform.login();

userInform.shot_user_infotm();

calculator.monitor(coffees);
calculator.total_calculate();
userInform.shot_user_infotm();
calculator.contain_discount(userInform.getStack_coupon(), userInform.getStack_have_point());
}
}
