import java.util.Scanner;

public class C0722_08 {

	public static void main(String[] args) {
//		// if, switch = 조건문, for, while - 반복문
		Scanner scan = new Scanner(System.in);
		String jumin = "880101-1011111";
		String jumin2 = "991231-2011111";
		
		// 남자, 여자인지
		// abc->c input.charAt(2)
		System.out.println("주민번호를 입력하세요");
		String Jumin = scan.next();
		char ch = Jumin.charAt(7);
		if(ch =='1') {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
		
//		int num = 5;
//		if(num%2==0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
//		
//		
////		final int MAX = 10;
////		MAX = 5;
//		
	}

}
