
public class C0725_01 {

	public static void main(String[] args) {
		// 변수사용
		int a = 10;
		String str = new String("abc");	// 대입연산자 사용
		// 참조형변수, 참조변수
		String str2 = "abc";
		
		// Tv class 사용법
		// 객체선언 - 인스턴스선언
		Tv t = new Tv();
		t.color = "white";
		t.channel = 7;
		t.channelUp();
		System.out.println("현재채널:"+t.channel);
		
		Tv t2 = new Tv();
		t.color = "pink";
		t.channel = 5;
		System.out.println("현재채널: "+t2.channel);
		
		// 객체 선언
		Stuscore  s= new Stuscore();
		
		
//		Tv t2 = new Tv();
//		Tv t3 = new Tv();
//		Tv t4 = new Tv();
	}

}
