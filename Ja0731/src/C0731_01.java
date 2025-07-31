import java.util.Scanner;

public class C0731_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 객체선언
		// 이름을 추가하고싶으면 기본생성자에 매개 변수를 추가하면 된다.
		Buyer b1 = new Buyer("aaa","홍길동",10000000,0);
		System.out.printf("%s 님 로그인 성공!\n",b1.name);
		System.out.printf("현재 잔액: %,d\n",b1.money);
		System.out.printf("현재 보너스포인트: %d\n",b1.bonusPoint);
		
		while(true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. TV - 1000000");
			System.out.println("2. AUDIO - 500000");
			System.out.println("3. COMPUTER - 1500000");
			System.out.println("4. 구매내역 확인");
			System.out.println("5. 현재 보유금액");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요>>");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("TV를 구매했습니다.");
				b1.buy(new Tv());
				System.out.printf("현재 잔액: %,d\n",b1.money);
				break;
			case 2: 
				System.out.println("AUDIO를 구매했습니다.");
				b1.buy(new Audio());
				System.out.printf("현재 잔액: %,d\n",b1.money);
				break;
			case 3: 
				System.out.println("COMPUTER를 구매했습니다.");
				b1.buy(new Computer());
				System.out.printf("현재 잔액: %,d\n",b1.money);
				break;
			case 4:
				System.out.println("[ 구매내역 ]");
				for(int i=0;i<b1.list.size();i++) {
					System.out.printf("%s: %d \n",
							((Product)b1.list.get(i)).name,
							((Product)b1.list.get(i)).price);
				}// case 4: for문
				System.out.println();
			case 5: 
				System.out.println("[ 현재 보유금액 ]");
				System.out.printf("금액: %,d\n",b1.money);
				System.out.println();
				break;
			}	// switch
			
		}	// while
	}// main
}// class
