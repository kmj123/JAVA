import java.util.Scanner;

public class C0724_04 {

	public static void main(String[] args) {
		// 1-45까지 숫자 6개를 입력받고
		// 로또번호 6개를 생성해서 출력하시오.
		// 입력번호 : 1 45 3 10 5 20
		// 로또번호 : 20 4 9 35 7 21
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		int[] lotto = new int[6];
		int[] num = new int[45];
		int rnum = 0; // 랜덤번호생성사용
		int temp = 0; // 임시저장
		
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.(1-45)>> \n",i+1);
			input[i] = scan.nextInt();
		}
		
		//번호입력
		for(int i=0;i<45;i++) {
			num[i]=i+1;
		}
		// 번호섞기
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45); // 0-44
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 입력번호출력
		System.out.print("입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		
		//로또번호출력
		System.out.print("로또번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(num[i]+" ");
		}
		
	}
}
