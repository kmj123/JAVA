import java.util.ArrayList;

public class C0801_06 {

	public static void main(String[] args) {
		
		// wrapper클래스 - 8가지 기본타입의 객체타입을 말함
		// 자바 - 객체지향 언어
		// boolean,char,byte,short,int,long,float,double - 객체가 아님
		ArrayList list = new ArrayList();	// 객체타입만 가능
		int a = 10;
		list.add(a); //가능 -> 자동으로 객체형 변환 int -> Integer 형변환
		System.out.println(list.get(0));
		
		Student s = new Student(1,"홍길동");
		System.out.println(s.getName());
		list.add(s);	// -> object형태로 존재
		// object에는 getName이라는 형태가 없기때문에 Student로 형변환을 시켜줘야함
		System.out.println(((Student)list.get(1)).getName());
		
		
		
//		// Math클래스
//		// 1,2,3 최대값 출력
//		int a = 100;
//		int b = 50;
//		int c = 90;
//		System.out.println(Math.max(a, Math.max(b, c)));
//		System.out.println(Math.min(a, Math.max(b, c)));
		
		
		
//		Math.random();
//		Math.round()-반올림,Math.floor(0)-버림,Math.ceil(0)-올림;
//		Math.abs(a); // 절대값
//		System.out.println(Math.pow(10, 3)); // 10*10*10
		
		// StringBufferm 클래스
//		StringBuffer sb = new StringBuffer("abc");
//		System.out.println(sb);
//		
//		sb.append("123");
//		System.out.println(sb);
//		
//		StringBuffer str = new StringBuffer("가");
//		for(int i =0;i<100;i++) {
//			System.out.println(str.append(i));
//		}
		
		
		//
//		String a = "가";
//		for(int i =0;i<100;i++) {
//			a = a+i;
//		}
//		System.out.println(a);	// 결과값 1개
		
		
//		int a = 10;
//		String str = ""+a;
		
//		String str = "16조12345";
//		// 123만 출력
//		// subString - 부분으로 가져오기
//		System.out.println(str.substring(3,6));
//		System.out.println(str.substring(0,2));
//		System.out.println(str.substring(3));
//		
//		String[] strArr = {"abc123","a12","bc2345"};
//		// 처음부터 제일뒤에서 1칸 앞까지 출력하시오
//		for(int i=0;i<strArr.length;i++) {
//			System.out.println(strArr[i].substring(0,strArr[i].length()-1));
//		}
		
		// 조를 출력
		// charAt() 괄호안 위치에 위치한 문자열을 가져옴
//		System.out.println(str.charAt(2));
		
		
		// startsWith	/	endsWith
//		String str = "abc.txt";
//		System.out.println(str.startsWith("ab"));
		

	}

}
