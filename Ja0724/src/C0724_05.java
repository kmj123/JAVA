import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C0724_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];			// 기본타입
		Integer[] input2 = {10,20,3,9,5};	// 객체타입
		for(int i=0; i<6;i++) {
			System.out.printf("%d 번째 입력: \n",i+1);
			input[i] = scan.nextInt();
		}
		
		Arrays.sort(input);	// 순차정렬 - input 배열 바로 수정
//		Arrays.sort(input2,Collections.reverseOrder());	// 기본타입은 정렬이 안됨. 객체타입만 가능
		System.out.println("입력번호: "+Arrays.toString(input));

	}

}
