import java.util.ArrayList;

public class Board {
	public static final int BOXES_NUM = 8;
	Pieces[][] boxes=new Pieces[8][8];
	ArrayList<Pieces> piecesPlaying = new ArrayList<>();
	
	
	public void addPiecesToBoard(White w, Black b) {
		for(Pieces i: w.piecesPlaying) {
			boxes[i.x][i.y]=i;
		}
		for(Pieces i: b.piecesPlaying) {
			boxes[i.x][i.y]=i;
		}
	}
	
}
