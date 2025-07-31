import java.util.ArrayList;
import java.util.Scanner;

public class C10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		String name;
		int kor,eng,math,total;
		double avg;
		int rank;
		String[] title = {
				"번호","이름","국어","영어","수학","합계","평균","등수"
		};
		
		Stuscore s;
		int count = 0;
		int no = ++count;
		
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();

		switch(choice) {
		case 1:
			System.out.printf("%d 번째 학생 이름을 입력해주세요>>",no);
			name = scan.next();
			System.out.printf("국어성적을 입력해주세요>>");
			kor = scan.nextInt();
			System.out.printf("영어성적을 입력해주세요>>");
			eng = scan.nextInt();
			System.out.printf("수학성적을 입력해주세요>>");
			math = scan.nextInt();
			list.add(list);
			System.out.printf("%s 학생성적이 저장되었습니다.",name);
			break;
		case 2: 
			System.out.println("[ 학생성적 출력 ]");
			System.out.println("-----------------------------------------------");
			System.out.printf("");
			
			break;
		
		
		
		}

	}
}
