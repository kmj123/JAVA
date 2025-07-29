
public class MyMath {

	static long c; 	// 클래스 변수 - static, 클래스 내 선언
	long a, b;	// 인스턴스 변수 - 자동 초기화됨
	
	long add() {	// 인스턴스 메소드 - static 없음
		int d=0; // 지역변수, 값을 해야함. 자동초기화 안됨
		System.out.println(d);
		return a+b;
	}
	
	static long add(long a, long b) {	// 클래스 메소드 - static 있음.
		return a+b;
	}
}
