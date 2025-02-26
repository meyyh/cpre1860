import java.util.List;

import com.github.bhlangonijr.chesslib.Board;
import com.github.bhlangonijr.chesslib.move.Move;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        List<Move> moves = board.legalMoves();
        System.out.println("Legal moves: " + moves);
        moves.removeIf(n -> !n.toString().startsWith("a2"));
        System.out.println("Legal moves: " + moves);
    }
}