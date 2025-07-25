
public class C0721_04 {
	public static void main(String[] args) {
		boolean power = true;
		char ch = 'A';
		char ch2 = '\u0061';	// u: 16진수를 의미, 16*4+1*1 = 65
		char ch3 = 55;			// 아스키코드 참조
		char tab = '\t';
		char enter = '\n';
		System.out.println("power : "+power);
		System.out.println("ch : " + ch);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		System.out.println("aaa"+tab+ch3+tab+"bbb");
		System.out.println("aaa"+enter+"bbb");
		System.out.println("aaa\t\tbbb");
		
		byte b = 127;
		System.out.println("byte:"+b);
		
		int hex = 0x100;	// 0x = 16진수 16*16*1
		System.out.println("hex: "+hex);
		
		int oct = 0100;		// 0 = 8진수 아무것도 앞에 안붙어있으면 10진수
		System.out.println("oct: "+oct);
		
		long l = 1000000000L;
		float f = 3.14f;
		double d = 3.14;
		double d2 = 3.13D;
		double d3 = 3.14d;
		
		double d4 = 100;
		System.out.println("d4 :"+d4);
		
	}

}
