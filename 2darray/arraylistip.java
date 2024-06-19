import java.util.ArrayList;
import java.util.Scanner;

public class arraylistip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> ipex = new ArrayList<>(5);

        for(int i=0;i<5;i++){
            ipex.add(in.nextInt());
        }

        System.out.println(ipex);
    }
}
