
public class Shape {
	String sname;
	String color = "blue";
	void draw(String sname,Point p) {
		System.out.println(sname+" 도형의 그림을 그립니다.");
		System.out.printf("[ 좌표: %d,%d ]\n",p.x,p.y);
		// 하단으로 그림을 그리는 로직
		// ...
	}
	
	// 위와 완전히 다른 메소드 - 오버로딩(메서드명은 같고 매개변수타입 혹은 객체가 다른것)
	void draw(String sname,Point[] p) {
		System.out.println(sname+" 도형의 그림을 그립니다.");
		for(int i=0;i<p.length;i++) {
			System.out.printf("[ 좌표: %d,%d ]\n",p[i].x,p[i].y);
		}
		// 하단으로 그림을 그리는 로직
		// ...
	}
}
