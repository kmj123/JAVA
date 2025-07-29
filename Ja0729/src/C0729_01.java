import java.util.Scanner;

public class C0729_01 {

	public static void main(String[] args) {
		// 다른클래스 사용시 - 객체 선언 후 사용
		Cal cal = new Cal();
		Scanner scan = new Scanner(System.in);
		int a = 10;
		int b = 5;
		System.out.println("[ 두 수 계산프로그램 ]");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("5. 결과값 리턴");
		System.out.println("--------------");
		System.out.println("원하는 번호를 입력하게요>>");
		int choice = scan.nextInt();
		int result = 0;
		double result2 = 0;
		double[] number = new double[4];
		
		switch(choice) {
		case 1:
			cal.add(a, b);
			break;
		case 2:
			cal.minus(a, b);
			break;
			
		case 3:
			cal.multi(a, b);
			break;
			
		case 4: 
			cal.sub(a, b);
			break;
		
		case 5:
			// a,b 배열 number 매개변수
			// 더하기, 빼기, 곱하기, 나누기
			// 결과값을
			// 여기에서 출력
			// 더하기: 15
			// 빼기: 5
			// 곱하기: 50
			// 나누기: 2.0
			cal.calProcess(a, b, number);
			System.out.println("더하기: "+(int)number[0]);
			System.out.println("빼기: "+(int)number[1]);
			System.out.println("곱하기: "+(int)number[2]);
			System.out.println("나누기: "+number[3]);
			break;
			
			
		}
		
	}

}
