
public class C0729_11_배열선언_객체선언 {

	public static void main(String[] args) {
		int no = 0;
		
		Stuscore s1 = new Stuscore();
		System.out.println(s1.no);	// 이름
		Stuscore s2 = new Stuscore();
		System.out.println(s2.no);	// 이름
		Stuscore s3 = new Stuscore("이순신",100,100,99);
		System.out.println(s3.no);
		Stuscore s4 = new Stuscore("강감찬",90,90,99);
		System.out.println(s4.no);
		
		// 배열선언
		Stuscore[] stu = new Stuscore[4];	// 배열선언
		stu[0] = new Stuscore();	// stu 0번째 방에 객체를 넣어 객체 선언을 함
		stu[1] = new Stuscore();
		stu[2] = new Stuscore("이순신",100,100,99);
		stu[3] = new Stuscore("강감찬",90,90,99);
//		System.out.println(stu[3].name);
		
//		Stuscore stu = new Stuscore();	// 기존의 객체선언
//		Stuscore stu[0] = new Stuscore();
//		stu[1] = 2;
		
		int[] a = new int[4];
		a[0] = 1;
		a[1] = 2;
	}

}
