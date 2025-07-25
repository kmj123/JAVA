
public class C0721_07 {
	public static void main(String[] args) {
		int a = 7000000;
		int result = 7000000 * 7000000 / 7000000;
		// 49,000,000,000,000	-> 21
		System.out.println("result: "+result);
		
		int result2 = 7000000 / 7000000 * 7000000;
		System.out.println("result2: "+result2);
		
		int n = 65;
		System.out.println("n : "+n);
		char ch = (char) n;
		System.out.println(ch);
		
		// 강제 형변환(Casting) - 앞에 타입을 반드시 붙여야함
		float f = 1.6f;
		System.out.println("f: "+f);		// 1.6
		int num = (int)f;
		System.out.println("num: "+num);	// 1
		float f2 = num;				// 자동형변환 - 앞에 타입을 안붙여도 됨
		System.out.println("f2: "+ f2);		// 1.0
		
		
	}
}
