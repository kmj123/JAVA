import java.util.Scanner;

public class C0722_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 랜덤 숫자 1-100까지 랜덤숫자를 출력하시오
		int rnum = (int)(Math.random()*3)+1;
		// 가위 - 1, 바위 -2 ,보 -3
		// 1-3, 2-1, 3-2 ; 승리
		// 1-1, 2-2, 3-3 ; 무승부
		// 1-2, 2-3, 3-1 ; 패배
		// if문을 사용해서 가위바위보 게임을 완성하시오
		System.out.println("[ 가위바위보 게임 ]");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요>>");
		int choice = scan.nextInt();
		
		String my ="";
		String you="";
		

		// switch문으로 출력
		switch(rnum-choice) {
		case 0 :
			System.out.println("무승부");
			break;
		case 1: case -2:
			System.out.println("승리");
			break;
		case 2: case -1:
			System.out.println("패");
			break;
		}
		
		switch(choice) {
		case 1:
			my ="가위";
			break;
		case 2:
			my="바위";
			break;
		case 3:
			my="보";
			break;
		}
		switch(rnum) {
		case 1:
			you ="가위";
			break;
		case 2:
			you="바위";
			break;
		case 3:
			you="보";
			break;
		}
		System.out.println("랜덤: "+you);
		System.out.println("선택: "+my);
	}

}
