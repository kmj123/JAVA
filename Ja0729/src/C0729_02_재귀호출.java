
public class C0729_02_재귀호출 {

	public static void main(String[] args) {
		// 재귀호출
		long result = factorial(5);
		// 5 * 4 * 3 * 2 * 1 = 120
		System.out.println("결과: "+result);

		long num = 1;
		for(int i=1;i<=5;i++) {
			num *= i;
		}
		System.out.println("for문 결과값: "+num);
	}
	
	public static long factorial(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		} else {
			result = n*factorial(n-1);
		}
		return result;
	}

}
