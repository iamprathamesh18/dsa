import java.util.Arrays;
import java.util.Scanner;

public class pracs2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];

        for(int j=0;j<arr.length;j++){
            arr[j]=in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
