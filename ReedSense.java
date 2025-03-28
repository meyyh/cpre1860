
public class ReedSense {
    public static String pulse_sensors(int[][] currBoardState)
    { //returns 'A7' (example)
        Boolean change = false;
        int col_int = 0;
        int row_int = 0;
        //String output;
        while(!change)
        {
            int[] newRowState;
            for (int temp_row = 0; temp_row <= 7; temp_row++) {
                newRowState = handle_gpio(temp_row);
                col_int = compareIntArray(currBoardState[temp_row], newRowState);
                if (col_int != -1) {
                    change = true;
                    row_int = (char) temp_row;
                    break;
                }
            }

        }
        col_int += 97;
        char col_char = (char) col_int;
        String col_string = Character.toString(col_char);
        
        String row_string = String.valueOf(row_int + 1);
        
        String output = col_string + row_string;
        System.out.println(output);
        return output;
        
    }

    private static  int[] handle_gpio(int row)
    {
        int[] row_data;
        int[] boardval;

        //change
        if(row == 0 || row == 1 || row == 6 || row == 7)
        {
            row_data = new int[8];
            for (int j = 0; j < 8; ++j)
            {
                row_data[j] = 1;
            }
        }else{
            row_data = new int[8];
            for (int j = 0; j < 8; ++j)
            {
                row_data[j] = 0;
            }
        }

        if(row == 1)
        {
            row_data[3] = 0;
        }
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
