
public class C02 {

	public static void main(String[] args) {
//		System.out.printl();	// 컴파일에러 - 자바가 알려줌
		int[] arr = {1,2,3};	
		for(int i=0;i<5;i++) {	// 런타임 에러 - 실행할 때 에러
			System.out.println(arr[i]);		// 배열은 3개 -> 5개 실행 = 에러
		}

		
		// 예외 - 인터넷 프로그램 이상없음, 인터넷 끊김 - 에러: 개발자 잘못이 아닌것 예외
		// 프린트를 진행 프로그램 이상없음, 프린트기가 off - 예외
		// 
	}

}
