
public class Rook extends Pieces{

public Rook(int x, int y, boolean color) {
		super(x, y, color);
		// TODO Auto-generated constructor stub
	}

public boolean isValidMove(int x_try, int y_try, boolean check, boolean pawnInBetween) {
		if(BOXES_NUM<x_try && BOXES_NUM<y_try && !check && !pawnInBetween) return false;
		return true;
	}
}
