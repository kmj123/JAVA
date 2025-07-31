
abstract public class Player {
	int num;
	int pos;
	
	// 미완성 메소드가 1개라도있으면
	// 클래스 abstract 무조건 붙여야함
	abstract void play(int pos);
	abstract void stop(int pos);
	abstract void jump(int pos);
	abstract void goAndstop(int pos);
}
