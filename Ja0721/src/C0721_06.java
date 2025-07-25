
public class C0721_06 {
	public static void main(String[] args) {
		// 오버플로우
		byte b = 127;
		System.out.println("b: "+b);
		b = (byte) (b + (byte)1);	// 127+10 = 137
		// byte -128~127 : 137 숫자는 넣을 수 없음
		// 오버플로우
		System.out.println("b: "+b);
		
		int a = 214783674;
		a = a+3;
		System.out.println("a: "+a);
	}
}
