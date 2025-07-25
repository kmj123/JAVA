import java.util.Scanner;

public class C0721_11 {

	public static void main(String[] args) {
		// 이름, 국어점수, 영어점수를 입력받아 이름, 국어, 영어, 합계점수를 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scan.nextInt();
		int result = kor+eng+math;
		double avg = result/3.0;
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("--------------------------------------------");
		System.out.printf("%s \t%d \t %d \t %d \t %d \t %.2f \n",name,kor,eng,math,result,avg);

	}

}
