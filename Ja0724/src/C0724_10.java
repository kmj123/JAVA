import java.util.Scanner;

public class C0724_10 {

	public static void main(String[] args) {
		// 1. 변수 배열 선언
		// 2. 출력 구문 - while(true), switch
		// 3. 입력부분
		// 4. 취소부분 추가
		// 5. 출력부분
		// 6. 프로그램종료 부분
		Scanner scan = new Scanner(System.in);
		
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		
		loop: while(true) {
			System.out.println("[ 학생성적입력프로그램 ]");
			System.out.println("-----------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력해주세요>>(0.종료)");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				System.out.println("-------------------");
				
				no[count] = count+1;
				System.out.printf("%d번 학생 이름을 입력해주세요>>\t",count+1);
				name[count] = scan.next();
				
				for(int i=0;i<score.length;i++) {
					System.out.printf("%s 성적을 입력해주세요",title[i+2]);
					score[count][i] = scan.nextInt();
				}
				total[count] = score[count][0]+score[count][1]+score[count][2];
				avg[count] = total[count]/3.0;
				count++;
				System.out.printf("%d번 학생성적이 저장되었습니다.\n",count+1);
				break;
			case 2: 
				System.out.println("[ 학생성적출력 ]");
				System.out.println("-------------------");
				
				break;
			case 3:
				System.out.println("[ 학생성적수정 ]");
				break;
			case 0: break;
			}
				
		}
		
	}

}
