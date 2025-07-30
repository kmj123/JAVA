
public class C02 {
	public static void main(String[] args) {
		// 모양, 번호가 포함되어있는 카드 52장 
		Deck d = new Deck();
		
		// 카드 섞기
		d.shuffle();
		System.out.println("-----------");
		
		// 전체출력
		// 카드 52장을 생성
		
		
		// 카드 5장을 출력하시오
		
		
		// 31번째 카드를 출력하시오
		Card c1 = d.pick(30);
		System.out.println("-----------");
		System.out.println("[31번째 카드]");
									// c1.getN_num(0[30]
		System.out.printf("[%s, %s]\n",c1.getN_num()[c1.getNumber()]+","+
				c1.getKind());
		
		
		// 랜덤으로 카드 한장을 출력하시오
		Card c2 = d.pick();
		System.out.println("------------");
		System.out.println("[랜덤 출력]");
		System.out.printf("[%s, %s]\n",c2.getNumber(),c2.getKind());
			
	}
}
