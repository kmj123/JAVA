
public class C0722_03 {

	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		// byte, short,chart 사칙연산시 -> int 
		// char+int=> int	97+1 => 98(b)	
		char c3 = (char)(c1 + 1);	
		System.out.println(c3);
		char c4 = ++c1;	// 증감연산자 사용시 타입 변경 안해도 됨
		System.out.println(c4);
		
		int i = 'B'-'A';
		System.out.println(i);	// 98-97=1
		int i2 = 'b'-'a';
		System.out.println(i2);	// 98-97=1
		
		// 문자 -> 숫자로 변경하고싶은 경우 -'0' 
		int i3 = '1'-'0';		
		System.out.println(i3);
		int i4 = '3'-'0';
		System.out.println(i4);
		int i5 = '9'-'0';
		System.out.println(i5);
		
		// 숫자 -> 문자열로 변경하려면 +""
		int n = 5;
		String s = n+"";
		
	}

}
