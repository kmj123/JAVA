
public class C0722_01 {

	public static void main(String[] args) {
		boolean a = true;
		boolean a_2 = false;
		byte b = 1;
		short c = 1;
		char d = 'a';	// a: ASCII 97, A: ASCII 65, 0: ASCII 48
		char d_2 = 65;
		char d_3 = 'A';
		char d_4 = ' ';
//		char d_5 = '';		// 에러
//		char d_6 = 'ab';	// 에러 1개만 가능
//		char d_7 = "a";		// 에러 작은 따표만 가능
		int e = 1;
		long f = (long)1;
		long f_2 = 1;
		long f_3 = 1L;
		long f_4 = 1l;
		float g = 1.1f;
		float g_1 = 1.1F;
		double h = 1.1;
		double h_2 = 1.1d;
		double h_3 = 1.1D;
		String s = "";
		String s_2 = " ";
		String s_3 = "a";
		String s_4 = "ab";
		
		// 타입 변환
		String k = "1";		// 타입: 문자열 타입 - String 타입, 문자열 변수
		String k_2 = "10.5";
		int num = Integer.parseInt(k);			// String -> 정수형으로 타입 변환됨
		double num2 = Double.parseDouble(k_2);	// String -> 실수형 변환
		
		double m = 1.2;
		int num3 = (int) m;		// 정수형은 소수점이 없음
		System.out.println("num3: "+num3);
	}

}
