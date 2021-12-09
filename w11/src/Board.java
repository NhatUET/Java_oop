import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<Piece>();

    public Board() {

    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    /**
     * add piece.
     * @param piece piece
     */
    public void addPiece(Piece piece) {
        if (!pieces.contains(piece)) {
            pieces.add(piece);
        }
    }

    /**
     * check in board.
     * @param x x
     * @param y y
     * @return true/ false
     */
    public boolean validate(int x, int y) {
        return (x >= 1 && x <= 8) && (y >= 1 && y <= 8);
    }

    /**
     * remove piece.
     * @param x x
     * @param y y
     */
    public void removeAt(int x, int y) {
        pieces.removeIf(piece -> piece.getCoordinatesX() == x
                && piece.getCoordinatesY() == y);
    }

    /**
     * get piece.
     * @param x x
     * @param y y
     * @return piece
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }
}
