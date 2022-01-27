package chess;
import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class ChessPiece extends Piece{
	private Color color;
	private int moveCount;
	
	
	public Color getColor() {
		return color;
	}
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	/*public ChessPosition getChessPosition(){
		
	}
	protected boolean isThereOpponedPiece(Position position){
		
	}
	protected void increaseMoveCount(){
		
	}
	protected void decreaseMoveCount(){
		
	}*/

}
