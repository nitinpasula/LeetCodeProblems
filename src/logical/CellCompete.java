package logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CellCompete {
    public static void main(String[] args){
        CellCompete c = new CellCompete();
        c.cellCompete(new int[]{1,1,1,1,1,1,1,1}, 1);
    }
    public List<Integer> cellCompete(int[] states, int days)
    {
        if ( days == 0){
            return (Arrays.stream(states).boxed().collect(Collectors.toList()));
        }
        int[] previousDayState = states;
        int [] currentState = new int[8];
        // WRITE YOUR CODE HERE
        for ( int i = 1; i <= days; i++){

            for ( int j = 0; j < 8; j++){
                if ( j == 0 ){
                    currentState[j] = 0 ^ previousDayState[j+1];
                }else if(j == 7){
                    currentState[j] = 0 ^ previousDayState[j-1];
                }
                else{
                    currentState[j] = previousDayState[j+1] ^ previousDayState[j-1];
                }

            }
            previousDayState = currentState;
        }
        return Arrays.stream(currentState).boxed().collect(Collectors.toList());

    }
}
