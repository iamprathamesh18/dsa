import java.util.Arrays;

public class searchin2darray{
    public static void main(String[] args) {
        int[][] array = {
                {1,5,6},
                {55,44,66,8},
                {41,14,21,12}
        };
        int target=8;

        int[] ans= search(array,target); //format of answer {row,col}

        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] array, int target){
        for(int row=0;row< array.length;row++){
            for (int col = 0; col<array[row].length;col++){
                if (array[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

