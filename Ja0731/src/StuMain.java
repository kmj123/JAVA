import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		String name = null;
		int no,kor,eng,math,toal = 0;
		double avg = 0;
		String [] title = {
				"번호","이름","국어","영어","수학","합계","평균","등수"
				};
//		Stuscore[] s = new Stuscore[10];
		Stuscore s = null;
		
		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 등수처리");
			System.out.println("6. 이름정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------");
			System.out.println("원하는 번호를 입력하세요>> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:	// 성적입력 - 이름, 국어, 영어, 수학 수동입력 -> 번호, 합계, 평균 자동입력
				System.out.printf("%d번째 학생 이름을 입력하세요 \n", list.size()+1);
				name = scan.next();
				System.out.println("국어점수를 입력하세요>>");
				kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요>>");
				eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요>>");
				math = scan.nextInt();
				// 컬렉션 저장
				list.add(new Stuscore(name,kor,eng,math)); 
				System.out.printf("%s 학생성적이 저장되었습니다.\n",name);
				break;
			case 2: 
				System.out.println("		      [ 학생성적 출력 ]"); 	
				System.out.printf(""
						+"%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
						title[0],title[1],title[2],title[3],title[4],
						title[5],title[6],title[7]
						);
				System.out.println("----------------------------------------------------------------");
				for(int i=0;i<list.size();i++) {
					s = (Stuscore)list.get(i);	//Object- > Stuscore
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							s.getNo(),s.getName(),s.getKor(),s.getEng(),
							s.getMath(),s.getTotal(),s.getAvg(),s.getRank()
							);
				}
				break;
			case 3: 
				break;
			}
			
		}	// while

		
	}

}
