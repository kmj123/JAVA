
public class Tv {
	// 변수 - 초기값이 자동으로 들어감
	String color;	// 변수
	boolean power;	// 변수
	int channel;	// 변수 
	
	// 함수-메소드
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
