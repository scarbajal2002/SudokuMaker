import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HorizontalLine {

    public int[][] hor;

    public HorizontalLine(){
        this.hor = createHorizontalStringGrid();
    }
    public int[][] createHorizontalStringGrid(){
        Random rand = new Random();
        int upperbound = 10;
        int[][] horizontalRet = new int[3][3];
        for(int j = 0;j<9;j++){
            int[][] horizontal = new int[3][3];
            ArrayList<Integer> horizontalCheck = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
            for(int i = 0;i< horizontal.length;i++) {
                for(int z = 0;z< horizontal.length;z++) {
                    int int_random = rand.nextInt(upperbound);
                    if(int_random == 0){
                        while(int_random == 0) {
                            int_random = rand.nextInt(upperbound);
                        }
                    }
                    if(horizontalCheck.get(int_random-1) == 1){
                        while(horizontalCheck.get(int_random-1) == 1){
                            int_random = rand.nextInt(upperbound);
                            if(int_random == 0){
                                int_random++;
                            }
                        }
                        horizontalCheck.set(int_random-1,1);
                    }
                    else if(horizontalCheck.get(int_random -1) == 0){
                        horizontalCheck.set(int_random-1,1);
                    }
                    horizontal[i][z] = int_random;
                    horizontalRet = horizontal;
                }
            }
        }
        return horizontalRet;
    }

    public String toString(){
        String printing = "|";
        int[][] horizontalRet = this.hor;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                if ((j+1)%3 == 0){
                    printing = printing + " " + horizontalRet[i][j] + " |";
                } else{
                    printing = printing + " " + horizontalRet[i][j];
                }
            }
        }
        return printing;
    }
}
