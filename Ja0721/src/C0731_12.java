
public class C0731_12 {

	public static void main(String[] args) {
		System.out.printf("[%5d]\n",12);
		System.out.printf("[%05d]\n",12);
		
		int a = 5;
//		a++;
//		++a;
//		System.out.println("a: "+(++a));	// 6
		System.out.println("a: "+(a++));	// 5
		System.out.println("----------");
		System.out.println(a);	// 증감연산자는 따로 빼서 만들야함
		
		char ch = 65;	// 65: A, 97: a, 48: 0;
		System.out.println("ch: "+ch);
		System.out.println("ch+1: "+(char)(ch+5));
		System.out.println("ch: "+ch);

	}

}
