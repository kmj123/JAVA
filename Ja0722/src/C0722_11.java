import java.util.Scanner;

public class C0722_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요>>");
//		int input = scan.nextInt();
		
//		// 랜덤 숫자 1-100까지 랜덤숫자를 출력하시오
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
		String my = "";
		String you = "";
		
		if(rnum==1) {
			you="가위";
		}else if(choice ==2) {
			you ="바위";
		}else {
			you="보";
		}
		
		if(choice==1) {
			my="가위";
		}else if(choice ==2) {
			my ="바위";
		}else {
			my="보";
		}
		
		// 승리, 무승부, 패 출력
		if(choice-rnum==-2 || choice-rnum==1) {
			System.out.println("승리");
		} else if(choice-rnum==0) {
			System.out.println("무승부");
		} else {
			System.out.println("패배");
		}
		System.out.println("랜덤: "+you);
		System.out.println("선택: "+my);
		
		
		
//		// 랜덤 숫자 1-100까지 랜덤숫자를 출력하시오
//		int rnum = (int)(Math.random()*3)+1;
//		if(input == rnum) {
//			System.out.println("정답");
//		} else {
//			System.out.println("오답");
//		}
//		System.out.println("랜덤숫자: "+rnum);
		
		
		// 0.0 <= Math.random() < 1	:1은 나오지 않음 
		// 0.0*10 <=Math.random*10 < 1*10
		// 0+1 <= x+1 < 10+1
		// 1<= x <11
		// 0.8513643175907983 -> 0.8 : 8
//		System.out.println((int)(Math.random()*100)+1);	// 1 <= x = 10
//		System.out.println(Math.floor(Math.random()*10));
		
		
//		boolean power = false;
//		if (!power) {
//			power = true;
//		}
		
		
//		System.out.println("문자를 입력하세요>>");
//		String input = scan.nextLine();	// enter키 문자로 인식, 입력으로 받음
////		String input = "";
//		char ch = ' ';
//		if(input != null && !input.equals("")) {	
//			ch = input.charAt(0);
//		}
//		System.out.println("출력: "+ch);
	}

}
