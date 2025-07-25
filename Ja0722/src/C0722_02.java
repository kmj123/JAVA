import java.util.Scanner;

public class C0722_02 {
	
	// 함수, 메소드 - main()함수
	public static void main(String[] args) {
		// input("숫자를 입력하세요")
		// 입력받을려면
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scan.next();	// nextLine() - 문자열 입력받음
		System.out.println("국어점수를 입력하세요>>");
		// nextByte(),nextShort(), nextLong(), nextInt(), nextFloat(), nextDouble(), next(),nextInt()...
		int kor = scan.nextInt();	
		int math = scan.nextInt();
		int eng = scan.nextInt();
		int total = kor+eng+math;
		double avg = total/3d;
		
		System.out.println("이름: "+name);
		System.out.println("국어점수: "+kor);
		System.out.println("수학점수: "+math);
		System.out.println("영어점수: "+eng);
		System.out.println("합계: "+total);
		System.out.printf("평균: %.1f \n",avg);	// %d-정수,%s-문자열,%f-실수,%c-문자
		System.out.printf("%s,%d,%d,%d,%d,%.2f \n",name,kor,eng,math,total,avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n",name,kor,eng,math,total,avg);
	}

}
