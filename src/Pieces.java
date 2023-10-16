import java.util.ArrayList;

public abstract class Pieces {
	public static final int BOXES_NUM = 8;
	boolean isItWhite;
	
	ArrayList<ThreatArray> boxesThreatening = new ArrayList<>();
	public int x, y;
	public Pieces(int x, int y, boolean pleaseBeWhite) {
		this.x = x;
		this.y = y;
		this.isItWhite=pleaseBeWhite;
	}
	
	public boolean isValidMove() {
		return true;
	}
	
	public void fillBoxesThatThreatens(boolean pieceInBetween) {
		
	}
}
