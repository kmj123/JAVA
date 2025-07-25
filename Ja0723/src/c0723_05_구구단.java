import java.util.Scanner;

public class c0723_05_구구단 {

	public static void main(String[] args) {
		
		// 1-100까지의 합을 출력하시오
		// 합계가 100이 넘는 시점 
		// 500 넘는 시점 바로 전단계를 출력
		int sum = 0;
		int i =0;
		for(i=1;i<=100;i++) {
			sum+=i;
			System.out.printf("i: %d,sum: %d \n",i,sum);
//			if(sum>=100) break;
			if(sum>=500)break;
		}
		System.out.printf("i: %d,sum: %d \n",i-1,sum-i);
		
//		// 1-10까지 숫자의 합을 출력하시오
//		// 두 수를 입력받아 2,7 2에서 7까지의 합구하기
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요>>");
//		int input = scan.nextInt();
//		System.out.println("숫자2를 입력하세요>>");
//		int input2 = scan.nextInt();
//		
//		int temp = 0;
//		if(input > input2 ) {
//			// 입력 숫자를 바꿔줌
//			temp = input;
//	
//			input=input2;
//			input2 = temp;
//		}
//		
//		int sum =  0;
//		for(int i=input;i<input2;i++) {
//			sum+=i;
//		}
//		System.out.println("합계: "+sum);
	}

}
