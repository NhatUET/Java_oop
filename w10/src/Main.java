public class Main {
    /**
     * test rock.
     */
    public static void main(String[] args) {
        Piece piece = new Rook(2, 6);
        Piece piece1 = new Rook(2, 4, "white");
        Board board = new Board();
        Game game = new Game(board);
        game.movePiece(piece, 2, 4);
        System.out.println(game.getMoveHistory().size());
        System.out.println(game.getMoveHistory());
       // System.out.println(piece.canMove(board, 2, 4));
    }
}
