
public class C0728_03 {

	public static void main(String[] args) {
		// Stuscore 객체  - 홍길동 100 100 100
		// 객체 선언 - 유관순 90 90 91
		Stuscore s = new Stuscore();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 100;
		s.total = s.kor+s.eng+s.math;
		System.out.printf("%s\t%d\t%d\t%d\t%d\n",s.name,s.kor,s.eng,s.math,s.total);
		
		Stuscore s2 = new Stuscore();
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.math = 91;
		s2.total = s.kor+s.eng+s.math;
		System.out.printf("%s\t%d\t%d\t%d\t%d\n",s2.name,s2.kor,s2.eng,s2.math,s2.total);
		
		s2 =s;
		s.name = "이순신";
		System.out.printf("%s\t%d\t%d\t%d\t%d\n",s2.name,s2.kor,s2.eng,s2.math,s2.total);

	}

}
