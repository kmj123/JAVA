import java.util.Scanner;

public class C0723_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rnum = (int)(Math.random()*10)+1; //1-10까지 랜덤숫자 생성
		
		for(int i=0;i<5;i++) {
			//System.out.println(i);
			// 숫자 맞추기 프로그램
			
			System.out.printf("%d 번째 숫자를 입력하세요.>>",i+1);
			int input = scan.nextInt();
			if (rnum==input) {
				System.out.printf("정답 : %d, 입력값 : %d \n",rnum,input);
			    break;
			}else if(rnum>input) {
				System.out.printf("입력 : %d, 입력값이 더 작습니다. \n",input);
			}else {
				System.out.printf("입력 : %d, 입력값이 더 큽니다. \n",input);
			}
		}
		
		System.out.println("정답 : "+rnum);
		
		
		
//		int a = 1;
//		int b = 2;
//		int c,d = 0;
//		int e=0,f=10;            // 같은 타입은 한줄로 표기
//		int g = 0,double h = 0;  // 다른 타입은 한줄로 표기 안됨.
		
		
		
//		for(int i=0;;i++) {
//			System.out.println(i);
//		}
//		
		
//		while(true) {
//			
//		}
		
		
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			sum = sum + i;
//			sum += i;
//		}
//		
//		System.out.println(sum);
		
		
//		//1-10 55 1-100 5050 1-1000 500500 1-10000 50005000
//		int sum = 0;
//		int i = 0;
//		for(i=1;i<=10;i++) {
//			System.out.println(i);
//			sum += i;
//		}
//		// 정수:%05d, 실수: %.2f , 문자열 : %s, 문자 : %c
//		System.out.printf("[ 1 ~ %d 까지 합 : %d ] \n",(i-1),sum);
//		System.out.println("합계 : "+sum);
		
		
		
		
		
//		//반복문 - for, while
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		System.out.println("----------");
//		
//		int j=0;
//		while(j<10) {
//			System.out.println(j);
//			j++;
//		}
//		
//		System.out.println("----------");
//		int k=0;
//		do {
//			System.out.println(k);
//			k++;
//		}while(k<10);
//
	}

}
