import java.util.ArrayList;

public abstract class Players {
	ArrayList<Pieces> piecesPlaying = new ArrayList<>();
	public King king;
	public Queen queen;
	public Bishop bishop1, bishop2;
	public Knight knight1, knight2;
	public Rook rook1, rook2;
	public Pawn pawn1, pawn2, pawn3, pawn4, pawn5, pawn6, pawn7, pawn8;
	
	public ArrayList<Pieces> piecesRemaining(){
		return piecesPlaying;
	}
	
	public void removePiece(int x, int y) {
		for(int i=0;i<piecesPlaying.size();i++) {
			if(piecesPlaying.get(i).x==x && piecesPlaying.get(i).y==y) {
				piecesPlaying.remove(i);
			}
		}
	}
	
	public void addPiece(Pieces p) {
		piecesPlaying.add(p);
	}
	
	public int piecesLeft() {
		return piecesPlaying.size();
	}
}
