import java.io.PipedReader;
import java.util.Objects;

public class Bishop extends Piece {

    /**
     * constructor1.
     * @param x x
     * @param y y
     */
    public Bishop(int x, int y) {
        super(x, y);
    }

    /**
     * constructor2.
     * @param x x
     * @param y y
     * @param color color
     */
    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        int recentX = super.getCoordinatesX();
        int recentY = super.getCoordinatesY();
        if (!board.validate(x, y)) {
            return false;
        }
        if (Math.abs(x - recentX) != Math.abs(y - recentY)) {
            return false;
        }
        //cheo sang phai
        if (recentX < x) {
            // cheo xuong
            if (recentY < y) {
                for (int i = 1; i < Math.abs(x - recentX); i++) {
                    Piece obj = board.getAt(recentX + i, recentY + i);
                    if (obj != null) {
                        return false;
                    }
                }
            } else { // cheo len
                for (int i = 1; i < Math.abs(x - recentX); i++) {
                    Piece obj = board.getAt(recentX + i, recentY - i);
                    if (obj != null) {
                        return false;
                    }
                }
            }
            Piece obj = board.getAt(x, y);
            if (obj != null && obj.getColor() == getColor()) {
                return false;
            }
        }

        //cheo sang trai
        if (recentX > x) {
            // cheo xuong
            if (recentY < y) {
                for (int i = 1; i < Math.abs(x - recentX); i++) {
                    Piece obj = board.getAt(recentX - i, recentY + i);
                    if (obj != null) {
                        return false;
                    }
                }
            } else { // cheo len
                for (int i = 1; i < Math.abs(x - recentX); i++) {
                    Piece obj = board.getAt(recentX - i, recentY - i);
                    if (obj != null) {
                        return false;
                    }
                }
            }
            Piece obj = board.getAt(x, y);
            if (obj != null && obj.getColor() == getColor()) {
                return false;
            }
        }
        return true;
    }
}
