import java.util.ArrayList;
import java.util.Arrays;

public class GridMaker {
    public void makeGrid(){
        /*ArrayList<Integer> columns = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns2 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns3 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns4 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns5 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns6 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns7 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns8 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns9 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        HorizontalLine lastHor = new HorizontalLine();
        for(int i = 0; i<4;i++){
            HorizontalLine newHor = new HorizontalLine();
            VerticalLine newVert = new VerticalLine(newHor);
            if(i != 0){
                newVert = new VerticalLine(lastHor);
            }
            columns.set(newVert.prevHor.hor[0][0]-1,1);
            while(columns.get(newVert.horizontalNum.hor[0][0]-1) == 1 || columns2.get(newVert.horizontalNum.hor[0][1]-1) == 1 || columns3.get(newVert.horizontalNum.hor[0][2]-1) == 1 || columns4.get(newVert.horizontalNum.hor[1][0]-1) == 1
                    || columns5.get(newVert.horizontalNum.hor[1][1]-1) == 1 || columns6.get(newVert.horizontalNum.hor[1][2]-1) == 1
                    || columns7.get(newVert.horizontalNum.hor[2][0]-1) == 1 || columns8.get(newVert.horizontalNum.hor[2][1]-1) == 1
                    || columns9.get(newVert.horizontalNum.hor[2][2]-1) == 1){
                newVert.horizontalNum = new HorizontalLine();
            }
            lastHor = newVert.horizontalNum;
            System.out.println(newHor);
            System.out.println(newVert.horizontalNum);

        }
        VerticalLine lastVert = new VerticalLine(lastHor);
        /*for(int i = 0;i<5;i++){
            VerticalLine newVert = new VerticalLine();
            System.out.println(newVert.horizontalNum);
        }*/
    }
}
