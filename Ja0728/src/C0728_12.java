
public class C0728_12 {

	public static void main(String[] args) {
		// 객체선언
		Data d = new Data();
		d.x = 10;
		System.out.println("change메소드 호출 : "+d.x);
		
		// 클래스변수 - 객체 선언 없이 사용, 공통으로 사용가능 클래스명.변수명
		// 클래스 메소드 - 객체 선언 없이 사용, 공용사용, 클래스명.메소드명
		C0728_12.change(d);
		
		System.out.println("change메소드 호출 후 d.x: "+d.x);
		
		
		
	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("x: "+d.x);
	}
}

class Data{
	int x;	// 인스턴스 변수 - 객체선언 후 사용, 객체별 개별 사용, 참조변수명.변수명
}