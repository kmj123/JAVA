
public class C0730_01 extends Point {
	
//	int x;	// 인스턴스 변수 - 객체선언 후 사용, 개별사용, 참조변수명.변수명
//	int y;
	int z;
	
	public static void main(String[] args) {	
		// 객체선언
		C0730_01 c = new C0730_01();
		System.out.println("x: "+c.x);	// 상속을 받아서 x 출력가능
		System.out.println("z: "+c.z);
		
		c.x = 100;
		c.add();
	}
}
