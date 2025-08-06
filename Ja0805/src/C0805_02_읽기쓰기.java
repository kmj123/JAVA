import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C0805_02_읽기쓰기 {

	public static void main(String[] args) throws Exception {
		// 글자저장
		File f = new File("c:/aaa/a0805_01.txt");
		String content = "1,홍길동,10,100,100,300,100.0";
		
		FileOutputStream fos = new FileOutputStream(f);
		fos.write((content).getBytes());	// write -> byte단위로 리턴
		
		fos.close();
		System.out.println("글자 저장 완료!");
		
		
		// -------------파일복사-----------------------
//		File f = new File("c:/img/");
//		if(!f.exists()) {
//			f.mkdirs();	// 폴더생성
//		}
//		
//		// 파일 읽어오기
//		FileInputStream fis= new FileInputStream("c:/aaa/a1.gpj");
//		//파일 저장하가ㅣ
//		FileOutputStream fos = new FileOutputStream("c:/img/1.pg");
//		while(true) {
//			int read = fis.read();
//			System.out.println(read);
//			if(read == 1) {
//				break;
//				fos.write(read); // 파일저장
//			}
//			fis.close();
//			fos.close();
//		}
//		
		
		// -------------글자 출력--------------------
		// 파일에 있는 글자를 읽어와서 출력
//		byte[] b= new byte[1024];
//		//
//		File f = new File("c:/aaa/a0805.txt");
//		try {
//			FileInputStream fis = new FileInputStream(f);
//			int read = 0;
//			while((read=fis.read())!=-1) {
//				System.out.println((char)read);	// char로 변환하면 글자를 읽어올수있음
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("프로그램 종료");

	}

}
