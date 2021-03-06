package boardgame;
import boardgame.BoardException;
public class Board {

	private int columns;
	private int rows;
	private Piece[][] pieces;
	
	
	public Board(int columns, int rows) {
		if(rows < 1 || columns < 1){
			throw new BoardException("Erro ao criar o tabuleiro, ? necessario que tenha pelo menos uma linha e uma coluna");
		}
		this.columns = columns;
		this.rows = rows;
		pieces = new Piece[rows][columns];
	}
	
	public int getColumns() {
		return columns;
	}
	public int getRows() {
		return rows;
	}
	public Piece piece(int row, int column){
		if(!positionExists(row, column)){
			throw new BoardException("Posicao nao existe");
		}
		return pieces[row][column];
	}
	public Piece piece(Position position){
		if(!positionExists(position)){
			throw new BoardException("Posicao nao existe");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position){
		if(thereIsAPiece(position)){
			throw new BoardException("nao existe uma peca na posicao "+position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	/*public Piece removePiece(Position position){
		
	}*/
	public boolean positionExists(int row, int column){
		return row >= 0 && row < rows && column >= 0 && column < columns;
		
	}
	public boolean positionExists(Position position){
		return positionExists(position.getRow(), position.getColumn());
		
	}
	public boolean thereIsAPiece(Position position){
		if(!positionExists(position)){
			throw new BoardException("Posicao nao existe");
		}
		return piece(position) !=null;
	}

}
