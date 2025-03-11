import java.util.Arrays;
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
              
    
        

        int[][] int_array = Convert.bitboardToArray(board.getBitboard());
        //System.out.println(Arrays.deepToString(int_array));

        String piece_removed = ReedSense.pulse_sensors(int_array);
        System.out.println(piece_removed);

        List<Move> moves2 = board.legalMoves();
        moves2.removeIf(n -> !n.toString().startsWith(piece_removed));
        System.out.println("Legal moves: " + moves2);     
        
    }    
}
