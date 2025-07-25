
public class C0725_07 {

	public static void main(String[] args) {
		// 1차원 배열 25개를 1-25까지 입력하여
		// 랜덤으로 섞어서 출력하시오
		// 1 2 3 4 5 6 7 8 9 .... 25까지 출력 먼저하고
		// 21 1 5 9 30 ... 25개 출력되도록
		
		// 2차원 배열에 랜덤번호를 입력해서
		// 2차원 배열을 출력하시오
		// 21 1 5 9 30
		// 7  6 33 44 45
		
		int[] arr = new int[25];
		int[][] arr2 = new int[5][5];
		// 1-25 생성
		System.out.println("순차 출력: ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		// 숫자 섞기
		int temp=0;
		int rnum = 0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*25);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		// 랜덤 출력
		System.out.println("랜덤번호: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		// 5X5 배열 생성
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr2[i][j] = arr[(5*i)+j];
			}
		}
		// 출력
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		// 1차원 배열
		// 2차원 배열
//		int[][] score = new int[5][5];	//5*3=15
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				score[i][j] = (3*i)+j+1;
//			}
//		}
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		

	}

}
