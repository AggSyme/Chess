import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pieces> temp;
		
		Board board=new Board();
		Black blackPlayer=new Black();
		White whitePlayer = new White();
	
		board.addPiecesToBoard(whitePlayer, blackPlayer);
		
		System.out.println(whitePlayer.piecesPlaying.size());
	}

}
