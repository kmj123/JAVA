import java.util.Scanner;

public class C0725_05 {

	public static void main(String[] args) {
		// 반복문
		Scanner scan = new Scanner(System.in);
	
		while(true) {
		System.out.println("[학생성적프로그램]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("원하는 번호를 입력하세요>>");
		int choice = scan.nextInt();
		if(choice==0) {
			break;
			}
		}
		
		
//		int i=0;
//		for(;;i++) {
//			System.out.println(i);
//		}
		
		
//		int i=0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}
		
//		int sum=0;
//		int i=0;
//		while(i<=10) {
//			sum = sum+i;
//			i++;
//		}
//		System.out.println(i-1);
//		System.out.println("합계: "+sum);
		
		
		
//		int sum = 0;
//		int i = 0;
//		for(i=0; i<=10;i++) {
//			sum =sum+i;
//		}
//		System.out.println(i-1);	// for,while문에서는 항상 i는 1많음
//		System.out.println("합계: "+sum);

	}

}
