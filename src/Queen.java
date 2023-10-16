
public class Queen extends Pieces{

	public Queen(int x, int y, boolean pleaseBeWhite) {
		super(x, y, pleaseBeWhite);
		// TODO Auto-generated constructor stub
	}

	public boolean isValidMove(int x_try, int y_try, boolean check, boolean pawnInBetween) {
		if(BOXES_NUM<x_try && BOXES_NUM<y_try && !check && !pawnInBetween) return false;
		return true;
	}
	
	public void fillBoxesThatThreatens(boolean pieceInBetween) {
		if(pieceInBetween && y>1 && x>1) {
			boxesThreatening.add(new ThreatArray(x--, y--));
		}
		
		if(pieceInBetween && y<8 && x<8) {
			boxesThreatening.add(new ThreatArray(x++, y++));
		}
		
		if(pieceInBetween && y<8 && x>1) {
			boxesThreatening.add(new ThreatArray(x--, y++));
		}
		
		if(pieceInBetween && y>1 && x<8) {
			boxesThreatening.add(new ThreatArray(x++, y--));
		}
		
		if(pieceInBetween && x<8) {
			boxesThreatening.add(new ThreatArray(x++, y));
		}
		
		if(pieceInBetween && y<8) {
			boxesThreatening.add(new ThreatArray(x, y++));
		}
		
		if(pieceInBetween && x>1) {
			boxesThreatening.add(new ThreatArray(x--, y));
		}
		
		if(pieceInBetween && y>1) {
			boxesThreatening.add(new ThreatArray(x, y--));
		}
	}
}
