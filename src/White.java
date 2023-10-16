
public class White extends Players{

	public White() {
		queen=new Queen(1, 4, true);
		king=new King(1, 5, true);
		bishop1=new Bishop(1, 3, true);
		bishop2=new Bishop(1, 6, true);
		knight1=new Knight(1, 2, true);
		knight2=new Knight(1, 7, true);
		rook1=new Rook(1, 1, true);
		rook2=new Rook(1, 8, true);
		pawn1=new Pawn(2, 1, true);
		pawn2=new Pawn(2, 2, true);
		pawn3=new Pawn(2, 3, true);
		pawn4=new Pawn(2, 4, true);
		pawn5=new Pawn(2, 5, true);
		pawn6=new Pawn(2, 6, true);
		pawn7=new Pawn(2, 7, true);
		pawn8=new Pawn(2, 8, true);
		
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
