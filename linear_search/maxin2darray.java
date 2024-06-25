import java.util.Arrays;

public class maxin2darray {
    public static void main(String[] args) {
        int array[][]={
                {4,5,8,77},
                {12,25,55,754},
                {13,3451,21,22},
                {40,41,42}
        };

        int ans = max(array);

        System.out.println(ans);
    }
    static int max(int array[][]){
        int maxi=array[0][0];
        for(int row=0 ; row < array.length ; row ++){
            for(int col = 0; col<array[row].length;col++){
                if (array[row][col]>maxi){
                    maxi=array[row][col];
                }
            }
        }
        return maxi;

}}
