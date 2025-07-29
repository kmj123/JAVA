
public class Car2 {
	String color;	// 인스턴스 변수
	String geatType;
	int door;
	int door_size;
	
	// 생성자 - 인스턴스 초기화 메소드, 클래스명과 동일, 리턴없음(void X)
	Car2(){}
	
	// 생성자
	Car2(String color, String gearType, int door){	// 지역변수
		this.color = color;
		this.geatType = geatType;
		this.door = door;
	}
}
