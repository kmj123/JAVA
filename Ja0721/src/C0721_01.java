
public class C0721_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		System.out.println("자바시작");
		
		// ------------------
		// 변수 타입 8개: 
		// 문자열 char 논리형 boolean 정수형(byte, shrot, *int, long) 실수형(float, *double) 

		// 실수형 - float, double
		// 소수점의 유효성, float - 8자리, double - 15자리
		// 1.1234567 890 1.123456789012345 6789 6000
		// 지수는 무조건 실수만 가능
		float f = 1.1F; // float타입 - 접미사 F,f 
		double d = 1.1; // double타입 - 접미사 생략 가능 D,d 
		
		// 정수형 - byte, short, int, long 4가지
		// int -21억까지 가능
		// byte - 127까지 숫자 표현 가능
		// short - 32000정도까지  숫자표현 가능
		int i = 10;
		int i2 = 2000;
//		int i = 2200000000;				// 에러 - 21억 까지만 가능
		long h = 2200000000000000000L;	// 900경까지 숫자표현 가능
		long h2 = 5L;					// 약 21억 이상부터는 L 표기 필요, 이하는 자동 형변환
		long h3 = -2222222222222222222L;
		
		
		// boolean
		boolean b = true;			// True X 소문자만 가능
		boolean b2 = false;
//		boolean b3 = 'a';			// 에러 - true, false만 가능
		
		
		// char
		char c = 'A';
		char c2 = 'B';
		System.out.print(c);
		System.out.print(c2);
		String str = "AB";
		System.out.println(str);	// 문자열 변수
		// char a = "A"; 			// 에러 - 문자형은 무조건 ' ' 로 입력
		// char a = 'AB';			// 에러 - 문자느 1개만 가능
	}

}
