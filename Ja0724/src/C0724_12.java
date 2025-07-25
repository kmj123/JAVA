
public class C0724_12 {

	public static void main(String[] args) {
		// 1-25까지 숫자를 입력한후, 랜덤으로 번호를 섞어 출력하시오.
		int[] num = new int[25];
		int[][] arr = new int[5][5];
		
		//자동 번호입력
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		int temp = 0;
		int randomNum = 0;
		//랜덤섞기
		for(int i=0;i<300;i++) {
			randomNum = (int)(Math.random()*25); //랜덤번호
			temp = num[0];
			num[0] = num[randomNum]; //랜덤선택번호
			num[randomNum] = temp;
		}
		
		//번호출력
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		
		// [5][5] 1-25 순차번호를 입력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		System.out.println();
		System.out.println("--------------------------");
		// [5][5] 출력
		System.out.println(" [5][5] 배열");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
		
		
		

	}

}