import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		// 선언부
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList();
		int no=0,kor=0,eng=0,math=0,total=0,rank=0,choice=0,count=0,temp=0;
		double avg=0;
		String name="";
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int[] score = new int[3];
		
		// 파일읽어오기 - aaa/stu.txt
		FileReader fr = new FileReader("c:/aaa/stu.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line==null)break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			
			// list에 저장
			list.add(new Student(no,name,kor,eng,math,total,avg));
		}
		br.close();
		fr.close();
		System.out.println("파일불러오기 성공");
		System.out.println();
		
		loop:while(true) {
			// 상단메뉴
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 등수처리");
			System.out.println("6. 이름정렬");
			System.out.println("7. 등수정렬");
			System.out.println("8. 번호정렬");
			System.out.println("9. 파일저장");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:	// 1. 성적 입력
				System.out.println();
				System.out.println("[ 학생성적입력 ]");
				System.out.printf("%s번 학생이름을 입력해주세요\n",Student.count+1);
				name = scan.next();
				for(int i=0;i<3;i++) {
					System.out.printf("%s 점수를 입력해주세요\n",title[i+2]);
					score[i] = scan.nextInt();
				}
				list.add(new Student(no,name,kor,eng,math,total,avg));
				System.out.printf("%s 학생 성적이 저장되었습니다\n.",name);
				System.out.println();
				break;
			case 2:	// 2. 성적출력
				System.out.println("[ 학생성적출력 ]");
				// title 출력
				System.out.println();
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s \t%s\n",
						title[0],title[1],title[2],title[3],
						title[4],title[5],title[6],title[7]);
				System.out.println("---------------------------------------------------------------------");
				for(int i=0;i<list.size();i++) {
					Student s = list.get(i);
					System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%.2f\t%s\n",
							s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
							s.getTotal(),s.getAvg(),s.getRank());
				}
				System.out.println();
				break;
			case 3:	// 성적 수정
				System.out.println("[ 학생성적수정 ]");
				System.out.println("찾고자하는 학생의 이름을 입력해주세요");
				name = scan.next();
				temp=0;
				
				// 검색
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().contains(name)){
						System.out.printf("%s 학생을 찾았습니다..\n",name);
						temp=1;
						no = i;
						break;
					}
				}// for문
				
				if(temp == 0) {
					System.out.println("찾고자하는 학생이 없습니다.");
					break;
				} else {
					System.out.printf("%s 학생을 수정합니다.",name);
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.println("0. 수정종료");
					System.out.println("수정하려는 과목의 번호를 선택해주세요");
					System.out.println("---------------------------------");
					choice = scan.nextInt();
					
					switch(choice) {
					case 1:
						
						break;
					case 2:
						
						break;
					case 3:
						break;
					case 0: break;
					}
				}
				
				 
				break;

			// 5. 등수처리
			case 5:
				System.out.println();
				System.out.println("[ 등수처리 ]");
				System.out.println("1. 순차정렬");
				System.out.println("2. 역순정렬");
				System.out.println("0. 정렬취소");
				System.out.println("----------------");
				System.out.println("원하는 번호를 입력하세요");
				choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					list.sort(new Comparator<Student>() {

						@Override
						public int compare(Student o1, Student o2) {
							// o1, o2 비교 - 역순
							return o1.getTotal()-o2.getTotal();
						}
					});
					break;
					
				case 2:
					list.sort(new Comparator<Student>() {

						@Override
						public int compare(Student o1, Student o2) {
							// o1, o2 비교 - 순차
							return o2.getTotal()-o1.getTotal();
						}
					});
					break;
				case 0:break;
				}
				
				// 6. 이름정렬
				case 6:
					System.out.println();
					System.out.println("[ 이름정렬 ]");
					System.out.println("1. 순차정렬");
					System.out.println("2. 역순정렬");
					System.out.println("0. 정렬취소");
					System.out.println("----------------");
					System.out.println("원하는 번호를 입력하세요");
					choice = scan.nextInt();
					
					switch(choice) {
					case 1:
						list.sort(new Comparator<Student>() {

							@Override
							public int compare(Student o1, Student o2) {
								// o1, o2 비교 - 역순
								return o1.getName().compareTo(o2.getName());
							}
						});
						break;
					case 2:
						list.sort(new Comparator<Student>() {

							@Override
							public int compare(Student o1, Student o2) {
								// o1, o2 비교 - 순차
								return o2.getName().compareTo(o1.getName());
							}
						});
						break;
					case 0:break;
						
					}
					
					break;
				
				
			// 9. 파일 저장
			case 9:
				FileWriter fw = new FileWriter("c:/aaa/stu.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				for(int i=0;i<list.size();i++) {
					Student s = list.get(i);
					String str = String.format("%d,%s,%d,%d,%d,%d,%f,%d\n",
							s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank()
							);
					bw.write(str);
				}
				bw.close();
				fw.close();
				System.out.println("파일이 저장되었습니다.");
				break;
			
			case 0: break loop;
			}
			
		}

		
	}

}
