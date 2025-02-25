import com.github.bhlangonijr.chesslib.*;
import com.github.bhlangonijr.chesslib.move.Move;
import com.github.bhlangonijr.chesslib.Board;


public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.doMove(new Move(Square.E2, Square.E4));
        System.out.println(board.toString());
    }
}
