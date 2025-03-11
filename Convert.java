public class Convert {
    public static int[][] bitboardToArray(long bitboard) { //chatgpt code so start here if issues
        int[][] board = new int[8][8]; // 8x8 chessboard

        for (int rank = 0; rank < 8; rank++) {  // Loop through ranks (rows)
            for (int file = 0; file < 8; file++) {  // Loop through files (columns)
                int squareIndex = rank * 8 + file;  // Get bit position
                long mask = 1L << squareIndex;  // Create bit mask
                board[7 - rank][file] = (bitboard & mask) != 0 ? 1 : 0;  // Convert bit to 1 or 0
            }
        }
        return board;
    }
}
