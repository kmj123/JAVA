import java.util.Scanner;

public class C0724_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"국어","영어","수학"};
		
		System.out.println();
		
		for(int i=0; i<score.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요>>\n",i+1);
			name[i] = scan.next();
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%d번째 점수를 입력하세요>>",i+1);
				score[i][j] =  scan.nextInt();
				total[i] += score[i][j];
			}
//			total[i] = score[i][0]+score[i][1]+score[i][2];
			avg[i] = total[i]/3.0;
		}
		
		// 출력
		// 이름 국어 영어 수학
		// 홍길동 100 100 99
		System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("------------------------------------");
		for(int i=0; i<score.length;i++) {
			// name
			System.out.printf("%s\t",name[i]);
			for(int j=0;j<score[i].length;j++) {
				// score
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("%d\t",total[i]);
			System.out.printf("%.2f\t",avg[i]);
			
			System.out.println();
		}
		
		
		// 5,5 배열
		// 1 2 3 4 5 
		// 6 7 8 9 10
		// ...
		// 21 22 23 24 25
//		int[][] num = new int[5][5];
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				num[i][j] = 5*i+j+1;
//			}
//		}
//		for(int i=0; i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				System.out.print(num[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		int[][] score = new int[5][3];
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = 3*i+j;	// 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14(15개)
//			}
//		}
//		for(int i=0; i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//		}
//		int[] num = new int[5];
//		for(int i=0;i<num.length;i++) {
//			num[i] = i;	//	0,1,2,3,4
//		}
	}

}
