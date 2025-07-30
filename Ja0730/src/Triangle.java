
public class Triangle extends Shape {
	String sname = "Triangle";
	Point[] p;	//  배열 참조 변수, 주소값만 존재(저장공간은 아직 미생성)
//	p[0] = 3;	// 저장소를 따로 생성해줘야함
	
	// 기본생성자
	Triangle(){
		
	}
	Triangle(Point[] p){
		this.p = p;
	}
	
	Triangle(Point p1, Point p2, Point p3){
		p = new Point[]{p1,p2,p3};
	}
	
	
	
}
