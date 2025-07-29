
public class RanNum {
	static int[] arr = new int[10];	// 클래스 변수 - 객체선언X, 공용O, 클래스명.변수명
	int a; 							// 인스턴스 변수 - 객체선언O, 개별사용, 참조변수명.변수명
	
	// 클래스 초기화 블럭 - 객체 선언 없이 바로 실행
	static {
		for(int i=0;i<RanNum.arr.length;i++) {
			RanNum.arr[i] = (int)(Math.random()*10)+1;
		}
		
	}
	
}


