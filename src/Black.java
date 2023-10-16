
public class Black extends Players{

	public Black() {
		queen=new Queen(8, 4, false);
		king=new King(8, 5, false);
		bishop1=new Bishop(8, 3, false);
		bishop2=new Bishop(8, 6, false);
		knight1=new Knight(8, 2, false);
		knight2=new Knight(8, 7, false);
		rook1=new Rook(8, 1, false);
		rook2=new Rook(8, 8, false);
		pawn1=new Pawn(7, 1, false);
		pawn2=new Pawn(7, 2, false);
		pawn3=new Pawn(7, 3, false);
		pawn4=new Pawn(7, 4, false);
		pawn5=new Pawn(7, 5, false);
		pawn6=new Pawn(7, 6, false);
		pawn7=new Pawn(7, 7, false);
		pawn8=new Pawn(7, 8, false);
		
		piecesPlaying.add(queen);
		piecesPlaying.add(king);
		piecesPlaying.add(bishop1);
		piecesPlaying.add(bishop2);
		piecesPlaying.add(knight1);
		piecesPlaying.add(knight2);
		piecesPlaying.add(rook1);
		piecesPlaying.add(rook2);
		piecesPlaying.add(pawn1);
		piecesPlaying.add(pawn2);
		piecesPlaying.add(pawn3);
		piecesPlaying.add(pawn4);
		piecesPlaying.add(pawn5);
		piecesPlaying.add(pawn6);
		piecesPlaying.add(pawn7);
		piecesPlaying.add(pawn8);
	}
	
}
