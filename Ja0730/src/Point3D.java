
public class Point3D extends Point{
	
	int z;
	
	Point3D(int x, int y, int z){
//		super();	// 조상의 기본생성자를 자동입력되어 호출함
		super(x,y);	// 기본생성자가 없을경우, 설정을 해줘야함. super(); -> Pointer(); 기본생성자를 찾음
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return String.format("x: %d,y: %d,z: %d \n",x,y,z);
//		return "x: "+x+",y:"+y+", z:"+z;
	}
}
