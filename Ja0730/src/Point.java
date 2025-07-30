
public class Point extends Object {
	int x;	// 인스턴스 변수 - 객체 선언 후, 개별, 참조변수명.변수명
	int y;
	
	Point(){
		this(0,0);	// this() : 다른 생성자
	}
	
	Point(int x, int y){
		super();
		this.x = x;	// this. : 인스턴스 변수 지칭
		this.y = y;
	}
	
	void add() {
		System.out.println(x+y);
	}
}
