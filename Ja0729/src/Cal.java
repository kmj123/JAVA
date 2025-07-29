
public class Cal {
//	인스턴스 변수 - 객체 선언 후 사용, 객체 개별 사용, 참조변수명.변수명
	int result;
	
	void calProcess(int a, int b,double[] number) {
		number[0] = a+b; 
		number[1] = a-b; 
		number[2] = a*b; 
		number[3] = a/b; 
	}
	
	// 더하기, 빼기, 곱하기, 나누기
	// void - 리턴 안받음(매개변수를 받아와야함)
	// 리턴할 결과값이 있는 경우 void X -> 타입 변수명/ return 결과값;
	void add(int a, int b) {
		// result - 지역변수; 메서드 내에 있어서
		result = a+b;
		System.out.printf("결과값: "+result);
	}
	
	// minus
	void minus(int a, int b) {
		result = a-b;
		System.out.printf("결과값: "+result);
	}
	// multi
	void multi(int a,int b) {
		result = a*b;
		System.out.printf("결과값: "+result);
	}
	
	//sub
	void sub(int a, int b) {
		double result2 = a/b;
		System.out.println("결과값: "+result2);
	}
}
