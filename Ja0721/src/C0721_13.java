
public class C0721_13 {
	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		long c = (long)a*b;
		System.out.println("c: "+c);	// 2000000000
		
		int d = 1000000;
		int e = 1000000;
		int f = (int)((long)d * e / e);
//		int f = (int)((long)d * e);		// 오버플로우 에러
		System.out.println("f: "+f);
		int g = d / e * e;
		System.out.println("g: "+g);
	}
}
