package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	

	protected Board getBoard() {
		return board;
	}


	public Piece(Board board) {
		this.board = board;
		position =null;
	}


	public Piece() {
		// TODO Auto-generated constructor stub
	}
	/*public boolean possibleMoves(){
		
	}*/
	public boolean possibleMove(Position position){
		return false;
		
	}
	public boolean IsThereAnyPossibleMove(){
		return false;
		
	}

}
