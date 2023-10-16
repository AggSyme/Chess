
public class Pawn extends Pieces{	
	
	public Pawn(int x, int y, boolean color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
	}

	public boolean isValidMove(int x_try, boolean check, boolean pawnInBetween) {
		if(BOXES_NUM<x_try && !check && !pawnInBetween) return false;
		return true;
	}
	
	public void fillBoxesThatThreatens(boolean pieceInBetween) {
		if(pieceInBetween && y>1) {
			boxesThreatening.add(new ThreatArray(x+1, y-1));
		}
		
		if(pieceInBetween && y<8) {
			boxesThreatening.add(new ThreatArray(x+1, y-1));
		}
	}
}
