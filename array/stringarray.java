import java.util.Arrays;
import java.util.Scanner;

public class stringarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str= new String[3];

        for(int i = 0 ; i < str.length ; i++){
            str[i]=in.next();
        }

        for(int i = 0 ; i < str.length ; i++){
            System.out.println(str[i]+" ");
        }

        System.out.println(Arrays.toString(str));

    }
}
