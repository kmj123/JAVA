
public class Deck {
//	final int CARD_NUM = 52;	// final로 한번 지정하면 값을 다시 지정할 수 없음
//	CARD_NUM = 53; 		// 상수: 값이 한번 정해지면 수정불가
//	Card[] c = new Card[CARD_NUM];
	Card[] c = new Card[52];	// 52wkd - 1~10,J,Q,K 13장 * 4종류 = 52장
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	String[] c_shape= {
			"","A","2","3","4","5","6","7","8","9","10","J","Q","K"
	};
	
	// 기본생성자(void가 없고, 클래스 명과 동일한 이름)
	Deck() {
		for(int i=0;i<52;i++) {
			c[i] = new Card(i%13+1, shape[i/13]);
		}

//		for(int i=0;i<4;i++) {
//			for(int j=0;j<13;j++) {
//				c[i*13+j] = new Card();
//			}
//		}
		
	}// 생성자
	
	
	//카드1장 뽑기
	Card pick(int index) {
		if(index>52 || index<0) {
			return c[0];
		}else {
			return c[index]; // 100
		}
	}
	
	//카드1장 뽑기
	Card pick() {
	   int index = (int)(Math.random()*52);
	   return c[index];
	}
	
		
	// 카드섞기
	void shuffle() {
		Card temp = null;
		int rnum = 0;
		for(int i=0;i<300;i++) {
			rnum = (int)(Math.random()*52);	// 0-51
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}
		
		
	// 전체카드 출력
	void deck_print() {
		for(int i=0;i<52;i++) {
			System.out.printf("[%s,%s]\n",c_shape[c[i].number],c[i].kind);
		}
	}
	
}
