import java.util.Scanner;

public class C0725_10 {

	public static void main(String[] args) {
		// 학생성적프로그램
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// ---------------
		// 원하는 번호를 입력하세요>>
		
		Scanner scan = new Scanner(System.in);
		
		int[][] score = new int[3][3];
		String[] name = new String[3];
		int[] no = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int count = 0;
		int choice = 0;
		
		while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.print("원하는 번호를 입력하세요>>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[성적입력]");
				System.out.println("---------------------------------------");
				no[count]=count+1;
				System.out.println("이름을 입력해주세요");
				name[count] = scan.next();
				
				for(int i=0;i<score.length;i++) {
					System.out.printf("%s 성적을 입력해주세요\n",title[i+2]);
					score[count][i] = scan.nextInt(); 
				}
				total[count] = score[count][0]+score[count][1]+score[count][2];
				avg[count] = total[count]/3.0;
				count++;
				System.out.printf("%d번 학생성적이 입력되었습니다\n",count+1);
				System.out.println();
				break;
			case 2:
				System.out.println("[성적출력]");
				System.out.println();
				// 상단 출력
				for(int i=0; i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("-----------------------------------------------------");
				// 출력
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for(int j=0; j<score[i].length;j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%d\t",total[i]);
					System.out.printf("%.2f\t",avg[i]);
					System.out.println();
				}
				System.out.println();
				System.out.println();
				break;
				
			case 3:
				System.out.println("[성적수정]");
				System.out.println("---------------------------------------");
				
				System.out.println("찾고자하는 학생의 이름을 입력해주세요>>");
				String search = scan.next();
				int temp = 0;
				
				for(int i=0;i<count;i++) {
					if(search.equals(name[i])) {
						System.out.printf("%s 학생을 찾았습니다. 수정하려는 과목번호를 선택해주세요\n",name[i]);
						System.out.println();
						System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						System.out.println("0.취소");
						System.out.println("--------------------------------------------");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1: case 2: case 3: 
							// 과목선택
							// 변경 전 점수: 
							// 점수입력:
							// 변경 후 점수:
							System.out.printf("현재 점수: %d점 \n",score[i][choice-1]);
							System.out.println("변경할 점수를 입력해주세요>>");
							int input = scan.nextInt();
							score[i][choice-1] = input;
							total[i] = score[i][0]+score[i][1]+score[i][2];
							avg[i] = total[i]/3.0;
							System.out.printf("점수가 변경되어습니다.",score[i][0]); 
							System.out.println();
							break;
						case 0: break;
						}
					}
				}
				
				
				break;
				
			}
		}
		
		
		
	}

}
