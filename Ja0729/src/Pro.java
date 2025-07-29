
public class Pro {
	static int count = 0;
	int serialNo;	// 자동으로 부여되게 구현
	String productName;
	{
		this.serialNo = count+1;
		count++;
	}
	
	// 기본생성자
	Pro(){}
	// 전체생성자
	Pro(String productName){
		this.productName = productName;
	}
}
