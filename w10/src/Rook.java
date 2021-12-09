import java.util.Objects;

public class Rook extends Piece {
    /**
     * constructor1.
     * @param x x
     * @param y y
     */
    public Rook(int x, int y) {
        super(x, y);
    }

    /**
     * constructor2.
     * @param x x
     * @param y y
     * @param color color
     */
    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        int recentX = getCoordinatesX();
        int recentY = getCoordinatesY();
        if (!board.validate(x, y)) {
            return false;
        }

        if (recentX != x && recentY != y) {
            return false;
        }

        // check cot
        if (recentX == x) {
            if (recentY < y) {
                for (int i = recentY + 1; i < y; i++) {
                    Piece p1 = board.getAt(recentX, i);
                    if (p1 != null) {
                        return false;
                    }
                }
            } else {
                for (int i = recentY - 1; i > y; i--) {
                    Piece p1 = board.getAt(recentX, i);
                    if (p1 != null) {
                        return false;
                    }
                }
            }
            // check kill
            Piece p1 = board.getAt(x, y);
            if (p1 != null) {
                return !Objects.equals(p1.getColor(), getColor());
            }
        }
        // check hang
        if (recentY == y) {
            if (recentX < x) {
                for (int i = recentX + 1; i < x; i++) {
                    Piece p1 = board.getAt(i, recentY);
                    if (p1 != null) {
                        return false;
                    }
                }
            } else {
                for (int i = recentX - 1; i > x; i--) {
                    Piece p1 = board.getAt(i, recentY);
                    if (p1 != null) {
                        return false;
                    }
                }
            }
            // check kill
            Piece p1 = board.getAt(x, y);
            if (p1 != null) {
                return !Objects.equals(p1.getColor(), getColor());
            }
        }
        return true;
    }
}
