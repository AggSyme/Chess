
public class ThreatArray {
	public int x,y;
	public boolean playableMove=true;
	
	public ThreatArray(int x, int y, boolean playableMove) {
		this.x = x;
		this.y = y;
		this.playableMove = playableMove;
	}
	
	public ThreatArray(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
