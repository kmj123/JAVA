import java.util.Arrays;
import java.util.Scanner;

public class Process_메소드호출 {
	Scanner scan = new Scanner(System.in);
	
	int[] num = new int[45];
	int[] lotto = new int[6];
	int[] myNo = new int[6];
	int[] okNo = new int[6];
	int count = 0;	// 맞춘개수 - 기본변수
	// 로또맞추기 메소드
	int lottoProcess(int[] num, int[] lotto, int[] myNo,
			int[] okNo, int count) {
		// Process.java에 메소드를 구현해서 입력번호 로또번호, 맞춘번호를 출력하시오
		// 매개변수 전달 - myNo,lotto,okNo - 리턴으로 안받아됨, count - (리턴으로 받아야함)
		// 1. 1-45까지 숫자입력
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		// 랜덤 섞기
		int rnum = 0;
		int temp = 0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 배열 복사
		System.arraycopy(num, 0, lotto, 0, 6);
		
		// 입력번호 6개 
		for(int i=0;i<6;i++) {
			System.out.printf("1-45까지 %d번째 숫자를 입력하세요>>",i+1);
			myNo[i] = scan.nextInt();
		}
		
		// 로또번호 & 입력번호 비교
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==myNo[j]) {
					okNo[count] = lotto[i];
					count++;
					break;
				}
			}
		}
		
		
		return count;
	}
	
	
	
	// 자바 메소드 단점: return 1개만 가능
	void resultProcess(int a,int b,double[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
	
	// 구구단
	void gugudan() {
		// 구구단
		System.out.println("2단에서 부터 원하는 단을 입력하세요");
		int number = scan.nextInt();
		System.out.println("	[ 구구단 ]");
		System.out.println("-----------------------------");
		for(int i=2;i<=number;i++) {
			System.out.printf(" [%d 단] \n",i);
			for(int j=0;j<=9;j++) {
				System.out.printf("%d X %d= %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
	
	
	// 숫자 랜덤 맞추기
	void numPorcess() {
	// 숫자맞추기 프로그램
	// 1-100까지를 입력받아 숫자 맞추기 구현
	int[] num = new int[10];
	int[] input = new int[10];
	int answer = (int)(Math.random()*100)+1;
	int i =0;
	while(i<10) {
		System.out.println("[ 숫자맞추기 ]");
		System.out.println("-----------------------");
		System.out.println("1-100까지 숫자를 입력해주세요");
		input[i] = scan.nextInt();
		if(answer>input[i]) {
			System.out.println("입력한 값이 작습니다. 더 큰수를 입력하세요>>");
		}else if(answer <input[i]) {
			System.out.println("입력한 값이 큽니다. 더 작은수를 입력하세요>>");
		} else {
			System.out.println("정답입니다.");
			break;
		}
		i++;
		}// while
		
		System.out.println("정답: "+answer);
		System.out.println("입력번호: "+Arrays.toString(input));
	}
}
