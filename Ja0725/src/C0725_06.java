import java.util.Arrays;
import java.util.Scanner;

public class C0725_06 {
	
	public static void main(String[] args) {
		// 배열
		Scanner scan = new Scanner(System.in);
		//
		int[] arr = new int[45];	// 랜덤번호 45개
		int[] lotto = new int[6];	// 로또번호 6개
		int[] myNo = new int[6];	// 입력번호 6개
		int[] okNo = new int[6];	// 정답번호 6개
		int count = 0;				// 정답 개수
		
		for(int i=0;i<6;i++) {
			System.out.println("입력된 번호: "+Arrays.toString(myNo));
			System.out.println("1-45까지 번호를 입력하세요>>");
			myNo[i] = scan.nextInt();
		}
		
		
		// 배열 번호입력
		for(int i=0;i<45;i++) {
			arr[i] = i+1;
		}
		// 랜덤섞기
		int temp = 0;	// 임시저장번호
		int rnum = 0;		// 랜덤번호
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		// 배열 복사 메소드
		System.arraycopy(arr, 0, lotto, 0, 6);
		
		// 배열번호출력
		System.out.println("로또번호: ");
		for(int i=0;i<6;i++) {
			System.out.printf(lotto[i]+" ");
		}
		
		
		
		
//		for(int i=0;i<45;i++) {
//			if(i==0) {
//				System.out.print(arr[i]+"\t");
//				continue;
//			}
//			else if(i%5== 0) {
//				System.out.println();
//			}
//			System.out.print(arr[i]+"\t");
//		}
		
		
		
		
		
//		int rnum = (int)(Math.random()*45)+1;
		
		//0*10<=x*10 < 1*10
		// (int)0<= (int)(x*10) <(int)10
		// (int)0<= (int)(x*10) <(int)10
		// (int)0+1<= (int)(x*10)+1 <(int)10+1
		// 1 <= (int)<x=10<=10
//		
//		int a = (int)(Math.random*10)+1;
//		int a_2 = (int)(Math.random*100"+1;
//		double a = Math.random();
//		System.out.println(a);
		
		
		// 퀴즈
		// 1-45개 배열을 생성해서 1-45까지의 숫자를 입력하시오
//		int[] arr = new int[45];
//		for(int i=0;i<=45; i++) {
//			arr[i]=i+1;
//		}
//		
//		for(int i=0;i<5;i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		
//		int[] arr = {1,2,3,4,5}; // 배열 선언 직접입력
//		int [] arr= new int[] {1,2,3,4,5};
//		for(int i=0; i<5;i++) {
//			System.out.println(arr[i]);
//		}
	}
}
