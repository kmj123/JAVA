
public class C0731_05 {

	public static void main(String[] args) {
//		MImpl mImpl = new MImpl();
//		mImpl.all_print();
//		mImpl.add();
//		mImpl.update();
//		mImpl.delete();
//		MImpl2 mImpl2 = new MImpl2();
//		mImpl2.all_print();
//		mImpl2.add();
//		mImpl2.update();
//		mImpl2.delete();
//		MImpl.all_print();
		
//		MService mSerivce = new MImpl();
		MService mSerivce = new MImpl2();	// 인터페이스를 상속받아 사용
		mSerivce.all_print();
		
		
	}

}
