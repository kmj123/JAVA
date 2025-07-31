import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일생성할 이름을 입력하세요");
		String fileName = scan.next();
		
		File f = new File("c:/down/"+fileName);
		if(!f.exists()) {
			try {
				f.createNewFile();	// 용량이 꽉차거나 하드가 에러일때
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("파일이 존재합니다.");
			}
			System.out.println("파일이 생성되었습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
