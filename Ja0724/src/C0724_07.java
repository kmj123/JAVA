import java.util.Scanner;

public class C0724_07 {

	public static void main(String[] args) {
		// 이름,국어,영어,수학 점수를 입력받아 출력하시오
		// 1. 변수 배열 선언 - name,score,total,avg
		// 2. 값입력 - 이름
		// 3. score 값 입력 - 국어,영어,수학
		// 4. total, avg 값 입력
		// 5. 출력
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		for(int i=0;i<score.length;i++) {
			System.out.println("이름을 입력해주세요");
			name[i] = scan.next();
			for(int j=0;j<score[i].length;j++){
				System.out.printf("%d번째 점수를 입력해주세요",i+1);
				score[i][j] = scan.nextInt();
				total[i] = score[i][0]+score[i][1]+score[i][2];
			}
			avg[i] = total[i]/3.0;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-------------------------------------------");
		for(int i=0; i<score.length;i++) {
			System.out.printf("%s\t",name[i]);
			for(int j=0; j<score[i].length;j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("%d\t",total[i]);
			System.out.printf("%.2f\t",avg[i]);
			
			System.out.println();
		}

	}

}
