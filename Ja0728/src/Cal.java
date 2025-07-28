
public class Cal {
	void powProcess(double input, int n, double[] number) {
		// 반올림
		number[0] = Math.round(input * Math.pow(10, 4))/Math.pow(10, 4);
		// 올림
		number[1] = Math.ceil(input * Math.pow(10, 4))/Math.pow(10, 4);
		// 버림
		number[2] = Math.floor(input * Math.pow(10, 4))/Math.pow(10, 4);
		
	}
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void minus(int a, int b) {
		System.out.println(a-b);
	}
	
	void multi(int a, int b) {
		System.out.println(a*b);
	}
	
	void divide(int a, int b) {
		System.out.println((double)a/b);
	}
}
