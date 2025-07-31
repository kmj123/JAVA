import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		// 상단출력 메소드
		Studeck	stuDeck = new Studeck();
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();

		while(true) {
			// 상단메뉴 출력 메소드
			int choice = stuDeck.menu_print();
			
			switch(choice) {
			case 1:	
				// 학생성적 입력 메소드
				stuDeck.stu_input(list);
				break;
			case 2: 
				// 학생성적 출력 메소드
				stuDeck.stu_print(list);
				break;
			case 3: 
				break;
			}
			
		}	// while

		
	}

}
