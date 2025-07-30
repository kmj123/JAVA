
public class Deck {
	Card[] c = new Card[52];
	String[] shape = {
			"SPADE","HEART","DIAMOND","CLOVER"
		};
	
	Deck(){
		// 모양 번호 부여 52장 카드 생성
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(i%13+1, shape[i/13]);
		}
	}
	
	// 전체 출력
	public void card_print() {
		for(int i=0;i<c.length;i++) {
			System.out.println(
//					c[i].getN_num()	//"","A","2","3","4","5","6","7","8","9","10","J","Q","K"
//					c[i].getN_num()[1]; A
//					c[i].getNumber();	1
//					c[i].getN_num()[c[i].getNumber()];	A
					c[i].getN_num()[c[i].getNumber()]+","+
					c[i].getKind());
		}
	}
	
	// 카드 섞기 메소드
	void shuffle() {
		Card temp = null;
		int rnum = 0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}
	
	// 카드 5장 출력 메소드
	public Card[] pick_5() {
		Card[] c_5 = new Card[5];
		for(int i=0;i<5;i++) {
			c_5[i] = c[i];
		}
		return c_5;
	}
	
	// 카드 1장 뽑기 메서드
	public Card pick(int index) {
		return c[index];
	}
	
	// 랜덤 카드 1장 뽑기 메서드
	public Card pick() {
		int index = (int)(Math.random()*52);
			return c[index];
	}

	
}
