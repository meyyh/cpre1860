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

        int[][] int_array = new int[8][8];

        for (int i = 0; i < 8; ++i)
        {
            if(i == 0)
            {
                for (int j = 0; j < 8; ++j)
                {
                    int_array[i][j] = 1;
                }
            }
            if(i == 1)
            {
                for (int j = 0; j < 8; ++j)
                {
                    int_array[i][j] = 1;
                }
            }
            if(i == 6)
            {
                for (int j = 0; j < 8; ++j)
                {
                    int_array[i][j] = 1;
                }
            }
            if(i == 7)
            {
                for (int j = 0; j < 8; ++j)
                {
                    int_array[i][j] = 1;
                }
            }
        }

        System.out.println(Arrays.deepToString(int_array));

       
    
        String a = ReedSense.pulse_sensors(int_array);
        
        System.out.println(a);
        
    }
    
}
