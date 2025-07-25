
public class C0721_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 리터럴(값 그자체) - 50, 200, 1000
		// 변수 - 중간에 값 변경 가능
		int a = 10;
		a = 20;
		a = 50;
		System.out.println("a : "+a);
		int b = 100;
		b = 200;
		System.out.println("b : " + b);
		
		// 상수
		final int C = 1000;
//		C = 2000;	// 에러 - 상수는 중간에 값 변경 불가능
		System.out.println("C : "+ C);
		
		//
		int d = a+b;
		System.out.println("d: " +d);

	}
	
}
