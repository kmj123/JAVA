
public class C0724_15 {

	public static void main(String[] args) {
		int[] arr = new int[25]; //0으로 모두 채워짐.
		// 1,2,3,....25
		// 0,1 로 랜덤으로 숫자를 입력하시오.
		// 1 -> 7개만 넣어서 출력하시오.
		// 0을 모두 채우고, 1를 7개를 넣고, 랜덤으로 섞기
		
		for(int i=0;i<7;i++) {
			arr[i] = 1;
		}
		
		// 랜덤섞기
		int temp = 0;
		int rnum = 0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*25);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}