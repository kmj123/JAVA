
public class C0729_08 {

	public static void main(String[] args) {

		//7줄을 사용해야 처리
		Stuscore s1 = new Stuscore();
		s1.name= "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 99;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total/3.0;
		
		//1줄 사용
		Stuscore s2 = new Stuscore("유관순",90,90,91	);
		
		
		
		// 4줄을 사용해서 프로그램을 구현
//		Car2 c = new Car2();
//		c.color = "white";
//		c.gearType = "auto";
//		c.door = 5;
//		
//		System.out.printf("%s,%s,%d \n",
//				c.color,c.gearType,c.door);
//		
//		// 1줄을 사용해서 프로그램을 구현
//		Car2 c2 = new Car2("pink","stick",4);
//		System.out.printf("%s,%s,%d \n",
//				c2.color,c2.gearType,c2.door);
//		
	}

}