
public class Buyer {
	String id;
	String pw;
	String buyerName;
	int money = 10000000;	// 현재 보유금액
	int bonusPoint = 0;	// 보너스 포인트

	// 구매시 money 차감 bonusPoint 증가
	void buy(Tv t) {
		money -= t.price;
		bonusPoint += t.bonusPoint;
	}
	void buy(Audio a) {
		money -= a.price;
		bonusPoint += a.bonusPoint;
	}
	void buy(Computer c) {
		money -= c.price;
		bonusPoint += c.bonusPoint;
	}
}
