import java.util.Arrays;

public class C0724_02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int num = 5;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr); // [I@28a418fc - 주소값 출력
		
		// 기본변수: 정수형 값 변경
		int num2 = 0;
		num2 = num;
		System.out.println(num2);	// 5
		num = 10;
		System.out.println(num2);	// 5
		
		// 배열: 값 변경
		int[] arr2 = {0,0,0,0,0};
		System.out.println(Arrays.toString(arr2));	// [0, 0, 0, 0, 0] 
		// 얕은 복사 - 추천 X
		arr2 = arr;
		System.out.println(Arrays.toString(arr2));	// [1, 2, 3, 4, 5]
		arr[0] = 100;
		arr[1] = 200;
		// 주소가 똑같이 변경됨
		System.out.println(arr);	
		System.out.println(arr2);	
	}

}
