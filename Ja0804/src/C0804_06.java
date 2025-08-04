import java.util.ArrayList;

public class C0804_06 {

	public static void main(String[] args) {
		ArrayList<Stu> list = new ArrayList();	// 제너릭
		
		list.add(new Stu("홍길동",100,100,100));
		list.add(new Stu("유관순",90,90,90));
//		list.add(new St(1,"이순신","010-0000-0000"));	// 에러가 남
		list.add(new Stu("강감찬",70,100,100));
		list.add(new Stu("김구",60,100,100));
		
		for(int i=0;i<list.size();i++) {
			// 제너릭 사용방식
//			Stu s = ((Stu)list.get(i));
//			System.out.printf("[%s,%s,%s,%s]\n",
//					s.getName(),s.getKor(),s.getEng(),s.getMath());
			System.out.println(list.get(i).getName()+","+
					list.get(i).getKor()+","+list.get(i).getEng()+","+list.get(i).getMath());
		}

	}

}
