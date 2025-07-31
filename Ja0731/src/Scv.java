
public class Scv extends GroundUnit {
	
	Scv(){
		super(60);
	}
	
	void repair(Repairable r) {	// Repairable - 아무것도없음
		Unit u = (Unit)r;
		while(u.hitPoint != u.MAX_UP) {
			// 지연시간
			u.hitPoint++;
		}
	}
}
