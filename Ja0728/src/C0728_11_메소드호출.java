import java.util.Arrays;
import java.util.Scanner;

public class C0728_11_메소드호출 {

	public static void main(String[] args) {
		// 숫자맞추기 프로그램
		Scanner scan = new Scanner(System.in);
		// 객체 선언
		Process_메소드호출 p = new Process_메소드호출();
		
		// 숫자입력
		System.out.println("[ 프로그램 ]");
		System.out.println("1. 숫자맞추기");
		System.out.println("2. 로또맞추기");
		System.out.println("3. 구구단");
		System.out.println("4. 결과리턴");
		System.out.println("---------------------------");
		System.out.println("원하는 번호를 입력하세요>>");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			p.numPorcess();
			break;
		case 2:
			int[] num = new int[45];
			int[] lotto = new int[6];
			int[] myNo = new int[6];
			int[] okNo = new int[6];
			int count = 0;	// 맞춘개수 - 기본변수
			
			// 메소드 호출 부분
			count = p.lottoProcess(num,lotto,myNo,okNo,count);
			
			// 출력
			System.out.println("입력번호: "+Arrays.toString(myNo));
			System.out.println("로또번호: "+Arrays.toString(lotto));
			System.out.println("맞춘번호: ");
			for(int i=0;i<count;i++) {
				System.out.println(okNo[i]+" ");
			}
			break;
		case 3: 
			p.gugudan();
			break;
		case 4:
			// 10, 5 더하기, 빼기, 곱하기, 나누기의 값을 출력
			// 배열 = 참조형 변수/ result - 주소값
			double[] result = {0,0,0,0};
			int a = 10;
			int b = 5;
			p.resultProcess(a, b, result);
			System.out.println(Arrays.toString(result));
			break;
		}

	}

}
