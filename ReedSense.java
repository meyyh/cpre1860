
public class ReedSense {
    public static String pulse_sensors(int[][] currBoardState)
    { //returns 'A7' (example)
        int nochange = 0;
        int col_int = 0;
        int row = 0;
        while(nochange == 0)
        {
            int[] newRowState;
            for (row; row <= 7; row++) {
                newRowState = handle_gpio(row);
                col_int = compareIntArray(currBoardState[row], newRowState);
                if (col_int != -1) {
                    nochange = 1;
                    break;
                }
            }

        }
        char col_char = (char) (col_int + 65);
        char row_char = (char) (row)
    }

    private static  int[] handle_gpio(int row)
    {
        int[] row_data;
        int[] boardval;

        //change
        row_data = new int[7];
        return row_data;
        //hello

    }

    private static int compareIntArray(int[] oldArray, int[] newArray) {
        for (int i = 0; i <= 7; i++) {
            if (oldArray[i] != newArray[i]) {
                return i;
            }
        }
        return -1;
    }
}
