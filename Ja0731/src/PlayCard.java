
public interface PlayCard {
	public static final int number = 1;	// 상수만 가능: 값을 꼭 넣어줘야함
	String kind = "";
	public abstract void play();	// 미완성 메서드(추상메서드)만 가능
	void stop();
}
