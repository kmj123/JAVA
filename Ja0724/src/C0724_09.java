import java.util.Scanner;

public class C0724_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수 배열선언
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0; //입력된 학생수
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int choice = 0;	// 선택번호
		int input =0;
		
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("----------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.(0.종료)>> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				
				no[count] = count+1;       //번호입력
				System.out.printf("%d번 학생이름을 입력하세요.(0.취소) >> \n",count+1);
				name[count] = scan.next(); //이름입력
				// 취소부분
				if(name[count].equals("0")) {
					System.out.println("이전화면으로 이동합니다.");
					System.out.println();
					break;
				}
				
				// 국어,영어,수학입력
				for(int i=0;i<score.length;i++) {
					System.out.printf("%s 점수를 입력하세요.>> \n",title[i+2]);
					score[count][i] = scan.nextInt();
				}
				total[count] = score[count][0]+score[count][1]+score[count][2];
				avg[count] = total[count]/3.0;
				System.out.printf("%d 번 학생성적이 저장되었습니다.\n",count+1);
				count++;
				System.out.println();
				break;
			case 2:
				System.out.println("[ 학생성적출력 ]");
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("---------------------------------------------------------");
				// 학생수만큼 출력
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for(int j=0;j<score[i].length;j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%d\t",total[i]);
					System.out.printf("%.2f\t",avg[i]);
					System.out.println();
				}
				System.out.println();
				System.out.println();
				break;
			case 3: // 학생성적수정	
				System.out.println("[ 학생성적수정 ]");
				System.out.println("찾고자 하는 학생이름을 입력하세요>>");
				String search = scan.next();
				int temp = 0;
				for(int i=0;i<count;i++) {
					if(search.equals(name[i])) {
						System.out.printf("%s 학생을 찾았습니다.\n",name[i]);
						
						System.out.println("[ 점수수정 ]");
						System.out.println("-----------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("0. 취소-이전화면 이동");
						System.out.println("------------------");
						System.out.println("원하는 번호를 입력하세요>>");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1: case 2: case 3: 
							// 현재국어점수: 100
							// 변경점수를 입력하세요
							// 점수가 변경되었습니다
							System.out.printf("현재 국어점수:%d \n ",score[i][0]);
							System.out.println("변경점수를 입력하세요>>");
							input = scan.nextInt();
							score[i][choice-1] = input;
							total[i] = score[i][0]+score[i][1]+score[i][2];
							avg[i] = total[i]/3.0;
							System.out.printf("%d으로 점수가 변경되었습니다.\n",score[i][0]);
							System.out.println();
							
							break;
						case 0: 
							System.out.println("점수변경을 취소했습니다.");
							break;
						}
						
						temp=1;	// 학생 존재
					}
				}	// for
				
				if(temp==0) {
					System.out.printf("%s 찾고자 하는 학생이 없습니다.\n",search);
					System.out.println();
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;
			}//switch
			
		}//while
		
		
		
	}//main

}//class