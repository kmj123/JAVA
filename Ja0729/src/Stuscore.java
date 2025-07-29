
public class Stuscore {
	static int count = 0;	// static을 꼭 붙여줘야 공용으로 사용가능
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	// 아래 메서드에도 영향을 끼침 - 값이 자동으로 증가하는 함수
	{
		this.no = count+1;
		count++;
	}
	
	Stuscore(){
//		this.no = count+1;
//		count++;
	}
	
	Stuscore(String name, int kor, int eng, int math){
//		this.no = count+1;
//		count++;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
}	
