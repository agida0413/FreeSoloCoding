package _05_애인과결투게임;
/*
 * 
 * 
 * 동기: 여자친구와 싸움이 일어났다.. 포켓몬게임 처럼 기술을 가지고 애인과 싸움을 하는 게임을 작성해보면 재미있을거같다는생각이 들었다.
 * 
 * 구현 목표: 애인은 컴퓨터 난수를 발생하여 기술선택 . 유저는 스킬 선택 .방어기술,공격기술 등 기술을 활용해 상대를 쓰러트린다. 
 * 		  
 * 			클래스의 객체지향개념을 최대한 활용해보고싶다.
 * 
 * 
 * 
 * 
 * 
 * Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("안녕하세요.연인과 싸우기 게임에 앞서 게임방식을 설명하겠습니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("이 게임은 자신의 연인/배우자와 싸움을 하는 게임입니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("총 4개의 스킬을 보유하고 있으며 2개의 공격스킬, 2개의 방어스킬을 가지고있습니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("0,1번 스킬인 화내기와,삐지기는 공격스킬입니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("2,3번 스킬인 애교부리기와,선물주기는 방어스킬입니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("화내기와 삐지기를 서로 사용할경우 서로30의 데미지를 줍니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("화내기/화내기 , 삐지기/삐지기 처럼 서로 같은 공격을 사용할경우 20의 피해를 줍니다. ");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("방어스킬은 데미지를 줄순없으며 , 때론 어느정도 공격을 상쇄시켜 경감된 데미지를 받습니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("어느 정도의 확률로 상대 공격을 상쇄시켜 HP회복을 시켜 이득을 볼수 있습니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("공격스킬 사용가능횟수는 6번,방어 사용가능횟수는 4번입니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("만약 두 플레이어 모두 스킬을 전부 소진하였다면 , 그 시점으로부터 HP가 높은 플레이어가 승리합니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("HP까지 같다면 공격횟수와 방어횟수를 동일하게 3회 추가합니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("각 플레이어,컴퓨터는  궁극기를 가지고 있으며, 극악의 확률로 발생합니다. ");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("궁국기 발동시 엄청난 데미지의 공격을 합니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("상대HP가 0 이되거나 내 HP가 0이되면 게임이 종료됩니다.");
	Thread.sleep(3000);
	System.out.println("");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("10초뒤 설명서가 종료됩니다.");
	System.out.println("==================================");
	Thread.sleep(10000);
	
 * 
 * 
 */
import java.util.Scanner;



public class Main_fight {
public static void main(String[] args) throws InterruptedException {
	Scanner scan = new Scanner(System.in);
	User user =new User();
	Lover lover =new Lover();
	
	
	start_interface();//웰컴 인터페이스 호출
	 guide();//게임설명서 호출
	
	outer:while(true) {
	System.out.print("당신의 이름을 입력하세요:");
	String name_user=scan.next();//유저입력
	user.setName(name_user);
	System.out.print("당신의 애인의 이름을 입력하세요:");
	String name_lover =scan.next();//상대방입력
	lover.setName(name_lover);
	Thread.sleep(2000);
	System.out.println("잠시후 "+lover.getName()+"과의 혈투가 펼쳐집니다.......");
	
	second_start_interface();//카운트다운 호출
	
		while(true) {
			
			Thread.sleep(2000);
			
	user.now_state();//유저현재상태
	lover.now_state();//러버 현재상태
	user.random_num();//스킬입력창
	lover.random_num();//랜덤값 받기
	
	
	
	user.fight(lover.set_attak_Damage());//유저의 공격기술출력,데미지값계산
	lover.fight(user.set_attak_Damage());//러버의 공격기술출력,데미지값계산
	lover.fight(user.set_attak_Damage(),name_user);//상성 별 텍스트 출력
	user.fight(lover.set_attak_Damage(),name_lover);//상성 별 텍스트 출력
	user.royal_plag(lover.name);//유저의 궁국기 발동확률
	lover.royal_plag(user.name);//러버의 궁국기 발동확률
	
	if (user.getHp()==0 && lover.getHp()==0) {//오류방지
		
		System.out.println("동점입니다.둘다 HP를 50회복합니다.");
		Thread.sleep(2000);
		user.plus_hp_50();
		lover.plus_hp_50();
		}
	
	
	if ((user.attack_count<=0&&user.defence_count<=0)&&(lover.attack_count<=0&&lover.defence_count<=0)) {//오류방지 . 스킬을 둘다 모두 사용하였을떄
		if (user.getHp()!=lover.getHp()) {
			if (lover.getHp()>user.getHp()) {//HP가높은 사람이이김
				Thread.sleep(2000);
				System.out.println("스킬모두소진!! HP를 비교합니다.");
				Thread.sleep(2000);
				System.out.println(user.name+"[HP:"+user.getHp()+"]");
				Thread.sleep(2000);
				System.out.println(lover.name+"[HP:"+lover.getHp()+"]");
				Thread.sleep(2000);
				System.out.println(lover.name+"의 승리!!!!");
				Thread.sleep(2000);
				System.out.println("게임종료");
				Thread.sleep(2000);
				ends_interface();
				user.set_firstdata();//초기값 설정
				lover.set_firstdata();
				
				
				continue outer;//돌아감
			}
			if (lover.getHp()>user.getHp()) {
				Thread.sleep(2000);
				System.out.println("====================");
				System.out.println("스킬모두소진!! HP를 비교합니다.");
				Thread.sleep(2000);
				System.out.println("====================");
				System.out.println(user.name+"[HP:"+user.getHp()+"]");
				Thread.sleep(2000);
				System.out.println("====================");
				System.out.println(lover.name+"[HP:"+lover.getHp()+"]");
				Thread.sleep(2000);
				System.out.println("====================");
				System.out.println(lover.name+"의 승리!!!!");
				Thread.sleep(2000);
				System.out.println("====================");
				System.out.println("게임종료");
				Thread.sleep(2000);
				ends_interface();
				user.set_firstdata();//초기값 설정
				lover.set_firstdata();
				
				
				continue outer;//돌아감
			}
		}
		
		if (user.getHp()==lover.getHp()) {//스킬도 모두사용하고 HP도 같을떄
			Thread.sleep(2000);
			System.out.println("====================");
			System.out.println("스킬사용횟수가 두 플레이어 모두 0이고,HP가동일하므로 스킬사용횟수를 3추가합니다.");
			user.attack_count+=3;
			user.defence_count+=3;
			lover.attack_count+=3;
			lover.defence_count+=3;
		}
		
	}
	
	
	if (user.getHp()<=0 ) {//게임종료 탈출문
		Thread.sleep(2000);
		System.out.println("====================");
		System.out.println(lover.getName()+"의 승리!!");
		Thread.sleep(2000);
		System.out.println("====================");
		System.out.println("게임종료");
		Thread.sleep(2000);
		ends_interface();
		user.set_firstdata();//초기값 설정
		lover.set_firstdata();
		
		continue outer;//루프
	}
	
	if (lover.getHp()<=0 ) {
		Thread.sleep(3000);
		System.out.println("====================");
		System.out.println(user.getName()+"의 승리!!");
		Thread.sleep(3000);
		System.out.println("====================");
		System.out.println("게임종료");
		Thread.sleep(2000);
		ends_interface();
		user.set_firstdata();//초기값 설정
		lover.set_firstdata();
		
		
		continue outer;
	}
	
	
		}



	}

}
	
	
	
	
	







public static void  start_interface() throws InterruptedException {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("========Welcome to fight with lover!!!=========");
	Thread.sleep(2000);//게임 소개
	
	
	while(true) {
	System.out.print("게임을 시작할까요?(Y/N):"); //게임 시작여부 질문 Y면 게임진행 N면 게임종료 그외엔 무한루프
	String answer = scan.next();
		if (answer.equals("Y")) {//루프탈출
			
			break;
			}
		else if (answer.equals("N")) {
			System.out.println("게임을 종료합니다.");
			Thread.sleep(2000);
			System.exit(0);
			}
		else {
			System.out.println("잘못입력하셨습니다.");
			Thread.sleep(2000);//무한루프
			}
	
		
		}
	
		
	}

public static void second_start_interface() throws InterruptedException{
	
	
	Thread.sleep(500);
	for(int i =5;i>0;i--) {
		
		System.out.println(i+"!!!!!!!!!");
		Thread.sleep(1000);
	}
	System.out.println("Start!!!!!!");
	
}


 public static  void guide() throws InterruptedException{//게임설명
	
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("안녕하세요.연인과 싸우기 게임에 앞서 게임방식을 설명하겠습니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("이 게임은 자신의 연인/배우자와 싸움을 하는 게임입니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("총 4개의 스킬을 보유하고 있으며 2개의 공격스킬, 2개의 방어스킬을 가지고있습니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("0,1번 스킬인 화내기와,삐지기는 공격스킬입니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("2,3번 스킬인 애교부리기와,선물주기는 방어스킬입니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("화내기와 삐지기를 서로 사용할경우 서로30의 데미지를 줍니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("화내기/화내기 , 삐지기/삐지기 처럼 서로 같은 공격을 사용할경우 20의 피해를 줍니다. ");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("방어스킬은 데미지를 줄순없으며 , 때론 어느정도 공격을 상쇄시켜 경감된 데미지를 받습니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("어느 정도의 확률로 상대 공격을 상쇄시켜 HP회복을 시켜 이득을 볼수 있습니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("공격스킬 사용가능횟수는 6번,방어 사용가능횟수는 4번입니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("만약 두 플레이어 모두 스킬을 전부 소진하였다면 , 그 시점으로부터 HP가 높은 플레이어가 승리합니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("HP까지 같다면 공격횟수와 방어횟수를 동일하게 3회 추가합니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("각 플레이어,컴퓨터는  궁극기를 가지고 있으며, 극악의 확률로 발생합니다. ");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("궁국기 발동시 엄청난 데미지의 공격을 합니다.");
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("상대HP가 0 이되거나 내 HP가 0이되면 게임이 종료됩니다.");
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	System.out.println("==================================");
	System.out.println("10초뒤 설명서가 종료됩니다.");
	System.out.println("==================================");
	Thread.sleep(10000);
	
 }
 
 public static void  ends_interface() throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		System.out.print("게임을 다시 시작할까요?(Y/N):"); 
		String answer = scan.next();
			if (answer.equals("Y")) {//루프탈출
				
				break;
				}
			else if (answer.equals("N")) {
				System.out.println("게임을 종료합니다.");
				Thread.sleep(2000);
				System.exit(0);
				
				}
			else {
				System.out.println("잘못입력하셨습니다.");
				Thread.sleep(2000);//무한루프
				}
		
			
			}
		
			
		}
}



	
	
	

	
	
	
	



