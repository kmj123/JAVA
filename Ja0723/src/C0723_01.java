import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {
		int a = 10;
		float f = 10.0f;
		double d = 10.0;
		
		// 숫자입력 받아
		Scanner scan = new Scanner(System.in);
		
		//
		System.out.println("[ 덧셈 프로그램 ]");
		System.out.println("1. 21억이하 덧셈 ");
		System.out.println("2. 21억이상 덧셈 ");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요");
		int choice = scan.nextInt();	// nextChar빼고 다있음(=>charAt(0)로 사용)
		
		System.out.println("숫자1을 입력하세요");
		int num = scan.nextInt();
		System.out.println("숫자2을 입력하세요");
		int num2 = scan.nextInt();
		
		switch(choice) {
		case 1:
			int total = num+num2;
			System.out.println("결과: "+total);
			break;
		case 2: 
			long total2 = (long)num+num2;
			System.out.println("결과: "+total2);
			break;
		default:
			break;
		}
		
		
//		System.out.println("숫자를 입력하세요");
//		int input = scan.nextInt();
//		System.out.println("숫자2를 입력하세요");
//		int input2 = scan.nextInt();
//		
//		long total = (long)input+input2;
////		Integer.parseInt(null)
//		
//		System.out.println("입력숫자: "+input);
//		System.out.println("입력숫자2: "+input2);
//		System.out.println("합계: "+total);
//		

	}

}
