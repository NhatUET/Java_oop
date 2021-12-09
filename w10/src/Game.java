import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<Move>();

    /**
     * constructor.
     * @param board b
     */
    public Game(Board board) {
        this.board = board;
    }

    /**
     * move piece.
     * @param piece p
     * @param x x
     * @param y y
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            int recentX = piece.getCoordinatesX();
            int recentY = piece.getCoordinatesY();
            Piece p2 = board.getAt(x, y);
            if (p2 != null) {
                Move move = new Move(recentX, x, recentY, y, piece, p2);
                board.removeAt(x, y);
                moveHistory.add(move);
            }
            if (p2 == null) {
                Move move = new Move(recentX, x, recentY, y, piece);
                moveHistory.add(move);
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    // setter,getter
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return this.moveHistory;
    }
}
