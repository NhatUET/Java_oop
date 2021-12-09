public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color = "white";

    /**
     * constructor 1.
     * @param coordinatesX x
     * @param coordinatesY y
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    /**
     * constructor 2.
     * @param coordinatesX x
     * @param coordinatesY y
     * @param color color
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    // setter, getter
    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * check position.
     * @param piece piece
     * @return true/false
     */
    public boolean checkPosition(Piece piece) {
        return (piece.getCoordinatesX() <= 8 && piece.getCoordinatesX() >= 1)
                && (piece.getCoordinatesY() <= 8 && piece.getCoordinatesY() >= 1);
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);
}
