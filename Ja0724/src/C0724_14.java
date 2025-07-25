import java.util.Scanner;

public class C0724_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1 차원 배열- > 1-25 순차번호입력
		// 랜덤으로 섞기
		// 2차원 배열 -> [5][5] 랜덤입력 출력
		int[] num = new int[25];
		String[][] arr= new String[5][5];
		
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
		}
		
		int rnum = 0;
		int temp = 0;
		for(int i=0;i<num.length;i++) {
			num[i] = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = num[5*i+j]+"";
			}
		}
		
		while(true) {
			System.out.println();
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			break;
		}
	}

}
