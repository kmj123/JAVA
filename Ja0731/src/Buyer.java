import java.util.ArrayList;

public class Buyer {
	String id;
	String pw;
	String name;
	String address;
	int money;	// 보유금액
	int bonusPoint = 0;	// 보너스 포인트
//	Product[] cart = new Product[10];	// 배열선언
//	vector list2 = new Vector();		// 객체배열 - 컬렉션 : 예전버전
	ArrayList list = new ArrayList();	// 객체배열 - 컬렉션 : 최근버전
	
	// 기본생성자
	Buyer(){}
	Buyer(String id, String name, int money, int bonusPoint){
		this.id = id;
		this.name = name;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	// 구매 메서드
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);	// 컬렉션 추가
//		cart[i++] = p;
//		i++;
	}
	
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Audio t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Computer t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
}
