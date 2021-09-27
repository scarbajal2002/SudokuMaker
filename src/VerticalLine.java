import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VerticalLine {
    public HorizontalLine horizontalNum;
    public HorizontalLine prevHor;
    public ArrayList<Integer> columns = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    public ArrayList<Integer> columns2 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    public ArrayList<Integer> columns3 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    public ArrayList<Integer> columns4 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    public ArrayList<Integer> columns5 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    public ArrayList<Integer> columns6 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    public ArrayList<Integer> columns7 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    public ArrayList<Integer> columns8 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    public ArrayList<Integer> columns9 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
    /*public VerticalLine(HorizontalLine x){
            horizontalNum = new HorizontalLine();
            prevHor = x;
            columns.set(x.hor[0][0]-1,1);
            columns2.set(x.hor[0][1]-1,1);
            columns3.set(x.hor[0][2]-1,1);
            columns4.set(x.hor[1][0]-1,1);
            columns5.set(x.hor[1][1]-1,1);
            columns6.set(x.hor[1][2]-1,1);
            columns7.set(x.hor[2][0]-1,1);
            columns8.set(x.hor[2][1]-1,1);
            columns9.set(x.hor[2][2]-1,1);

        while(columns.get(horizontalNum.hor[0][0]-1) == 1 || columns2.get(horizontalNum.hor[0][1]-1) == 1 || columns3.get(horizontalNum.hor[0][2]-1) == 1 || columns4.get(horizontalNum.hor[1][0]-1) == 1
                || columns5.get(horizontalNum.hor[1][1]-1) == 1 || columns6.get(horizontalNum.hor[1][2]-1) == 1
                || columns7.get(horizontalNum.hor[2][0]-1) == 1 || columns8.get(horizontalNum.hor[2][1]-1) == 1
                || columns9.get(horizontalNum.hor[2][2]-1) == 1){
                    horizontalNum = new HorizontalLine();
            }

    }*/

    public void fullGridString() {
        for (int i = 0; i < 9; i++) {
            this.verticalOrg();
            if ((i + 1) % 3 == 0) {
                System.out.println("─────────────────────────");
            }
        }
    }

    public void verticalOrg() {
        ArrayList<Integer> columns = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns2 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns3 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns4 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns5 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns6 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns7 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns8 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        ArrayList<Integer> columns9 = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0));
        for (int i = 0; i < 9; i++) {
            horizontalNum = new HorizontalLine();
            if(i != 0){
                while(columns.get(horizontalNum.hor[0][0]-1) == 1 || columns2.get(horizontalNum.hor[0][1]-1) == 1 || columns3.get(horizontalNum.hor[0][2]-1) == 1 || columns4.get(horizontalNum.hor[1][0]-1) == 1
                || columns5.get(horizontalNum.hor[1][1]-1) == 1 || columns6.get(horizontalNum.hor[1][2]-1) == 1
                || columns7.get(horizontalNum.hor[2][0]-1) == 1 || columns8.get(horizontalNum.hor[2][1]-1) == 1
                        || columns9.get(horizontalNum.hor[2][2]-1) == 1){
                    horizontalNum = new HorizontalLine();
                }
                columns.set(horizontalNum.hor[0][0]-1,1);
                columns2.set(horizontalNum.hor[0][1]-1,1);
                columns3.set(horizontalNum.hor[0][2]-1,1);
                columns4.set(horizontalNum.hor[1][0]-1,1);
                columns5.set(horizontalNum.hor[1][1]-1,1);
                columns6.set(horizontalNum.hor[1][2]-1,1);
                columns7.set(horizontalNum.hor[2][0]-1,1);
                columns8.set(horizontalNum.hor[2][1]-1,1);
                columns9.set(horizontalNum.hor[2][2]-1,1);
                System.out.println(horizontalNum.toString());

            }else {
                columns.set((horizontalNum.hor[0][0]-1),1);
                columns2.set(horizontalNum.hor[0][1]-1,1);
                columns3.set(horizontalNum.hor[0][2]-1,1);
                columns4.set(horizontalNum.hor[1][0]-1,1);
                columns5.set(horizontalNum.hor[1][1]-1,1);
                columns6.set(horizontalNum.hor[1][2]-1,1);
                columns7.set(horizontalNum.hor[2][0]-1,1);
                columns8.set(horizontalNum.hor[2][1]-1,1);
                columns9.set(horizontalNum.hor[2][2]-1,1);
                System.out.println(horizontalNum.toString());
            }
            if((i+1) %3 == 0){
                System.out.println("─────────────────────────");
            }
        }
    }
}
